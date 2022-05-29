package f114b514t.plugin.event;

import f114b514t.plugin.plugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class nonpayment implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent evt) {
        evt.setJoinMessage("");
        evt.getPlayer().addAttachment(plugin.getPlugin(plugin.class),"bukkit.command.tps",true);
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.setQuitMessage("");
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent evt){
        if(evt.getEntity().hasPermission("114b514t.nokeepinventory.use")){
            evt.setKeepInventory(false);
        }
    }
}
