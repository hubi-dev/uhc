package xyz.hubi.uhcplugin.runnables;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import xyz.hubi.uhcplugin.services.SidebarGameService;
import xyz.hubi.uhcplugin.services.SidebarService;
import xyz.hubi.uhcplugin.data.Game;

public class ScoreboardRunnable implements Runnable{

    @Override
    public void run() {
        Game game = new Game(1);
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.getWorld().getName().equals("world")) {
                player.setScoreboard(SidebarService.getSidebar(player));
            } else {
                player.setScoreboard(SidebarGameService.getSidebar(player));
            }
        }
    }
}
