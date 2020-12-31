package org.ik26w30.reportplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Join @matteodeveloper and @zionsstudios");
            return true;
        }

        if (args.length == 2) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target != null) {
                if (target != sender) {
                    String reason = args[1];
                    if (reason != null) {
                        Bukkit
                                .getOnlinePlayers()
                                .stream()
                                .filter(player -> player.hasPermission("report.staff"))
                                .forEach(player -> player.sendMessage("Report by " + sender.getName() + " at " + args[0] + " reason " + args[1]));
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }else {
                return true;
            }

        }else {
            return true;
        }
        return false;
    }
}