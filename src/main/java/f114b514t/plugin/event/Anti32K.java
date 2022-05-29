package f114b514t.plugin.event;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;

import java.util.Map;

public class Anti32K implements Listener {
    @EventHandler
    public void Anti32kDamage(PlayerItemDamageEvent evt){
        for(Enchantment enchantment : evt.getItem().getEnchantments().keySet()){
            if(evt.getItem().getEnchantments().get(enchantment)> enchantment.getMaxLevel()){
                evt.getPlayer().getInventory().remove(evt.getItem());
            }
        }
    }
    @EventHandler
    public void Anti32kKill(EntityDeathEvent evt){
        if(evt.getEntity() instanceof Player){
            for(Map.Entry<Enchantment,Integer> enchantment : (((Player) evt.getEntity()).getInventory().getItemInMainHand().getEnchantments().entrySet())) {
                if(enchantment.getValue()>enchantment.getKey().getMaxLevel()){
                    ((Player) evt.getEntity()).getInventory().remove(((Player) evt.getEntity()).getInventory().getItemInMainHand());
                }
            }
        }
    }
}
