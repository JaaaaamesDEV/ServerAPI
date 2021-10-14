package net.minecrime.serverapi.listener;

import net.minecrime.serverapi.manager.DataManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEvent implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);

        Player player = event.getPlayer();

        if(player.isOp()) { //clause activated if operator-player left the server.
            System.out.println(DataManager.pr + "§cA Operator has left the actual server!");
        }

    }
}
