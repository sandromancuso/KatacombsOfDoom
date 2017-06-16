package org.socrates;

public class MoveNorthCommand {
    private Player player;

    public MoveNorthCommand(Player player) {
        this.player = player;
    }

    public void execute() {
        player.moveNorth();
    }
}
