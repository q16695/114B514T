package f114b514t.plugin.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import java.util.HashSet;
import java.util.Set;

public class IIIII implements Listener {
    Set<Player> playerSet = new HashSet<>();
    @EventHandler
    public void I(PlayerRespawnEvent evt){
        if(!playerSet.contains(evt.getPlayer())){
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
    public void L(EntityDamageEvent evt){
        if((evt.getEntity() instanceof Player)&&(playerSet.contains((Player)evt.getEntity()))){
            evt.setCancelled(true);
        }
    }
}
