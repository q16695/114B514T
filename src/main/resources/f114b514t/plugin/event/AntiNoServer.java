package f114b514t.plugin.event;

import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AntiNoServer implements Listener {
    Map<Chunk,Integer> PISTON = new HashMap<>();
    private Set<Block> block = new HashSet<>();
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
    @EventHandler
    public void AntiEMP(BlockPlaceEvent evt){
        if(evt.getBlockPlaced().getType().equals(Material.PISTON_STICKY_BASE)){
            PISTON.putIfAbsent(evt.getBlockPlaced().getChunk(),1);
            PISTON.replace(evt.getBlockPlaced().getChunk(),PISTON.get(evt.getBlockPlaced().getChunk())+1);
            if(PISTON.get(evt.getBlockPlaced().getChunk())>16){
                evt.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void eee(BlockBreakEvent evt){
        if(evt.getBlock().getType().equals(Material.PISTON_STICKY_BASE)){
            PISTON.replace(evt.getBlock().getChunk(), PISTON.get(evt.getBlock().getChunk())-1);
        }
    }
}