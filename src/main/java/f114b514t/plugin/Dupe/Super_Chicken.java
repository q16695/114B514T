package f114b514t.plugin.Dupe;

import f114b514t.plugin.plugin;
import org.bukkit.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.*;
import java.util.*;

public class Super_Chicken implements Listener {
    private final Map<Entity, ItemStack> EntityItemStack = new HashMap<>();
    FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(),"chicken.yml"));
    @EventHandler
    public void PlayerInteractEntityEvent(PlayerInteractEntityEvent evt){
        if(evt.getRightClicked().getType().equals(EntityType.CHICKEN)) {
            if ((evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BLACK_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BLUE_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BROWN_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.CYAN_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.GRAY_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.GREEN_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.LIGHT_BLUE_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.LIME_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.MAGENTA_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.ORANGE_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.PINK_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.RED_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.PURPLE_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.WHITE_SHULKER_BOX)) || (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.YELLOW_SHULKER_BOX))) {
                EntityItemStack.putIfAbsent(evt.getRightClicked(), evt.getPlayer().getInventory().getItemInMainHand());
                EntityItemStack.replace(evt.getRightClicked(), evt.getPlayer().getInventory().getItemInMainHand());
                evt.getRightClicked().setCustomName(EntityItemStack.get(evt.getRightClicked()).getItemMeta().getDisplayName());
                yaml.set("chicken",EntityItemStack);
                try {
                    yaml.save("chicken.yml");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        Item item = (Item)evt.getRightClicked().getWorld().spawnEntity(evt.getRightClicked().getLocation(),EntityType.DROPPED_ITEM);
                        item.setItemStack(yaml.getItemStack(evt.getRightClicked().getUniqueId().toString()));
                        evt.getRightClicked().getWorld().spawn(evt.getRightClicked().getLocation(), item.getClass());
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.runTaskTimerAsynchronously(plugin.getPlugin(plugin.class),0,10);
            }
        }
    }
    @EventHandler
    public void OnEntityDeath(EntityDeathEvent evt){
        if(evt.getEntityType().equals(EntityType.CHICKEN)){
            if(EntityItemStack.containsKey(evt.getEntity())) {
                evt.getEntity().getKiller().getInventory().addItem(EntityItemStack.get(evt.getEntity()));
                EntityItemStack.remove(evt.getEntity());
            }
        }
    }
    @EventHandler
    public void Break(BlockBreakEvent evt){
        if((evt.getBlock().getType().equals(Material.BEDROCK))||(evt.getBlock().getType().equals(Material.ENDER_PORTAL))){
            evt.setCancelled(true);
        }
    }
    @EventHandler
    public void BannerHead(PlayerInteractEvent evt){
        if(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BANNER)) {
            if (evt.getPlayer().getInventory().getHelmet() != null) {
                evt.getPlayer().getInventory().setItemInMainHand(evt.getPlayer().getInventory().getHelmet());
            }
            evt.getPlayer().getInventory().setHelmet(evt.getPlayer().getInventory().getItemInMainHand());
        }
    }
}