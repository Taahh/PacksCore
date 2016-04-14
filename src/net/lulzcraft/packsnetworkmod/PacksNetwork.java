package net.lulzcraft.packsnetworkmod;

import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.lulzcraft.packsnetworkmod.command.Command_packscore;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;
import org.bukkit.plugin.PluginManager;

public class PacksNetwork extends AeroPlugin<PacksNetwork> 
{
    public static PacksNetwork plugin;
    public static AeroCommandHandler handler;
    //
    public Loggers logger;
    //
    public YamlConfig mainConfig;
    
    @Override
    public void load()
    {
        PacksNetwork.plugin = this;
        Loggers.info(plugin.getName() + " has been loaded");
        mainConfig = new YamlConfig(plugin, "config.yml");
    }
    
    @Override
    public void enable()
    {
        PacksNetwork.plugin = this;
        mainConfig.load();
        
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.loadFrom(Command_packscore.class.getPackage());
        handler.registerAll();
        
        Loggers.info(plugin.getName() + " has been enabled");
        Loggers.info(plugin.getName() + " v" + plugin.getVersion() + " created by " + plugin.getAuthor());
                
    }
    
    @Override
    public void disable()
    {
        PacksNetwork.plugin = null;
        Loggers.info(plugin.getName() + "disabled");
    }
}
