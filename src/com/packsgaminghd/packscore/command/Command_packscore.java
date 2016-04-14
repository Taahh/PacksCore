package com.packsgaminghd.packscore.command;

import com.packsgaminghd.packscore.PacksCore;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(description = "Shows information about PacksCore", source = SourceType.ANY)
public class Command_packscore extends SimpleCommand<PacksCore> {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        sender.sendMessage(ChatColor.GOLD + plugin.getName() + " v" + plugin.getVersion());
        sender.sendMessage(ChatColor.RED + "PacksCore was created by " + plugin.getAuthors());
        sender.sendMessage(ChatColor.BLUE + "Running on server: PacksNetwork");
        return true;
    }
    
}
