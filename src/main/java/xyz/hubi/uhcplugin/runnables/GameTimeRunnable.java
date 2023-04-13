package xyz.hubi.uhcplugin.runnables;

import org.bukkit.Bukkit;
import xyz.hubi.uhcplugin.utils.ChatHelper;
import xyz.hubi.uhcplugin.data.GameManager;

public class GameTimeRunnable implements Runnable {



    public static int czasgry = GameManager.game.getGameTime();

    @Override
    public void run() {
        czasgry++;
        if (czasgry == 30) {
            Bukkit.broadcastMessage(ChatHelper.fix("&8>> &7Test wiadomosc"));
        }

    }
}
