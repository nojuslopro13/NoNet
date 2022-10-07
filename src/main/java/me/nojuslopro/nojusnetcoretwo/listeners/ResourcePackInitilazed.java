package me.nojuslopro.nojusnetcoretwo.listeners;

import io.papermc.paper.event.server.ServerResourcesReloadedEvent;
import me.clip.placeholderapi.libs.kyori.adventure.platform.facet.Facet;
import me.nojuslopro.nojusnetcoretwo.guis.WelcomeGUI;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

public class ResourcePackInitilazed implements Listener {
    @EventHandler
    public void onPackSuccess(PlayerResourcePackStatusEvent e) {
        Player player = (Player) e.getPlayer();
        String packRequired = ChatColor.RED + "ɴᴇɢᴀʟɪᴛᴇ ᴘʀɪsɪᴊᴜɴɢᴛɪ ᴘʀɪᴇ sᴇʀᴠᴇʀɪᴏ ʙᴇ sᴇʀᴠᴇʀɪᴏ ᴘᴀᴋᴇᴛᴏ!";
        String failedDownload = ChatColor.RED + "ɴᴇᴘᴀᴠʏᴋᴏ ᴀᴛsɪūsᴛɪ sᴇʀᴠᴇʀɪᴏ ᴘᴀᴋᴇᴛᴀ ᴘᴀʙᴀɴᴅʏᴋɪᴛᴇ ᴠėʟɪᴀᴜ";

        switch (e.getStatus()) {
            case SUCCESSFULLY_LOADED:
                player.sendMessage(ChatColor.BLUE + "               NOJUS NETWORK              " + ChatColor.WHITE + "\n\n\n       Turime atnaujimų, Žemėlapis pridėtas.                    \n          Pridėsime NPCS ir lobby Minigames     \n        Atnaujinsime Anarchy ir kitus serverius. ");
                break;
            case DECLINED:
                player.kick(Component.text(packRequired));
                break;
            case FAILED_DOWNLOAD:
                player.kick(Component.text(failedDownload));
                break;

        }
    }
}
