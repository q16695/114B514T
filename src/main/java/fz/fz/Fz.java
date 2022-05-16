package fz.fz;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Fz extends JavaPlugin {
    File config;
    public void onEnable() {
        this.config = new File(this.getDataFolder(),"config.yml");
        if(config.exists()){
            this.saveConfig();
        }
        if(!config.exists()){
            this.saveResource("config.yml", false);
        }
        this.getServer().getPluginManager().registerEvents(new chatcolor(), this);
        this.getServer().getPluginManager().registerEvents(new exp_copy(), this);
        this.getServer().getPluginManager().registerEvents(new nonpayment(), this);
        this.getServer().getPluginManager().registerEvents(new kill_donkey_copy_item(), this);
        this.getServer().getPluginManager().registerEvents(new chatxiaohua(), this);
        this.getServer().getPluginManager().registerEvents(new AntiNoServer(), this);
        this.getServer().getPluginManager().registerEvents(new ban_item(), this);
        this.getServer().getPluginManager().registerEvents(new Anti32K(),this);
        this.getServer().getPluginManager().registerEvents(new ShulkerDupe(),this);
        this.getServer().getPluginManager().registerEvents(new uncommand(),this);
        this.getServer().getPluginManager().registerEvents(new PlayerDeathMessage(),this);
        this.getServer().getPluginManager().registerEvents(new Super_Chicken(),this);
        this.getCommand("tparefuse").setExecutor(new tparefuse());
        this.getCommand("ungmc").setExecutor(new ungmc());
        this.getCommand("stats").setExecutor(new stats());
        this.getCommand("say").setExecutor(new say());
        this.getCommand("getUUID").setExecutor(new ViewUUID());
        this.getCommand("tpacancel").setExecutor(new tpacancel());
        this.getCommand("tpa").setExecutor(new tpa());
        this.getCommand("tpaccept").setExecutor(new tpaccept());
        this.getCommand("giveitem").setExecutor(new giveitem());
        this.getCommand("chatP").setExecutor(new Trickster_player());
        this.getCommand("kit").setExecutor(new KIT());
        this.getCommand("tps").setExecutor(new tps());
        this.getCommand("max").setExecutor(new aa64());
        this.getCommand("w").setExecutor(new siliao());
        this.getCommand("tell").setExecutor(new siliao());
        this.getCommand("msg").setExecutor(new siliao());
        this.getCommand("zanzhu").setExecutor(new zanzhu());
        this.getCommand("help").setExecutor(new help());
        this.getCommand("giveitem").setExecutor(new give_all_item());
        this.getCommand("4").setExecutor(new kill());
        this.getCommand("514").setExecutor(new kill());
        this.getCommand("kg").setExecutor(new kick());
        this.getCommand("stat").setExecutor(new stat());
        this.getCommand("fz").setExecutor(new commandfz());
    }
    public void onDisable() {
    }
}