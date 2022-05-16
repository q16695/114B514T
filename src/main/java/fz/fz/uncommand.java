package fz.fz;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.io.File;

public class uncommand implements Listener {
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent evt){
        FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(Fz.getPlugin(Fz.class).getDataFolder(),"config.yml"));
        for(String str : yaml.getStringList("uncommand")){
            if(!evt.getPlayer().hasPermission("114b514t.uncommand.bypass")) {
                if (evt.getMessage().equals(str)) {
                    evt.setCancelled(true);
                    evt.getPlayer().sendMessage(ChatColor.RED + "未知命令！请使用/help查询");
                    break;
                }
            }
        }
    }
}
