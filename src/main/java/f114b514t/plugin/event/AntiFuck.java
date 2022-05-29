package f114b514t.plugin.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AntiFuck implements Listener {
    @EventHandler
    public void Mother(AsyncPlayerChatEvent evt){
        if((evt.getMessage().contains("妈"))||(evt.getMessage().contains("傻逼"))){
            evt.setCancelled(true);
            evt.getPlayer().sendMessage(ChatColor.RED+"操你妈不支持脏话[发怒][发怒][发怒]");
        }
    }
}
