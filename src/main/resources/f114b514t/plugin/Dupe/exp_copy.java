package f114b514t.plugin.Dupe;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;

public class exp_copy implements Listener {
    @EventHandler
    public void PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
        if(event.getPlayer().hasPermission("114b514t.exp_dupe.use")) {
            if (event.getPlayer().getInventory().getItemInOffHand().getType() == Material.TOTEM) {
                event.getPlayer().sendMessage(ChatColor.DARK_RED + "[Fz]请你不要当TOTEM GOD");
            } else if (event.getNewLevel() - event.getOldLevel() == 1) {
                (event.getPlayer()).getInventory().addItem(((event.getPlayer()).getInventory().getItemInOffHand()));
            }
        }
    }
    @EventHandler
    public void onShaoFoodLevel(FoodLevelChangeEvent evt){
        if(evt.getEntity() instanceof Player){
            if(evt.getEntity().hasPermission("infinitefoodlevel.use")){
                evt.setCancelled(true);
            }
        }
    }
}