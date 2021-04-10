package com.github.l3nnartt.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("heal").setExecutor(new CommandHeal());
        getLogger().log(Level.INFO, "Plugin has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().log(Level.INFO, "Plugin wurde deaktiviert");
    }
}