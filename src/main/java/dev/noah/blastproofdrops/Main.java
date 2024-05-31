package dev.noah.blastproofdrops;

import listener.ItemDamageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new ItemDamageListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
