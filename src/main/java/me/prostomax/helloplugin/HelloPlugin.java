package me.prostomax.helloplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelloPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String playerName = event.getPlayer().getName();
        String separator = "§7-------------------------------------";
        String welcomeMessage = "§a" + separator + "\n" +
                "§6Приветствую тебя, " + playerName + "!\n" +
                "§eСпасибо, что играешь на нашем проекте и помогаешь нам становиться лучше.\n" +
                "§a" + separator;

        event.getPlayer().sendMessage(welcomeMessage);
    }
}
