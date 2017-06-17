package org.socrates;

class MoveCommand {
    private GameState gameState;
    private Console console;

    MoveCommand(GameState gameState, Console console) {
        this.gameState = gameState;
        this.console = console;
    }

    void execute(Direction north) {
        gameState.moveNorth();

        console.write("You are in " + gameState.currentRoom().name());
    }
}
