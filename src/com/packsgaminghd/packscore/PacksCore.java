package com.packsgaminghd.packscore;

import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import com.packsgaminghd.packscore.command.Command_packscore;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;

public class PacksCore extends AeroPlugin<PacksCore> 
{
    public static PacksCore plugin;
    public static AeroCommandHandler handler;
    //
    public Loggers logger;
    //
    public YamlConfig mainConfig;
    
    @Override
    public void load()
    {
        PacksCore.plugin = this;
        Loggers.info(plugin.getName() + " has been loaded");
        mainConfig = new YamlConfig(plugin, "config.yml");
    }
    
    @Override
    public void enable()
    {
        PacksCore.plugin = this;
        mainConfig.load();
        
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.loadFrom(Command_packscore.class.getPackage());
        handler.registerAll();
        
        Loggers.info(plugin.getName() + " has been enabled");
        Loggers.info(plugin.getName() + " v" + plugin.getVersion() + " created by " + plugin.getAuthors());
                
    }
    
    @Override
    public void disable()
    {
        PacksCore.plugin = null;
        Loggers.info(plugin.getName() + "disabled");
    }
}
