package fz.fz.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.HashSet;
import java.util.Set;

public class Cooldown implements Listener {
    private Set<Player> playerSet = new HashSet<>();
    private Set<Player> Set = new HashSet<>();
    @EventHandler
    public void ChatCooldown(AsyncPlayerChatEvent evt){
        if(playerSet.contains(evt.getPlayer())){
            evt.getPlayer().sendMessage(ChatColor.RED+"冷却中");
            evt.setCancelled(true);
        }
        else {
            playerSet.add(evt.getPlayer());
        }
        new Thread(() -> {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            playerSet.remove(evt.getPlayer());
        }).start();
    }
    @EventHandler
    public void CommandCoolddown(PlayerCommandPreprocessEvent evt){
        if(Set.contains(evt.getPlayer())){
            evt.getPlayer().sendMessage(ChatColor.RED+"冷却中");
            evt.setCancelled(true);
        }
        else {
            Set.add(evt.getPlayer());
        }
        new Thread(() -> {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Set.remove(evt.getPlayer());
        }).start();
    }
}
