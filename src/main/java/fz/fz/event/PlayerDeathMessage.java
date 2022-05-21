package fz.fz.event;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathMessage implements Listener {
    @EventHandler
    public void PlayerDeath(PlayerDeathEvent evt){
        if(evt.getDeathMessage().equals(evt.getEntity().getName()+" fell from a high place")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 从高处摔了下来");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Pig")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图拱猪的时候被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" died")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Cow")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害牛时被牛死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Sheep")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害羊时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Chicken")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害蔡徐坤时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Donkey")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害驴时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Horse")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害马时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Llama")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害羊驼时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Llama")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被羊驼杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Mooshroom")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害牟菇时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Mule")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害骡子时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Ocelot")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害豹猫时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Rabbit")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害兔子时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Parrot")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害鹦鹉时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Squid")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害鱿鱼时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Farmer")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害农夫时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Wolf")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被狼杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Skeleton Horse")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害骷髅马时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Zombie Horse")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害僵尸马时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was shot by Skeleton")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在跟骷髅对射♂的时候失败了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Zombie")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被僵尸杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Husk")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被尸壳杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was shot by Stray")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被流浪者杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was fireballed by Blaze")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被烈焰人烤熟了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed by Witch using magic")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被女巫射♂死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Spider")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被蜘蛛杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Cave Spider")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被洞穴蜘蛛杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Enderman")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被末影人杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Endermite")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被末影螨杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Silverfish")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被银鱼杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was blown up by Creeper")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被苦力怕炸死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Elder Guardian")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害远古守卫者时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Elder Guardian")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被远古守卫者杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Guardian")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害守卫者时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Guardian")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被守卫者杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was shot by Illusioner")){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED+" 被幻术师杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was fireballed by Ghast")){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED+" 被恶魂烤熟了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Magma Cube")) {
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 被岩浆怪杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Shulker")){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 被潜影贝杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Slime")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被史莱姆杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Vex")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被恼鬼杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Vindicator")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被卫道士杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Wither Skeleton")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被凋零骷髅杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Zombie Pigman")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被僵尸猪人杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Zombie Villager")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被僵尸村民杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Bat")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在试图伤害蝙蝠时被杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed by magic")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被魔法杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt Giant")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被巨人杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was struck by lightning")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被闪电中出了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by Iron Golem")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被铁傀儡杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was shot by Arrow")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被箭杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" hit the ground too hard")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在使用末影珍珠的时候摔死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" starved to death")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 饿死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" drowned")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 淹死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" tried to swim in lava")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 试图在岩浆游泳");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was pricked to death")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被仙人掌扎死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" fell out of the world")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 掉出了这个世界");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was squashed by a falling anvil")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被铁砧砸死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" suffocated in a wall")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 玩窒息Play玩过了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" blew up")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 爆炸了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" went up in flames")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 燃起来了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" experienced kinetic energy")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 撞死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" discovered floor was lava")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+"：这地烫脚");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" withered away")){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 冲死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" burned to death")){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 被烧死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" tried to swim in lava to escape Zombie")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在逃离僵尸时试图在岩浆游泳");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" tried to swim in lava to escape Bat")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在逃离蝙蝠时试图在岩浆游泳");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" tried to swim in lava to escape Blaze")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在逃离烈焰人时试图在岩浆游泳");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" tried to swim in lava to escape CaveSpider")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在逃离洞穴蜘蛛时试图在岩浆游泳");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" tried to swim in lava to escape Creeper")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 在逃离爬行者时试图在岩浆游泳");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed trying to hurt "+evt.getEntity().getKiller().getName())){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 在试图伤害 "+ChatColor.DARK_AQUA+evt.getEntity().getKiller().getName()+ChatColor.DARK_RED+" 时被杀");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was fireballed by "+evt.getEntity().getKiller().getName())){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 被 " + ChatColor.DARK_AQUA+evt.getEntity().getKiller().getName()+ChatColor.DARK_RED+" 用火球烧死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was blown up by "+evt.getEntity().getKiller().getName())){
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 被 " + ChatColor.DARK_AQUA+evt.getEntity().getKiller().getName()+ChatColor.DARK_RED+" 炸死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was killed by "+evt.getEntity().getKiller().getName()+" using magic")){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被 "+ChatColor.DARK_AQUA+evt.getEntity().getKiller().getName()+ChatColor.DARK_RED+" 射♂死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was shot by "+evt.getEntity().getKiller().getName())){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被 "+ChatColor.DARK_AQUA+evt.getEntity().getKiller()+ChatColor.DARK_RED+" 杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was slain by "+evt.getEntity().getKiller().getName())) {
            evt.setDeathMessage(ChatColor.DARK_AQUA + evt.getEntity().getName() + ChatColor.DARK_RED + " 被 " + ChatColor.DARK_AQUA + evt.getEntity().getKiller().getName() + ChatColor.DARK_RED + " 杀死了");
        }
        else if(evt.getDeathMessage().equals(evt.getEntity().getName()+" was blown up by "+evt.getEntity().getKiller().getName())){
            evt.setDeathMessage(ChatColor.DARK_AQUA+evt.getEntity().getName()+ChatColor.DARK_RED+" 被 "+ChatColor.DARK_AQUA+evt.getEntity().getKiller().getName()+ChatColor.DARK_RED+" 炸死了");
        }
    }
}
