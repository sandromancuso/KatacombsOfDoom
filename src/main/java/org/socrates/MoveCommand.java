package org.socrates;

import static org.socrates.Direction.NORTH;

class MoveCommand {
    private GameState gameState;
    private Console console;

    MoveCommand(GameState gameState, Console console) {
        this.gameState = gameState;
        this.console = console;
    }

    void execute(Direction direction) {
        gameState.move(NORTH);

        console.write("You are in " + gameState.currentRoom().name());
    }
}
