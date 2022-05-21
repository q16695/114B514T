package fz.fz.event;

import fz.fz.Fz;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import java.io.File;

public class ban_item implements Listener {
    @EventHandler
    public void Ban_Item(BlockPlaceEvent evt){
        FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"));
        for(String str : yaml.getStringList("ban_item")) {
            if (evt.getBlockPlaced().getType().equals(Material.getMaterial(str))) {
                evt.setCancelled(true);
            }
        }
    }
}
