package ua.softwind.playerOnlineBorder;

import static org.bukkit.Bukkit.getServer;
import static ua.softwind.playerOnlineBorder.PlayerOnlineBorder.getBorderSizeMultiply;
import static ua.softwind.playerOnlineBorder.PlayerOnlineBorder.getMinBorderSize;

public class Utils {
    public static void updateBorderSizeBasedOnPlayerCount() {
        int onlinePlayers = getServer().getOnlinePlayers().size();
        int newBorderSize = onlinePlayers * getBorderSizeMultiply();

        getServer().getWorlds().forEach(world -> world.getWorldBorder().setSize(Math.max(newBorderSize, getMinBorderSize())));
    }
}
