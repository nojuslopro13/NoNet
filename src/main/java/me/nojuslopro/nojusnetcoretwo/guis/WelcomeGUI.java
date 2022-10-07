package me.nojuslopro.nojusnetcoretwo.guis;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class WelcomeGUI {
    public static void createBookGui(Player player) {
        ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta bookmeta = (BookMeta) book.getItemMeta();
        bookmeta.setAuthor("Pagalbininkas");
        bookmeta.setTitle(ChatColor.RED + "PAGALBA!");

        bookmeta.addPages(Component.text(ChatColor.BLUE + "Nojus Net v2.0" + ChatColor.WHITE + "Turime naujų atnaujimų, naujas žemėlapis kuris būs atnaujintas kita dieną, perkuodotas servas ir dar daugiau.Žemėlapį bus pridėta, NPCS su kuriais gali bendrauti, ir t.t"));

        book.setItemMeta(bookmeta);
        player.openBook(book);
    }
}
