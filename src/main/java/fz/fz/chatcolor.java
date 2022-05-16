package fz.fz;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatcolor implements Listener{
    @EventHandler
    public void onChat(AsyncPlayerChatEvent evt){
        if(evt.getPlayer().hasPermission("114b514t.vip.name")){
            evt.setFormat("<" + ChatColor.DARK_PURPLE + evt.getPlayer().getName() + ChatColor.WHITE +  "> " + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.admin.name")){
            evt.setFormat("<" + ChatColor.YELLOW + evt.getPlayer().getName() + ChatColor.WHITE +  "> " + evt.getMessage());
        }
        else if((evt.getPlayer().hasPermission("114b514t.chat-green.use")) && (evt.getPlayer().hasPermission("chat-light-green-name.use"))){
            evt.setFormat(ChatColor.GREEN + evt.getFormat());
        }
        else if(evt.getPlayer().hasPermission("114b514t.chat-light-green-name.use")){
            evt.setFormat("<" + ChatColor.GREEN + evt.getPlayer().getName() + ChatColor.WHITE + "> " + ChatColor.WHITE + evt.getMessage());
        }
        else if(evt.getPlayer().hasPermission("114b514t.green-chat-use.use")) {
            evt.setMessage(ChatColor.GREEN + evt.getMessage());
        }
    }
    @EventHandler
    public void ChatPreFix(AsyncPlayerChatEvent evt){
        if(evt.getMessage().startsWith(">")){
            evt.setMessage(ChatColor.GREEN+evt.getMessage());
        }
        else if(evt.getMessage().startsWith(":")){
            evt.setMessage(ChatColor.LIGHT_PURPLE+evt.getMessage());
        }
        else if(evt.getMessage().startsWith("'")){
            evt.setMessage(ChatColor.GOLD+evt.getMessage());
        }
    }
}
