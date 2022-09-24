package me.nojuslopro.nojusnetcoretwo.listeners;

import me.nojuslopro.nojusnetcoretwo.Nojusnetcoretwo;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class InventoryClick implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        e.setCancelled(true);
        Player player = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase("Servers")) {

            switch (e.getCurrentItem().getType()) {
                case EMERALD:
                    sendServer(player, "lifesteal", ChatColor.BLUE + "[NOJUSNET] " + ChatColor.GREEN + "Siunčiame jumis į Anarchy serverį", ChatColor.BLUE + "[NOJUSNET] " + ChatColor.RED + "Anarchy išjungtas!", 25566);
                    break;
                case DIAMOND_SWORD:
                    sendServer(player, "competitive", ChatColor.BLUE + "[NOJUSNET] " + ChatColor.GREEN + "Siunčiame jumis į Competitive Games serverį", ChatColor.BLUE + "[NOJUSNET] " + ChatColor.RED + "Competitive Games išjungtas!", 12500);
            }
        }
     }
    private void sendServer(Player player, String server, String sendingmessage, String errormessage, int port) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try{



            if (!checkConnection(port)) {
                player.sendMessage(errormessage);
            } else {
                dataOutputStream.writeUTF("Connect");
                dataOutputStream.writeUTF(server);
                player.sendPluginMessage(Nojusnetcoretwo.getPlugin(), "BungeeCord", byteArrayOutputStream.toByteArray());
                player.sendMessage(sendingmessage);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static boolean checkConnection(int port) {
        try {
            Socket socket = new Socket("localhost", port);
            socket.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
