package fz.fz;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatxiaohua implements Listener {
    @EventHandler
    public void sb303(AsyncPlayerChatEvent evt){
        if(evt.getMessage().startsWith("SB303")){
            evt.getPlayer().kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        }
        else if(evt.getMessage().startsWith("我是傻逼")){
            evt.getPlayer().setGameMode(GameMode.CREATIVE);
        }
        else if(evt.getMessage().startsWith("114B514T是什么破烂服务器")){
            evt.getPlayer().kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        }
        else if(evt.getMessage().startsWith("傻逼服主")){
            evt.getPlayer().kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        }
    }
}
