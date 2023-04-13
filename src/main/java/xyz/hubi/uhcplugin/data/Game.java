package xyz.hubi.uhcplugin.data;

import java.util.UUID;
import java.util.stream.Stream;

public class Game {

    private final int gameID;
    private int gameTime;
    private boolean isGame;

    public Game(final Integer gameID) {
        this.gameID = gameID;
        this.gameTime = 0;
        this.isGame = false;
    }



    public int getGameTime() {
        return this.gameTime;
    }

    public void setGameTime(final int gameTime) {
        this.gameTime = gameTime;
    }

    public void setGame(final boolean isGame) {
        this.isGame = isGame;
    }

    public boolean isGame() {
        return this.isGame;
    }

}
