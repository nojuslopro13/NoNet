package me.nojuslopro.nojusnetcoretwo.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class KickForVPN {
    public static void disconnectPlayerForProxy(Player player) {

        String kickMessage = ChatColor.BLUE + "[NOJUSNET]" + ChatColor.YELLOW + "\n\n\nᴘᴀsᴛᴇʙėᴊᴏᴍᴇ, ᴋᴀᴅ ᴊūs ɴᴀᴜᴅᴏᴊᴀᴛᴇ ᴠᴘɴ ᴀʀʙᴀ ᴘʀᴏxʏ. ᴘʀᴀšᴀᴜ ɪsᴊᴜɴɢᴛɪ, ᴀʀʙᴀ ᴊᴇɪɢᴜ ʙᴜᴠᴏ ᴋʟᴀɪᴅᴀ ᴛᴀɪ ᴘᴀᴋʟᴀᴜsᴋɪᴛᴇ sᴇʀᴠᴇʀɪᴏ ᴘʀᴏɢʀᴀᴍᴜᴏᴛᴏᴊᴀ." + ChatColor.RED + "\n\nᴘʀᴏxʏ ᴛɪᴋʀɪɴᴛᴏᴊᴀs";

        if (player == null) {
            Bukkit.getLogger().severe("Did not specify player object!");
        }

        player.kickPlayer(kickMessage);

    }
}
