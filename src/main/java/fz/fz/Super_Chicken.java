package fz.fz;

import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class Super_Chicken implements Listener {
    private Boolean aBoolean = false;
    private final Map<Entity, ItemStack> EntityItemStack = new HashMap<>();
    @EventHandler
    public void PlayerInteractEntityEvent(PlayerInteractEntityEvent evt){
        if(evt.getRightClicked().getType().equals(EntityType.CHICKEN)){
            if((evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BLACK_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BLUE_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BROWN_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.CYAN_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.GRAY_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.GREEN_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.LIGHT_BLUE_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.LIME_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.MAGENTA_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.ORANGE_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.PINK_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.RED_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.PURPLE_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.WHITE_SHULKER_BOX))||(evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.YELLOW_SHULKER_BOX)))
            EntityItemStack.putIfAbsent(evt.getRightClicked(), evt.getPlayer().getInventory().getItemInMainHand());
            EntityItemStack.replace(evt.getRightClicked(), evt.getPlayer().getInventory().getItemInMainHand());
            evt.getRightClicked().setCustomName(EntityItemStack.get(evt.getRightClicked()).getItemMeta().getDisplayName());
        }
    }
}