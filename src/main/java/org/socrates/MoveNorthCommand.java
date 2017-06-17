package org.socrates;

class MoveNorthCommand {
    private Player player;
    private Console console;

    MoveNorthCommand(Player player, Console console) {
        this.player = player;
        this.console = console;
    }

    void execute() {
        player.moveNorth();

        console.write("You are in " + player.currentRoom().name());
    }
}
