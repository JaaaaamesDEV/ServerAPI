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
        }

    }
}
