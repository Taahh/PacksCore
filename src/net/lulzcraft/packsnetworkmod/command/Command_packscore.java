package net.lulzcraft.packsnetworkmod.command;

import net.lulzcraft.packsnetworkmod.PacksNetwork;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.SimpleCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_packscore extends SimpleCommand<PacksNetwork> {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        sender.sendMessage(ChatColor.GOLD + "-=-=-PacksCore-=-=-");
        sender.sendMessage(ChatColor.RED + "PacksCore was created by " + plugin.getAuthor());
        sender.sendMessage(ChatColor.BLUE + "Running on server: PacksNetwork");
        return true;
    }
    
}
