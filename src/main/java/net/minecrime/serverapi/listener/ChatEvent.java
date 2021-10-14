package net.minecrime.serverapi.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    public void onChat(AsyncPlayerChatEvent event) {

        final Player p = event.getPlayer();
        final String message = event.getMessage().replace("%", "%%");
// ------------------------ Team-Ranks ------------------------  //
        if(p.hasPermission("server.admin")) {
            event.setFormat("§4§lAdmin §7● §4§l" + p.getName() + " §8» §f");
            return;
        } else if(p.hasPermission("server.manager")) {
            // The rank "Manager" contains all members who lead a group -> Moderation, Development, Building
            event.setFormat("§9§lManager §7● §9§l" + p.getName() + " §8» §f");
            return;
        } else if(p.hasPermission("server.developer")) {
            event.setFormat("§b§lDeveloper §7● §b§l" + p.getName() + " §8» §f");
            return;
        } else if(p.hasPermission("server.moderator")) {
            event.setFormat("§c§lModerator §7● §c§l" + p.getName() + " §8» §f");
            return;
        } else if(p.hasPermission("server.guide")) {
            event.setFormat("§a§lGuide §7● §a§l" + p.getName() + " §8» §f");
            return;
        } else if(p.hasPermission("server.jrdeveloper")) {
            event.setFormat("§b§lDeveloper §7● §b§l" + p.getName() + " §8» §f");
            return;
        } else if(p.hasPermission("server.jrguide")) {
            event.setFormat("§a§lGuide §7● §a§l" + p.getName() + " §8» §f");
            return;
// ------------------------ Player-Ranks ------------------------ //
        } else if(p.hasPermission("server.specialist")) {
            event.setFormat("§d§lSpecialist §7● §d§l" + p.getName() + " §8» §f");
            return;
        }  else if(p.hasPermission("server.specialist")) {
            event.setFormat("§d§lSpecialist §7● §d§l" + p.getName() + " §8» §f");
            return;
        }


    }

}
