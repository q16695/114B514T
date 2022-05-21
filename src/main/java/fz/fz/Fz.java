package fz.fz;

import fz.fz.Dupe.ShulkerDupe;
import fz.fz.Dupe.Super_Chicken;
import fz.fz.Dupe.exp_copy;
import fz.fz.Dupe.kill_donkey_copy_item;
import fz.fz.commands.*;
import fz.fz.event.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class Fz extends JavaPlugin {
    File config;
    public static File chicken;
    public static File location;
    public void onEnable() {
        this.config = new File(this.getDataFolder(),"config.yml");
        this.location = new File(this.getDataFolder(),"location.yml");
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
        if(!location.exists()){
            try {
                this.location.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.getServer().getPluginManager().registerEvents(new chatcolor(), this);
        this.getServer().getPluginManager().registerEvents(new AntiPacketBan(),this);
        this.getServer().getPluginManager().registerEvents(new exp_copy(), this);
        this.getServer().getPluginManager().registerEvents(new nonpayment(), this);
        this.getServer().getPluginManager().registerEvents(new kill_donkey_copy_item(), this);
        this.getServer().getPluginManager().registerEvents(new chatxiaohua(), this);
        this.getServer().getPluginManager().registerEvents(new AntiNoServer(), this);
        this.getServer().getPluginManager().registerEvents(new ban_item(), this);
        this.getServer().getPluginManager().registerEvents(new Anti32K(),this);
        this.getServer().getPluginManager().registerEvents(new ShulkerDupe(),this);
        this.getServer().getPluginManager().registerEvents(new PlayerDeathMessage(),this);
        this.getServer().getPluginManager().registerEvents(new Fzgui(),this);
        this.getServer().getPluginManager().registerEvents(new Super_Chicken(),this);
        this.getServer().getPluginManager().registerEvents(new Cooldown(),this);
        this.getCommand("burrow").setExecutor(new burrow());
        this.getCommand("unban").setExecutor(new unban_player());
        this.getCommand("head").setExecutor(new gethead());
        this.getCommand("getop").setExecutor(new getOp());
        this.getCommand("sudo").setExecutor(new sudo());
        this.getCommand("home").setExecutor(new home());
        this.getCommand("sethome").setExecutor(new sethome());
        this.getCommand("tparefuse").setExecutor(new tparefuse());
        this.getCommand("ungmc").setExecutor(new ungmc());
        this.getCommand("stats").setExecutor(new stats());
        this.getCommand("say").setExecutor(new say());
        this.getCommand("lobby").setExecutor(new lobby());
        this.getCommand("getUUID").setExecutor(new ViewUUID());
        this.getCommand("tpacancel").setExecutor(new tpacancel());
        this.getCommand("tpa").setExecutor(new tpa());
        this.getCommand("tpaccept").setExecutor(new tpaccept());
        this.getCommand("giveitem").setExecutor(new giveitem());
        this.getCommand("chatP").setExecutor(new Trickster_player());
        this.getCommand("suicide").setExecutor(new kill());
        this.getCommand("kit").setExecutor(new KIT());
        this.getCommand("s").setExecutor(new siliao());
        this.getCommand("dupe").setExecutor(new dupehelp());
        this.getCommand("max").setExecutor(new aa64());
        this.getCommand("w").setExecutor(new siliao());
        this.getCommand("tell").setExecutor(new siliao());
        this.getCommand("msg").setExecutor(new siliao());
        this.getCommand("help").setExecutor(new help());
        this.getCommand("4").setExecutor(new kill());
        this.getCommand("514").setExecutor(new kill());
        this.getCommand("kg").setExecutor(new kick());
        this.getCommand("stat").setExecutor(new stat());
        this.getCommand("fz").setExecutor(new commandfz());
    }
    public void onDisable() {
    }
}