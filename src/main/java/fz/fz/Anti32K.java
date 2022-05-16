package fz.fz;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class Anti32K implements Listener {
    @EventHandler
    public void Anti32kDamage(PlayerItemDamageEvent evt){
        for(Enchantment enchantment : evt.getItem().getEnchantments().keySet()){
            if(evt.getItem().getEnchantments().get(enchantment)> enchantment.getMaxLevel()){
                evt.getPlayer().getInventory().remove(evt.getItem());
            }
        }
    }
}
