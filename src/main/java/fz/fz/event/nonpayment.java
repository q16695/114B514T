package fz.fz.event;

import fz.fz.Fz;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class nonpayment implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        evt.setJoinMessage(ChatColor.GREEN+"[+] "+evt.getPlayer().getName());
        evt.getPlayer().addAttachment(Fz.getPlugin(Fz.class),"bukkit.command.tps",true);
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage(ChatColor.RED+"[-] "+event.getPlayer().getName());
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent evt){
        if(evt.getEntity().hasPermission("114b514t.nokeepinventory.use")){
            evt.setKeepInventory(false);
        }
    }
}
