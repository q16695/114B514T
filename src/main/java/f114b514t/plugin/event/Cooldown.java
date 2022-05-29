package f114b514t.plugin.event;

import f114b514t.plugin.plugin;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Cooldown implements Listener {
    private final Set<Player> playerSet = new HashSet<>();
    private final Set<Player> Set = new HashSet<>();
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder()+"/config.yml"));
    Boolean ConsoleBoolean = false;
    Boolean Allow_Command = false;
    @EventHandler
    public void ChatCooldown(AsyncPlayerChatEvent evt){
        if (playerSet.contains(evt.getPlayer())) {
            evt.getPlayer().sendMessage(ChatColor.RED + "冷却中");
            evt.setCancelled(true);
        } else {
            playerSet.add(evt.getPlayer());
        }
        new Thread(() -> {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            playerSet.remove(evt.getPlayer());
        }).start();
    }
    @EventHandler
    public void CommandCoolddown(PlayerCommandPreprocessEvent evt) {
        if(!evt.getPlayer().hasPermission("114b514t.uncommand.bypass")) {
            for (String str : yamlConfiguration.getStringList("consolecommands")) {
                if (evt.getMessage().contains("/" + str)) {
                    ConsoleBoolean = true;
                }
            }
            for (String str : yamlConfiguration.getStringList("allow-commands")) {
                if (evt.getMessage().contains("/" + str)) {
                    Allow_Command = true;
                }
            }
            if (!Allow_Command) {
                evt.getPlayer().sendMessage(ChatColor.RED + "I'm sorry, but this command can only use in Op. Please contact the server administrators if you believe that this is in error.");
                evt.setCancelled(true);
                Allow_Command = false;
            }
            if (ConsoleBoolean) {
                evt.setCancelled(true);
                evt.getPlayer().sendMessage(ChatColor.RED + "I'm sorry, but this command can only use in Console. Please contact the server administrators if you believe that this is in error.");
                ConsoleBoolean = false;
            } else {
                if (Set.contains(evt.getPlayer())) {
                    evt.getPlayer().sendMessage(ChatColor.RED + "冷却中");
                    evt.setCancelled(true);
                } else {
                    Set.add(evt.getPlayer());
                }
                new Thread(() -> {
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Set.remove(evt.getPlayer());
                }).start();
            }
        }
    }
}
