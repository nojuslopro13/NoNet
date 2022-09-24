package me.nojuslopro.nojusnetcoretwo.commands;

import me.nojuslopro.nojusnetcoretwo.Nojusnetcoretwo;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class LobbyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            sendServer(player, "lobby");
        }
        return true;
    }

    private void sendServer(Player player, String server) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try{

            dataOutputStream.writeUTF("Connect");
            dataOutputStream.writeUTF(server);

        }catch (IOException e) {
            e.printStackTrace();
        }
        player.sendPluginMessage(Nojusnetcoretwo.getPlugin(), "BungeeCord", byteArrayOutputStream.toByteArray());
        player.sendMessage(ChatColor.BLUE + "[NOJUSNET] " + ChatColor.GREEN + "Sending you to the hub.");
    }
}
