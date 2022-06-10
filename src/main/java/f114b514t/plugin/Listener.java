package f114b514t.plugin;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import java.io.*;
import java.util.*;

import static java.lang.Thread.sleep;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void ItemChat(AsyncPlayerChatEvent evt) {
        if (evt.getMessage().contains("[item]")) {
            Item item = (Item) evt.getPlayer().getWorld().spawnEntity(evt.getPlayer().getLocation(), EntityType.DROPPED_ITEM);
            item.setItemStack(evt.getPlayer().getInventory().getItemInMainHand());
        }
    }

    @EventHandler
    public void NoJoinMessage(PlayerJoinEvent evt) {
        evt.setJoinMessage("");
        evt.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR,new TextComponent(ChatColor.AQUA+"欢迎加入114B514T，当前有"+Bukkit.getOnlinePlayers().size()+"人在线"));
        if (!evt.getPlayer().hasPermission("bukkit.command.tps")) {
            evt.getPlayer().addAttachment(plugin.getPlugin(plugin.class), "bukkit.command.tps", true);
        }
    }

    @EventHandler
    public void NoQuitMessage(PlayerQuitEvent event) {
        event.setQuitMessage("");
    }

    @EventHandler
    public void Anti32kDamage(PlayerItemDamageEvent evt) {
        for (Enchantment enchantment : evt.getItem().getEnchantments().keySet()) {
            if (evt.getItem().getEnchantments().get(enchantment) > enchantment.getMaxLevel()) {
                evt.getPlayer().getInventory().remove(evt.getItem());
            }
        }
    }

    @EventHandler
    public void Anti32kKill(EntityDeathEvent evt) {
        if (evt.getEntity() instanceof Player) {
            for (Map.Entry<Enchantment, Integer> enchantment : (((Player) evt.getEntity()).getInventory().getItemInMainHand().getEnchantments().entrySet())) {
                if (enchantment.getValue() > enchantment.getKey().getMaxLevel()) {
                    ((Player) evt.getEntity()).getInventory().remove(((Player) evt.getEntity()).getInventory().getItemInMainHand());
                }
            }
        }
    }

    @EventHandler
    public void Mother(AsyncPlayerChatEvent evt) {
        if ((evt.getMessage().contains("妈")) || (evt.getMessage().contains("傻逼"))) {
            evt.setCancelled(true);
            evt.getPlayer().sendMessage(org.bukkit.ChatColor.RED + "操你妈不支持脏话[发怒][发怒][发怒]");
        }
    }

    @EventHandler
    public void AntiBookBan(PlayerEditBookEvent evt) {
        if (evt.getNewBookMeta().getPageCount() > 5) {
            evt.setCancelled(true);
            evt.getPlayer().sendMessage(org.bukkit.ChatColor.RED + "禁止制作禁人书");
        }
    }

    ArrayList<Material> list = new ArrayList<>();

    @EventHandler
    public void Ban_Item(BlockPlaceEvent evt) {
        FileConfiguration yaml = YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(), "config.yml"));
        for (String str : yaml.getStringList("ban_item")) {
            if (evt.getBlockPlaced().getType().equals(Material.getMaterial(str))) {
                evt.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void AntiDestroy(BlockBreakEvent evt) {
        if (!evt.getPlayer().hasPermission("114b514t.unban_item.s")) {
            list.add(Material.BEDROCK);
            list.add(Material.ENDER_PORTAL_FRAME);
            list.add(Material.ENDER_PORTAL);
            list.add(Material.BARRIER);
            for (Material material : list) {
                if (evt.getBlock().getType().equals(material)) {
                    evt.setCancelled(true);
                    break;
                }
            }
        }
    }

    @EventHandler
    public void AntiMoisterEgg(PlayerInteractEvent evt) {
        if (!evt.getPlayer().hasPermission("114b514t.unban_item.s")) {
            if ((evt.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && (evt.getPlayer().getPlayer().getInventory().getItemInMainHand().getType().equals(Material.MONSTER_EGG))) {
                evt.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent evt) {
        if (evt.getPlayer().hasPermission("114b514t.vip.name")) {
            evt.getPlayer().setDisplayName(ChatColor.DARK_PURPLE+evt.getPlayer().getName());
        } else if (evt.getPlayer().hasPermission("114b514t.admin.name")) {
            evt.getPlayer().setCustomName(ChatColor.YELLOW+evt.getPlayer().getName());
        } else if ((evt.getPlayer().hasPermission("114b514t.green-chat.use")) && (evt.getPlayer().hasPermission("114b514t.chat-light-green.name"))) {
            evt.setMessage(ChatColor.RESET+evt.getPlayer().getName());
            evt.setMessage(ChatColor.GREEN+evt.getMessage());
        } else if (evt.getPlayer().hasPermission("114b514t.chat-light-green.name")) {
            evt.getPlayer().setDisplayName(ChatColor.GREEN+evt.getPlayer().getName());
        } else if (evt.getPlayer().hasPermission("114b514t.green-chat.use")) {
            evt.setMessage(ChatColor.RESET+evt.getPlayer().getName());
            evt.setMessage(org.bukkit.ChatColor.GREEN + evt.getMessage());
        }
    }

    @EventHandler
    public void ChatPreFix(AsyncPlayerChatEvent evt) {
        if (evt.getMessage().startsWith(">")) {
            evt.setMessage(org.bukkit.ChatColor.GREEN + evt.getMessage());
        } else if (evt.getMessage().startsWith(":")) {
            evt.setMessage(org.bukkit.ChatColor.LIGHT_PURPLE + evt.getMessage());
        } else if (evt.getMessage().startsWith("'")) {
            evt.setMessage(org.bukkit.ChatColor.GOLD + evt.getMessage());
        }
        if (evt.getMessage().startsWith("SB303")) {
            evt.getPlayer().kickPlayer(org.bukkit.ChatColor.RED + "[114B514T]" + org.bukkit.ChatColor.GOLD + "你成功踢出了你这个傻逼");
        } else if (evt.getMessage().startsWith("114B514T是什么破烂服务器")) {
            evt.getPlayer().kickPlayer(org.bukkit.ChatColor.RED + "[114B514T]" + org.bukkit.ChatColor.GOLD + "你成功踢出了你这个傻逼");
        } else if (evt.getMessage().startsWith("傻逼服主")) {
            evt.getPlayer().kickPlayer(org.bukkit.ChatColor.RED + "[114B514T]" + org.bukkit.ChatColor.GOLD + "你成功踢出了你这个傻逼");
        } else if (evt.getMessage().startsWith("我是傻逼")) {
            if (evt.getPlayer().hasPermission("114b514t.wssb.use")) {
                evt.getPlayer().setGameMode(GameMode.CREATIVE);
            }
        }
    }

    private final java.util.Set<Player> playerSet = new HashSet<>();
    private final Set<Player> Set = new HashSet<>();
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder() + "/config.yml"));
    Boolean ConsoleBoolean = false;
    Boolean Allow_Command = false;

    @EventHandler
    public void ChatCooldown(AsyncPlayerChatEvent evt) {
        if (playerSet.contains(evt.getPlayer())) {
            evt.getPlayer().sendMessage(org.bukkit.ChatColor.RED + "冷却中");
            evt.setCancelled(true);
        } else {
            playerSet.add(evt.getPlayer());
        }
        new Thread(() -> {
            try {
                sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            playerSet.remove(evt.getPlayer());
        }).start();
    }

    @EventHandler
    public void CommandCoolddown(PlayerCommandPreprocessEvent evt) {
        if (!evt.getPlayer().hasPermission("114b514t.uncommand.bypass")) {
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
                evt.getPlayer().sendMessage(org.bukkit.ChatColor.RED + "I'm sorry, but this command can only use in Op. Please contact the server administrators if you believe that this is in error.");
                evt.setCancelled(true);
                Allow_Command = false;
            }
            if (ConsoleBoolean) {
                evt.setCancelled(true);
                evt.getPlayer().sendMessage(org.bukkit.ChatColor.RED + "I'm sorry, but this command can only use in Console. Please contact the server administrators if you believe that this is in error.");
                ConsoleBoolean = false;
            } else {
                if (Set.contains(evt.getPlayer())) {
                    evt.getPlayer().sendMessage(org.bukkit.ChatColor.RED + "冷却中");
                    evt.setCancelled(true);
                } else {
                    Set.add(evt.getPlayer());
                }
                new Thread(() -> {
                    try {
                        sleep(3000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Set.remove(evt.getPlayer());
                }).start();
            }
        }
    }

    @EventHandler
    public void Fzsgui(InventoryClickEvent evt) {
        if (evt.getClickedInventory() != null) {
            if ((evt.getClickedInventory().getTitle().equals("复制")) || (evt.getClickedInventory().getName().equals("复制"))) {
                evt.setCancelled(true);
                if (evt.getCurrentItem().getType().equals(Material.COMMAND)) {
                    if (evt.getWhoClicked().hasPermission("114b514t.fz.use")) {
                        evt.getWhoClicked().addAttachment(f114b514t.plugin.plugin.getPlugin(f114b514t.plugin.plugin.class), "114b514t.fz.use", false);
                        evt.getWhoClicked().sendMessage(org.bukkit.ChatColor.GREEN + "你成功的关闭了/fz");
                    } else if (!evt.getWhoClicked().hasPermission("114b514t.fz.use")) {
                        evt.getWhoClicked().addAttachment(f114b514t.plugin.plugin.getPlugin(f114b514t.plugin.plugin.class), "114b514t.fz.use", true);
                        evt.getWhoClicked().sendMessage(org.bukkit.ChatColor.GREEN + "你成功的开启/fz");
                    }
                } else if (evt.getCurrentItem().getType().equals(Material.EXP_BOTTLE)) {
                    if (evt.getWhoClicked().hasPermission("114b514t.exp_dupe.use")) {
                        evt.getWhoClicked().addAttachment(f114b514t.plugin.plugin.getPlugin(f114b514t.plugin.plugin.class), "114b514t.exp_dupe.use", false);
                        evt.getWhoClicked().sendMessage(org.bukkit.ChatColor.GREEN + "你成功的关闭了经验瓶复制");
                    } else if (!evt.getWhoClicked().hasPermission("114b514t.exp_dupe.use")) {
                        evt.getWhoClicked().addAttachment(f114b514t.plugin.plugin.getPlugin(f114b514t.plugin.plugin.class), "114b514t.exp_dupe.use", true);
                        evt.getWhoClicked().sendMessage(org.bukkit.ChatColor.GREEN + "你成功的开启经验瓶复制");
                    }
                }
            } else if ((evt.getClickedInventory().getTitle().equals("KIT")) || (evt.getClickedInventory().getName().equals("KIT"))) {
                evt.setCancelled(true);
                if (evt.getCurrentItem().getType().equals(Material.END_CRYSTAL)) {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + evt.getWhoClicked().getName() + " minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"Common\"}}");
                } else if (evt.getCurrentItem().getType().equals(Material.PISTON_BASE)) {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + evt.getWhoClicked().getName() + " minecraft:purple_shulker_box 1 0 {BlockEntityTag:{CustomName:\"PistonCrystal\",Items:[{Slot:0b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:1b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:2b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:4s,id:3s},{lvl:2s,id:7s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:3b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:63},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:12b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:13b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:14b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:15b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:16b,id:\"minecraft:redstone_block\",Count:64b,Damage:0s},{Slot:17b,id:\"minecraft:piston\",Count:64b,Damage:0s},{Slot:18b,id:\"minecraft:chorus_fruit\",Count:64b,Damage:0s},{Slot:19b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:20b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:7},Damage:0s},{Slot:21b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:22b,id:\"minecraft:totem_of_undying\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:redstone_block\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:piston\",Count:64b,Damage:0s}]},display:{Name:\"PistonCrystal\"}}");
                } else if (evt.getCurrentItem().getType().equals(Material.ELYTRA)) {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + evt.getWhoClicked().getName() + " minecraft:silver_shulker_box 1 0 {BlockEntityTag:{CustomName:\"RunGod\",Items:[{Slot:0b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:1b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:3b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:4b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:5b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:6b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:7b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:8b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:9b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:10b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:11b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:12b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:13b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:15b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:16b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:19b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:20b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:21b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:22b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:23b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:24b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:25b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:26b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s}]},display:{Name:\"RunGod\"}}");
                } else {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + evt.getWhoClicked().getName() + " minecraft:light_blue_shulker_box 1 0 {BlockEntityTag:{Items:[{Slot:0b,id:\"minecraft:diamond_sword\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:2s,id:19s},{lvl:2s,id:20s},{lvl:3s,id:21s},{lvl:3s,id:22s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:15},Damage:0s},{Slot:1b,id:\"minecraft:diamond_pickaxe\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:2b,id:\"minecraft:diamond_axe\",Count:1b,tag:{ench:[{lvl:5s,id:16s},{lvl:5s,id:32s},{lvl:3s,id:34s},{lvl:3s,id:35s},{lvl:1s,id:70s}],RepairCost:31},Damage:0s},{Slot:3b,id:\"minecraft:diamond_shovel\",Count:1b,tag:{ench:[{lvl:5s,id:32s},{lvl:1s,id:33s},{lvl:3s,id:34s},{lvl:1s,id:70s}],RepairCost:15},Damage:0s},{Slot:4b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:5b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:6b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:7b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:8b,id:\"minecraft:end_crystal\",Count:64b,Damage:0s},{Slot:9b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:10b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:11b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:12b,id:\"minecraft:golden_apple\",Count:64b,Damage:1s},{Slot:13b,id:\"minecraft:diamond_helmet\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:3s,id:5s},{lvl:1s,id:6s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:14b,id:\"minecraft:diamond_chestplate\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:15b,id:\"minecraft:diamond_leggings\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:4s,id:3s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s},{Slot:16b,id:\"minecraft:diamond_boots\",Count:1b,tag:{ench:[{lvl:4s,id:0s},{lvl:4s,id:2s},{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s},{lvl:3s,id:8s}],RepairCost:7},Damage:0s},{Slot:17b,id:\"minecraft:elytra\",Count:1b,tag:{ench:[{lvl:3s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:7},Damage:0s},{Slot:18b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:19b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:20b,id:\"minecraft:totem_of_undying\",Count:1b,Damage:0s},{Slot:21b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:22b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:23b,id:\"minecraft:experience_bottle\",Count:64b,Damage:0s},{Slot:24b,id:\"minecraft:ender_chest\",Count:64b,Damage:0s},{Slot:25b,id:\"minecraft:obsidian\",Count:64b,Damage:0s},{Slot:26b,id:\"minecraft:flint_and_steel\",Count:1b,tag:{ench:[{lvl:5s,id:34s},{lvl:1s,id:70s},{lvl:1s,id:71s}],RepairCost:3},Damage:0s}]},display:{Name:\"Common\"}}");
                }
            }
        }
    }

    @EventHandler
    public void NoHighest(PlayerMoveEvent evt) {
        if ((evt.getPlayer().getWorld().getEnvironment().equals(World.Environment.NETHER)) && (evt.getPlayer().getLocation().getBlockY() >= 128)) {
            evt.getPlayer().setHealth(0);
        }
    }

    @EventHandler
    public void Resapwn(PlayerRespawnEvent evt) {
        evt.getPlayer().addPotionEffect(PotionEffectType.DAMAGE_RESISTANCE.createEffect(30, 255));
    }

    @EventHandler
    public void PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {
        if (event.getPlayer().hasPermission("114b514t.exp_dupe.use")) {
            if (event.getPlayer().getInventory().getItemInOffHand().getType() == Material.TOTEM) {
                event.getPlayer().sendMessage(org.bukkit.ChatColor.DARK_RED + "[" + (YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(), "config.yml"))).getString("server_name") + "]请你不要当图腾大神");
            } else if (event.getNewLevel() - event.getOldLevel() == 1) {
                (event.getPlayer()).getInventory().addItem(((event.getPlayer()).getInventory().getItemInOffHand()));
            }
        }
    }

    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent evt) {
        if ((YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(), "config.yml"))).getBoolean("kill_donkey_copy")) {
            if (evt.getEntity().getKiller() != null) {
                if ((evt.getEntity().getType().equals(EntityType.DONKEY)) || (evt.getEntity().getType().equals(EntityType.LLAMA))) {
                    for (ItemStack item : evt.getDrops()) {
                        evt.getEntity().getKiller().getInventory().addItem(item);
                    }
                }
            }
        } else {
            evt.getEntity().getKiller().sendMessage(ChatColor.DARK_RED + "[" + ChatColor.DARK_RED + (YamlConfiguration.loadConfiguration(new File(plugin.getPlugin(plugin.class).getDataFolder(), "config.yml"))).getString("server_name") + ChatColor.DARK_RED + "]杀驴复制未启用");
        }
    }

    private final Map<String, Integer> integers = new HashMap<>();

    @EventHandler
    public void onBreak(BlockPlaceEvent evt) {
        if ((evt.getBlock().getType().equals(Material.BLACK_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.BLUE_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.BROWN_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.CYAN_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.GRAY_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.GREEN_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.LIGHT_BLUE_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.LIME_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.MAGENTA_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.ORANGE_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.PINK_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.RED_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.PURPLE_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.WHITE_SHULKER_BOX)) || (evt.getBlock().getType().equals(Material.YELLOW_SHULKER_BOX))) {
            if (!integers.containsKey(evt.getPlayer().getName())) {
                integers.putIfAbsent(evt.getPlayer().getName(), 0);
            }
            if (integers.get(evt.getPlayer().getName()) == 5) {
                evt.getPlayer().getInventory().addItem(evt.getItemInHand());
                integers.replace(evt.getPlayer().getName(), 0);
            }
            integers.replace(evt.getPlayer().getName(), integers.get(evt.getPlayer().getName()) + 1);
        }
    }

    @EventHandler
    public void onShaoFoodLevel(FoodLevelChangeEvent evt) {
        if (evt.getEntity() instanceof Player) {
            if (evt.getEntity().hasPermission("infinitefoodlevel.use")) {
                evt.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void L(EntityDamageEvent evt) {
        if ((evt.getEntity() instanceof Player) && (playerSet.contains((Player) evt.getEntity()))) {
            evt.setCancelled(true);
        }
    }

    Map<Chunk, Integer> PISTON = new HashMap<>();

    @EventHandler
    public void Shulker_Box(BlockPlaceEvent evt) {
        if (evt.getBlockPlaced().getType().equals(Material.DISPENSER)) {
            if (evt.getBlockPlaced().getLocation().getY() >= 255) {
                evt.setCancelled(true);
                evt.getPlayer().sendMessage(org.bukkit.ChatColor.DARK_RED + "想潜影盒崩服是吧");
            } else if (evt.getBlockPlaced().getLocation().getY() <= 0) {
                evt.setCancelled(true);
                evt.getPlayer().sendMessage(org.bukkit.ChatColor.DARK_RED + "想潜影盒崩服是吧");
            }
        }
    }

    @EventHandler
    public void EntitySpawn(EntitySpawnEvent evt) {
        int a = 0;
        for (Entity entity : evt.getLocation().getChunk().getEntities()) {
            if (entity.getType().equals(evt.getEntityType())) {
                a++;
            }
        }
        if (a >= 7) {
            evt.setCancelled(true);
        }
    }

    @EventHandler
    public void AntiEMP(BlockPlaceEvent evt) {
        if (evt.getBlockPlaced().getType().equals(Material.PISTON_STICKY_BASE)) {
            PISTON.putIfAbsent(evt.getBlockPlaced().getChunk(), 1);
            PISTON.replace(evt.getBlockPlaced().getChunk(), PISTON.get(evt.getBlockPlaced().getChunk()) + 1);
            if (PISTON.get(evt.getBlockPlaced().getChunk()) > 16) {
                evt.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void eee(BlockBreakEvent evt) {
        if (evt.getBlock().getType().equals(Material.PISTON_STICKY_BASE)) {
            PISTON.replace(evt.getBlock().getChunk(), PISTON.get(evt.getBlock().getChunk()) - 1);
        }
    }

    @EventHandler
    public void AntiTNTEnterPortal(EntityPortalEvent evt) {
        if ((evt.getEntityType().equals(EntityType.MINECART_TNT)) || (evt.getEntityType().equals(EntityType.PRIMED_TNT))) {
            evt.setCancelled(true);
        }
    }

    @EventHandler
    public void Break(BlockBreakEvent evt) {
        if ((evt.getBlock().getType().equals(Material.BEDROCK)) || (evt.getBlock().getType().equals(Material.ENDER_PORTAL))) {
            evt.setCancelled(true);
        }
    }

    @EventHandler
    public void BannerHead(PlayerInteractEvent evt) {
        if (evt.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BANNER)) {
            if (evt.getPlayer().getInventory().getHelmet() != null) {
                evt.getPlayer().getInventory().setItemInMainHand(evt.getPlayer().getInventory().getHelmet());
            }
            evt.getPlayer().getInventory().setHelmet(evt.getPlayer().getInventory().getItemInMainHand());
        }
    }

    private Map<Player, Block> BURROW = new HashMap<>();

    @EventHandler
    public void burrow(BlockPlaceEvent evt) {
        if ((evt.getBlockPlaced().getType().equals(Material.OBSIDIAN)) && (evt.getPlayer().getWorld().getBlockAt(evt.getPlayer().getLocation().getBlockX(), evt.getPlayer().getLocation().getBlockY() - 1, evt.getPlayer().getLocation().getBlockZ()).getType().equals(Material.OBSIDIAN))) {
            if (BURROW.containsKey(evt.getPlayer())) {
                BURROW.replace(evt.getPlayer(), evt.getBlockPlaced());
            } else {
                BURROW.putIfAbsent(evt.getPlayer(), evt.getBlockPlaced());
            }
            new Thread(() -> {
                try {
                    sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                BURROW.remove(evt.getPlayer());
            }).start();
        }
    }

    private final Set<Player> burrow = new HashSet<>();

    @EventHandler
    public void burrowbypass(PlayerMoveEvent evt) {
        if ((evt.getPlayer().getWorld().getBlockAt(evt.getPlayer().getLocation().getBlockX(), evt.getPlayer().getLocation().getBlockY() - 1, evt.getPlayer().getLocation().getBlockZ()).getType().equals(Material.OBSIDIAN)) && (evt.getTo().getX() == evt.getFrom().getX())) {
            if (!((evt.getFrom().getX() == evt.getTo().getX()) && (evt.getFrom().getY() == evt.getTo().getY()) && (evt.getFrom().getZ() == evt.getTo().getZ()))) {
                if (!burrow.contains(evt.getPlayer()) && (BURROW.containsKey(evt.getPlayer()))) {
                    evt.setTo(evt.getPlayer().getWorld().getBlockAt(evt.getPlayer().getLocation().getBlockX(), evt.getPlayer().getLocation().getBlockY() - 1, evt.getPlayer().getLocation().getBlockZ()).getLocation());
                    for (Player player : Bukkit.getOnlinePlayers()) {
                        if (player.hasPermission("114b514t.check.message")) {
                            player.sendMessage(ChatColor.RED + "玩家 " + ChatColor.DARK_AQUA + evt.getPlayer().getName() + ChatColor.RED + " 触发了Burrow检测");
                        }
                    }
                } else {
                    burrow.add(evt.getPlayer());
                }
                BURROW.remove(evt.getPlayer());
                burrow.remove(evt.getPlayer());
            }
        }
    }

    @EventHandler
    public void AntiInfinityHP(EntityRegainHealthEvent evt) {
        if (evt.getEntity() instanceof Player) {
            if (((Player) evt.getEntity()).getHealth() > 20) {
                evt.setCancelled(true);
                ((Player) evt.getEntity()).setHealth(20.0);
            }
        }
    }

    @EventHandler
    public void AntiStack(PlayerMoveEvent evt) {
        for (ItemStack item : evt.getPlayer().getInventory()) {
            if (item != null) {
                if (item.getAmount() > item.getMaxStackSize()) {
                    item.setAmount(item.getMaxStackSize());
                }
            }
        }
    }

    @EventHandler
    public void Super_Chicken(PlayerInteractEntityEvent evt) {
        if (evt.getRightClicked().getType().equals(EntityType.CHICKEN)) {
            for (int i = 0; i < 5; i++) {
                evt.getRightClicked().setCustomName(evt.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName());
                Item item = (Item) evt.getRightClicked().getWorld().spawnEntity(evt.getRightClicked().getLocation(), EntityType.DROPPED_ITEM);
                item.setItemStack(evt.getPlayer().getInventory().getItemInMainHand());
            }
        }
    }

    @EventHandler
    public void AntiInvincible(PlayerMoveEvent evt) {
        if (evt.getPlayer().getActivePotionEffects().contains(PotionEffectType.DAMAGE_RESISTANCE)) {

        }
    }

    private final Map<Player, Boolean> playerBooleanMap = new HashMap<>();

    @EventHandler
    public void anti32k1(PlayerMoveEvent evt) {
        if (!playerBooleanMap.containsKey(evt.getPlayer())) {
            playerBooleanMap.putIfAbsent(evt.getPlayer(), false);
        } else {
            playerBooleanMap.putIfAbsent(evt.getPlayer(), true);
        }
        for (Enchantment enchantment : evt.getPlayer().getInventory().getItemInMainHand().getEnchantments().keySet()) {
            if (evt.getPlayer().getInventory().getItemInMainHand().getEnchantments().get(enchantment) > enchantment.getMaxLevel()) {
                if (!playerBooleanMap.get(evt.getPlayer())) {
                    evt.getPlayer().getInventory().remove(evt.getPlayer().getInventory().getItemInMainHand());
                    break;
                }
            }
        }
    }
    @EventHandler
    public void anti32k2(InventoryOpenEvent evt){
        if(evt.getInventory().getType().equals(InventoryType.HOPPER)){
            if(playerBooleanMap.containsKey((Player)evt.getPlayer())) {
                playerBooleanMap.replace((Player) evt.getPlayer(), true);
            }
            else{
                playerBooleanMap.putIfAbsent((Player) evt.getPlayer(), true);
            }
        }
    }
}