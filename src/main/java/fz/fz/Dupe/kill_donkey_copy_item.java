package fz.fz.Dupe;

import fz.fz.Fz;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.io.File;

public class kill_donkey_copy_item implements Listener {
    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent evt){
        if ((YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"))).getBoolean("kill_donkey_copy")) {
                if ((evt.getEntity().getType().equals(EntityType.DONKEY))||(evt.getEntity().getType().equals(EntityType.LLAMA))) {
                    for (ItemStack item : evt.getDrops()) {
                        evt.getEntity().getKiller().getInventory().addItem(item);
                    }
                }
            }
        else {
            evt.getEntity().getKiller().sendMessage(ChatColor.DARK_RED + "[" + ChatColor.DARK_RED + (YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"))).getString("server_name") + ChatColor.DARK_RED + "]杀驴复制未启用");
        }
    }
}