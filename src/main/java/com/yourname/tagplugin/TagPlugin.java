package com.yourname.tagplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TagPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("TagPlugin 활성화됨 (v1.0.0)");
        this.getCommand("settag").setExecutor(new TagCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("TagPlugin 비활성화됨");
    }
}
