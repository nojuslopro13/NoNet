package me.nojuslopro.nojusnetcoretwo.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

import java.io.PrintWriter;
import java.io.StringWriter;

public class FlingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("nojusnet.fling")) {
                if (args.length == 0) {
                    player.setVelocity(new Vector(500, 60, 1000));

                } else if (args.length == 1) {
                    if (args[0] == "@a") {
                        for (Player player1 : Bukkit.getOnlinePlayers()) {
                            player1.setVelocity(new Vector(500, 60, 1000));
                        }
                    }
                    try {
                        Player target = Bukkit.getPlayer(args[0]);
                        target.setVelocity(new Vector(500, 60, 1000));
                    }catch (Exception e) {
                        player.sendMessage(Component.text(ChatColor.DARK_RED + "This player doesn't exist"));
                        StringWriter sw = new StringWriter();
                        PrintWriter pw = new PrintWriter(sw);
                        e.printStackTrace(pw);
                        String sStackTrace = sw.toString();
                        player.sendMessage(sStackTrace);

                    }
                }

            }

        }

        return true;
    }

}
