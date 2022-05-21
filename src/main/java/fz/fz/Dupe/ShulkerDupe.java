package fz.fz.Dupe;

import fz.fz.Fz;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ShulkerDupe implements Listener {
    private final Map<Player, Integer> integers = new HashMap<>();
    private int o=0;
    @EventHandler
    public void onBreak(BlockPlaceEvent evt){
        integers.putIfAbsent(evt.getPlayer(), 0);
        integers.replace(evt.getPlayer(), 0);
        if((evt.getBlock().getType().equals(Material.BLACK_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.BLUE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.BROWN_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.CYAN_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.GRAY_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.GREEN_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.LIGHT_BLUE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.LIME_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.MAGENTA_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.ORANGE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.PINK_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.RED_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.PURPLE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.WHITE_SHULKER_BOX))||(evt.getBlock().getType().equals(Material.YELLOW_SHULKER_BOX))){
            o++;
            integers.replace(evt.getPlayer(), o);
            if (integers.get(evt.getPlayer()) == (YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"))).getInt("shulkerdupe")) {
                evt.getPlayer().getInventory().addItem(evt.getItemInHand());
                integers.replace(evt.getPlayer(),0);
                o=0;
            }
        }
    }
}
