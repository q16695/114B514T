package fz.fz.event;

import fz.fz.Fz;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;

public class chatxiaohua implements Listener {
    @EventHandler
    public void sb303(AsyncPlayerChatEvent evt){
        ArrayList<String> creeper = new ArrayList<>();
        creeper.add("awwww man");
        creeper.add("So way back in the mine got are pickaxe swingin' from side to side");
        creeper.add("ss2s");
        creeper.add("Night night diamonds tonight");
        creeper.add("Heads up");
        creeper.add("You hear a sound turn around and look up");
        creeper.add("Total shock fills your body");
        creeper.add("Oh no it's you again I can never forget those eyes");
        creeper.add("Eyes eyes eyes eyes eyes");
        creeper.add("'Cause baby tonight the creeper's");
        creeper.add("Tryin' to steal all your stuff again");
        creeper.add("'Cause baby tonight");
        creeper.add("Grab your pick shovel and bolt again");
        creeper.add("Bolt again gain");
        creeper.add("And run run until it's done done");
        creeper.add("Until the sun comes up in the morn'");
        if(evt.getMessage().startsWith("SB303")){
            evt.getPlayer().kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        }
        else if(evt.getMessage().startsWith("114B514T是什么破烂服务器")){
            evt.getPlayer().kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        }
        else if(evt.getMessage().startsWith("傻逼服主")){
            evt.getPlayer().kickPlayer(ChatColor.RED+"[114B514T]"+ChatColor.GOLD+"你成功踢出了你这个傻逼");
        }
        else if(evt.getMessage().startsWith("我是傻逼")){
            if(evt.getPlayer().hasPermission("114b514t.wssb.use")){
                evt.getPlayer().setGameMode(GameMode.CREATIVE);
            }
        }
        else if(((ChatColor.RESET+evt.getMessage()).startsWith("creeper?"))||(((ChatColor.RESET)+evt.getMessage()).equals("creeper?"))){
            for(String str : creeper){
                evt.getPlayer().chat(str);
                try {
                    Thread.sleep(3001L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
