package org.socrates;

class MoveNorthCommand {
    private GameState gameState;
    private Console console;

    MoveNorthCommand(GameState gameState, Console console) {
        this.gameState = gameState;
        this.console = console;
    }

    void execute() {
        gameState.moveNorth();

        console.write("You are in " + gameState.currentRoom().name());
    }
}
