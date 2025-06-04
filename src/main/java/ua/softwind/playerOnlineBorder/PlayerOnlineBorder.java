package ua.softwind.playerOnlineBorder;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import ua.softwind.playerOnlineBorder.listeners.PlayerJoinQuitListener;

import static org.bukkit.Bukkit.getServer;

public final class PlayerOnlineBorder extends JavaPlugin implements Listener {
    private final int BORDER_SIZE_MULTIPLY = getConfig().getInt("borderSizeMultiply", 1000);
    private final int MIN_BORDER_SIZE = getConfig().getInt("minBorderSize", 1000);

    private static PlayerOnlineBorder instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerJoinQuitListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static PlayerOnlineBorder getInstance() {
        return instance;
    }

    public static int getBorderSizeMultiply() {
        return getInstance().BORDER_SIZE_MULTIPLY;
    }

    public static int getMinBorderSize() {
        return getInstance().MIN_BORDER_SIZE;
    }
}
