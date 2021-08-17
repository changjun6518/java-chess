package domain.player;

import domain.piece.ColorCase;

public class Player {
    private String name;
    private ColorCase color;

    public Player(String name, ColorCase color) {
        this.name = name;
        this.color = color;
    }
}
