package f114b514t.plugin.event;

import f114b514t.plugin.plugin;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import java.io.File;
import java.util.ArrayList;

public class ban_item implements Listener {
    ArrayList<Material> list = new ArrayList<>();
    @EventHandler
    public void Ban_Item(BlockPlaceEvent evt){
        FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(),"config.yml"));
        for(String str : yaml.getStringList("ban_item")) {
            if (evt.getBlockPlaced().getType().equals(Material.getMaterial(str))) {
                evt.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void AntiDestroy(BlockBreakEvent evt){
        list.add(Material.BEDROCK);
        list.add(Material.ENDER_PORTAL_FRAME);
        list.add(Material.ENDER_PORTAL);
        for(Material material : list) {
            if (evt.getBlock().getType().equals(material)) {
                evt.setCancelled(true);
                break;
            }
        }
    }
}
