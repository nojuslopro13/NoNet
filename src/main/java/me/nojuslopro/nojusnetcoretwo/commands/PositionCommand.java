package me.nojuslopro.nojusnetcoretwo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutionException;

public class PositionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender.hasPermission("nojusnet.position")) {
            Player player = (Player) sender;
            try {
                player.sendMessage("X: " + player.getLocation().getX() + " Y: " + player.getLocation().getY() + " Z: " + player.getLocation().getZ() + " Yaw:  " + player.getLocation().getYaw() + " Pitch: " + player.getLocation().getPitch());
            } catch (Exception e){
                e.printStackTrace();
                player.sendMessage(ChatColor.RED + "šɪᴛᴀ ᴋᴏᴍᴀɴᴅᴀ ɴᴇᴘᴀʀᴀšė ᴘᴏsɪᴛɪᴏɴ ɪɴғᴏʀᴍᴀᴄɪᴊᴏs ᴅėʟ ᴋʟᴀɪᴅᴏs.");
            }

        }
        else {
            sender.sendMessage(ChatColor.RED + "ɴᴇᴛᴜʀɪᴛᴇ ʟᴇɪᴅɪᴍᴏ ɴᴀᴜᴅᴏᴛɪ šɪᴛᴀ ᴋᴏᴍᴀɴᴅą!");
        }
        return true;
    }
}
