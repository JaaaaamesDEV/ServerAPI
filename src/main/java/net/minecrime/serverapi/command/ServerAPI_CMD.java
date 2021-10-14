package net.minecrime.serverapi.command;

import net.minecrime.serverapi.manager.DataManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerAPI_CMD implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("serverapi")) {
            Player p = (Player) commandSender;

            p.sendMessage(DataManager.pr + "§fMineCrime.net - ServerAPI");
            p.sendMessage(DataManager.pr + "§aVersion 1.0 - Programmiert von Segyn");
        }
        return false;
    }
}
