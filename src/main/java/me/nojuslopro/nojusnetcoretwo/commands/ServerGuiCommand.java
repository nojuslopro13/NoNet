package me.nojuslopro.nojusnetcoretwo.commands;

import me.nojuslopro.nojusnetcoretwo.guis.ServerGUI;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class ServerGuiCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory gui = ServerGUI.createGui(player);
            player.playSound(player.getLocation(), Sound.BLOCK_BARREL_OPEN, 1, 1);
            player.openInventory(gui);
        }
        return true;
    }
}
