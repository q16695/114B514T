package f114b514t.plugin.Dupe;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.HashMap;
import java.util.Map;

public class ShulkerDupe implements Listener {
    private final Map<String, Integer> integers = new HashMap<>();
    @EventHandler
    public void onBreak(BlockPlaceEvent evt){
        if((evt.getBlock().getType().equals(Material.BLACK_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.BLUE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.BROWN_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.CYAN_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.GRAY_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.GREEN_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.LIGHT_BLUE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.LIME_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.MAGENTA_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.ORANGE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.PINK_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.RED_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.PURPLE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.WHITE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.YELLOW_SHULKER_BOX))){
            if(!integers.containsKey(evt.getPlayer().getName())) {
                integers.putIfAbsent(evt.getPlayer().getName(), 0);
            }
            if (integers.get(evt.getPlayer().getName()) == 5) {
                evt.getPlayer().getInventory().addItem(evt.getItemInHand());
                integers.replace(evt.getPlayer().getName(),0);
            }
            integers.replace(evt.getPlayer().getName(), integers.get(evt.getPlayer().getName())+1);
        }
    }
}
