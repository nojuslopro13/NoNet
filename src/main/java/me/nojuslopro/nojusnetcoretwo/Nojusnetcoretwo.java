package me.nojuslopro.nojusnetcoretwo;


import me.clip.placeholderapi.libs.kyori.adventure.platform.bukkit.BukkitAudiences;
import me.nojuslopro.nojusnetcoretwo.annotations.Register;
import me.nojuslopro.nojusnetcoretwo.commands.*;
import me.nojuslopro.nojusnetcoretwo.listeners.*;
import me.nojuslopro.nojusnetcoretwo.tabcompletion.FlingTabCompletion;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class Nojusnetcoretwo extends JavaPlugin {
    private static Nojusnetcoretwo plugin;

    private BukkitAudiences adventure;

    public BukkitAudiences adventure() {
        if(this.adventure == null) {
            throw new IllegalStateException("Tried to access adventure while plugin is disabled");
        }
        return this.adventure;
    }

    @Override
    public void onEnable() {



        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {

            registerCommands();
            registerListeners();
        } else {
            Bukkit.getLogger().warning("Didn't find PAPI, Disabling this plugin!");
            Bukkit.getPluginManager().disablePlugin(this);
        }

        this.adventure = BukkitAudiences.create(this);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        plugin = this;
    }


    @Override
    public void onDisable() {
        if (this.adventure != null) {
            this.adventure.close();
            this.adventure = null;
        }
    }

    @Register
    public void registerCommands() {
        getCommand("unloadpack").setExecutor(new UnloadResourcePack());
        getCommand("loadpack").setExecutor(new LoadResourcePack());
        getCommand("freeze").setExecutor(new FreezeCommand());
        getCommand("lobby").setExecutor(new LobbyCommand());
        getCommand("servers").setExecutor(new ServerGuiCommand());
        getCommand("pagalba").setExecutor(new PagalbaCommand());
        getCommand("fling").setExecutor(new FlingCommand());

        getCommand("fling").setTabCompleter(new FlingTabCompletion());
    }

    @Register
    public void registerListeners() {
        getServer().getPluginManager().registerEvents(new InventoryClick(), this);
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new onPlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new onPlayerInteractListener(), this);
        getServer().getPluginManager().registerEvents(new playerFoodLevelChange(), this);
        getServer().getPluginManager().registerEvents(new onItemDrop(), this);
    }

    public static Nojusnetcoretwo getPlugin() {
        return plugin;
    }
}
