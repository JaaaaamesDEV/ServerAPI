package net.minecrime.serverapi.listener;

import net.minecrime.serverapi.manager.DataManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);

        Player player = event.getPlayer();
        if(player.isOp()) { //method if player with operator joins the server a message send to the operator
            player.sendMessage(DataManager.pr + "§aWelcome Operator!");
            player.sendMessage(DataManager.pr + "§eYou seeing this message because of having operator-rights");

            /*
            news-system should be actual.
            implement new message if sth. is new.
             */

            player.sendMessage(DataManager.pr + "§f§lNews:"); //news-system for player with operator-rights
            player.sendMessage(DataManager.pr + "§f- We got updated our bansystem! Try it out with /ban");
        }

    }
}
