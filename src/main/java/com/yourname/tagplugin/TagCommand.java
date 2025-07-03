package com.yourname.tagplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class TagCommand implements CommandExecutor {
    private final TagPlugin plugin;

    public TagCommand(TagPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player p)) {
            sender.sendMessage(ChatColor.RED + "플레이어만 사용할 수 있습니다.");
            return true;
        }
        if (args.length == 0) {
            p.sendMessage(ChatColor.YELLOW + "사용법: /settag <내용>");
            return true;
        }
        String tag = String.join(" ", args);
        p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', tag));
        p.setDisplayName(ChatColor.translateAlternateColorCodes('&', tag));
        p.sendMessage(ChatColor.GREEN + "네임태그가 설정되었습니다: " + tag);
        return true;
    }
}
