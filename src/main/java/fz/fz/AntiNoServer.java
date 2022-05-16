package fz.fz;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class AntiNoServer implements Listener {
    @EventHandler
    public void Shulker_Box(BlockPlaceEvent evt) {
        if (evt.getBlockPlaced().getType().equals(Material.DISPENSER)) {
            if (evt.getBlockPlaced().getLocation().getY() >= 255) {
                evt.setCancelled(true);
                evt.getPlayer().sendMessage(ChatColor.DARK_RED + "想潜影盒崩服是吧");
            } else if (evt.getBlockPlaced().getLocation().getY() <= 0) {
                evt.setCancelled(true);
                evt.getPlayer().sendMessage(ChatColor.DARK_RED + "想潜影盒崩服是吧");
            }
        }
    }
    @EventHandler
    public void EntitySpawn(EntitySpawnEvent evt){
        int a=0;
        for(Entity entity:evt.getLocation().getChunk().getEntities()){
            if(entity.getType().equals(evt.getEntityType())){
                a++;
            }
        }
        if(a>=7){
            evt.setCancelled(true);
        }
    }
}