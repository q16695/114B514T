package fz.fz;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.ChestedHorse;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.List;

public class kill_donkey_copy_item implements Listener {
    FileConfiguration ymal = YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"));
    String servername = ymal.getString("server_name");
    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent event){
        if(event.getEntity().hasPermission("114b514t.donkey_copy.use")) {
            if (ymal.getBoolean("kill_donkey_copy")) {
                if (event.getEntity().getKiller() != null) {
                    event.setDroppedExp(event.getDroppedExp());
                } else {
                    Entity entity = event.getEntity();
                    Player player = event.getEntity().getKiller();
                    if (entity instanceof ChestedHorse) {
                        List<ItemStack> inventory = event.getDrops();
                        for (ItemStack item : inventory) {
                            player.getInventory().addItem(item);
                        }
                    }
                    if (entity instanceof Llama) {
                        List<ItemStack> inventory = event.getDrops();
                        for (ItemStack item : inventory) {
                            player.getInventory().addItem(item);
                        }
                    }
                }
            } else {
                if (event.getEntity() instanceof Player) {
                    event.getEntity().sendMessage(ChatColor.DARK_RED + "[" + ChatColor.DARK_RED + servername + ChatColor.DARK_RED + "]杀驴复制未启用");
                }
            }
        }
        else if(event.getEntity() instanceof Player){
            event.getEntity().sendMessage(ChatColor.DARK_RED+"你没有权限");
        }
    }
}