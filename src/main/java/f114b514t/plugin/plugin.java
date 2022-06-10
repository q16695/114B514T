package f114b514t.plugin;

import f114b514t.plugin.commands.*;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class plugin extends JavaPlugin {
    File config;
    File chicken;
    public void onEnable() {
        this.config = new File(this.getDataFolder(),"config.yml");
        this.chicken = new File(this.getDataFolder(), "chicken.yml");
        if(config.exists()){
            this.saveConfig();
        }
        if(!config.exists()){
            this.saveResource("config.yml", false);
        }
        if(!chicken.exists()){
            try {
                this.chicken.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.getServer().getPluginManager().registerEvents(new Listener(),this);
        this.getCommand("unban").setExecutor(new unban_player());
        this.getCommand("ungmc").setExecutor(new ungmc());
        this.getCommand("dupe").setExecutor(new dupehelp());
        this.getCommand("all").setExecutor(new all());
        this.getCommand("head").setExecutor(new gethead());
        this.getCommand("stats").setExecutor(new stats());
        this.getCommand("say").setExecutor(new say());
        this.getCommand("getUUID").setExecutor(new ViewUUID());
        this.getCommand("sudo").setExecutor(new sudo());
        this.getCommand("s").setExecutor(new siliao());
        this.getCommand("giveitem").setExecutor(new giveitem());
        this.getCommand("chatP").setExecutor(new Trickster_player());
        this.getCommand("kit").setExecutor(new KIT());
        this.getCommand("max").setExecutor(new aa64());
        this.getCommand("w").setExecutor(new siliao());
        this.getCommand("tell").setExecutor(new siliao());
        this.getCommand("test").setExecutor(new test());
        this.getCommand("lobby").setExecutor(new lobby());
        this.getCommand("kill").setExecutor(new kill());
        this.getCommand("test").setExecutor(new test());
        this.getCommand("getop").setExecutor(new getOp());
        this.getCommand("msg").setExecutor(new siliao());
        this.getCommand("help").setExecutor(new help());
        this.getCommand("4").setExecutor(new kill());
        this.getCommand("514").setExecutor(new kill());
        this.getCommand("kg").setExecutor(new kick());
        this.getCommand("stat").setExecutor(new stat());
        this.getCommand("fz").setExecutor(new commandfz());
        this.getCommand("fm").setExecutor(new freemen());
    }
    public void onDisable() {
    }
}