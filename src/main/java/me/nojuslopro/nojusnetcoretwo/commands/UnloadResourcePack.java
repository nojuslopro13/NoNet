package me.nojuslopro.nojusnetcoretwo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class UnloadResourcePack implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            try {
                player.setResourcePack(null);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else {
            Bukkit.getLogger().warning("You must be a player to execute this command!");
        }

        return true;
    }
}
