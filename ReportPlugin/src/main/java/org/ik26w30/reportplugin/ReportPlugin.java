package org.ik26w30.reportplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.ik26w30.reportplugin.Commands.MainCommand;
import org.ik26w30.reportplugin.Commands.ReportCommand;

public final class ReportPlugin extends JavaPlugin {
    private static ReportPlugin instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        //Plugin logic started
        registerCommands(

        );
        startup(

        );
    }

    private void startup() {
        getLogger().info("Plugin loaded...");
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "Plugin developed by @ik26w30 on telegram");
    }

    private void registerCommands() {
        this.getCommand("report").setExecutor(new ReportCommand());
        this.getCommand("reportplugin").setExecutor(new MainCommand());
    }
}
