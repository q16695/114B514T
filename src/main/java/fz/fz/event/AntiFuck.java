package fz.fz.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.HashMap;
import java.util.Map;

public class AntiFuck implements Listener {
    Map<Player, String> playerStringMap = new HashMap<>();
    @EventHandler
    public void AntiFuckA(AsyncPlayerChatEvent evt){
         if(evt.getMessage().indexOf("妈")>0){
             evt.setCancelled(true);
             evt.getPlayer().sendMessage(ChatColor.RED+"操你妈不支持脏话[发怒][发怒][发怒]");
         }
    }
    @EventHandler
    public void AntiClearScreen(AsyncPlayerChatEvent evt){
        playerStringMap.putIfAbsent(evt.getPlayer(),evt.getMessage());
        playerStringMap.replace(evt.getPlayer(), evt.getMessage());
        if(evt.getMessage().equals(playerStringMap.get(evt.getPlayer()))){
            evt.setCancelled(true);
        }
    }
}
