package com.packsgaminghd.packscore;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PN_Util {
    
    public static void adminChat(CommandSender sender, String message) {
        String name = sender.getName();
        
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.hasPermission("packscore.adminchat.see")) {
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "AdminChat" + ChatColor.GRAY + "] " + ChatColor.BLUE + name + ChatColor.WHITE + ": " + ChatColor.AQUA + message);
            }
            
        }
    }
    
}
