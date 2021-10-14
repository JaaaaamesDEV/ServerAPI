package net.minecrime.serverapi.main;

import net.minecrime.serverapi.command.ServerAPI_CMD;
import net.minecrime.serverapi.manager.DataManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getConsoleSender().sendMessage(DataManager.pr + "§aPlugin wurde aktiviert!");
        Bukkit.getConsoleSender().sendMessage(DataManager.pr + "§aPlugin programmiert von Segyn");

        onRegCommand();
        onRegListener();
    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(DataManager.pr + "§cPlugin wurde deaktiviert!");
        Bukkit.getConsoleSender().sendMessage(DataManager.pr + "§aPlugin programmiert von Segyn");

        onRegCommand();
        onRegListener();

    }

    public void onRegCommand() {
        Bukkit.getPluginCommand("serverapi").setExecutor(new ServerAPI_CMD());
    }

    public void onRegListener() {

    }

    public static Main getInstance() {
        return instance;
    }
}
