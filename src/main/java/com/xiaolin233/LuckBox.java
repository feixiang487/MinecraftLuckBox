package com.xiaolin233;

import com.xiaolin233.boxlisterner.BoxLucker;
import org.bukkit.plugin.java.JavaPlugin;

public class LuckBox extends JavaPlugin {
    public void onEnable(){
        System.out.println("抽奖插件成功开启");
        getServer().getPluginManager().registerEvents(new BoxLucker(),this);
    }
    public void onDisable(){
        System.out.println("抽奖插件成功关闭");
    }
}
