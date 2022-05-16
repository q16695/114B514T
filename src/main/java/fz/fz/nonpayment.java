package fz.fz;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class nonpayment implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        evt.setJoinMessage("");
        evt.getPlayer().isPermissionSet("bukkit.command.tps");
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage("");
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent evt){
        if((evt.getEntity() instanceof Player)&&(evt.getEntity().hasPermission("114b514t.nokeepinventory.use"))){
            evt.setKeepInventory(false);
        }
    }
    @EventHandler
    public void onKick(PlayerKickEvent evt){
        if(evt.getReason().equals("Time out")){
            evt.setCancelled(true);
        }
        else if(evt.getReason().equals("You are sending too many packets, :(")){
            evt.setCancelled(true);
        }
    }
}
