package com.packsgaminghd.packscore.command;

import com.packsgaminghd.packscore.PN_Util;
import com.packsgaminghd.packscore.PacksCore;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(description = "A chat for admins", 
        permission = "pnm.adminchat", 
        aliases = "o", 
        source = SourceType.ANY)
public class Command_adminchat extends SimpleCommand<PacksCore> {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Please provide a message");
            return false;
        }
        
        if (!sender.hasPermission("pnm.adminchat")) {
            sender.sendMessage(ChatColor.RED + "PacksCore :: No permission");
            return false;
        }
        
        PN_Util.adminChat(sender, StringUtils.join(args, " "));
        return true;
    }
    
}
