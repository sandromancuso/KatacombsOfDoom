package org.socrates;

import java.util.Optional;

import static java.util.Optional.empty;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        Room northRoom = new Room("North room", empty());
        Room initialRoom = new Room("Initial room", Optional.of(northRoom));
        LookCommand lookCommand = new LookCommand(console);
        Position initialPosition = new Position(0, 0);
        Maze maze = new Maze(initialPosition);
        GameState gameState = new GameState(maze);
        MoveCommand moveCommand = new MoveCommand(gameState, console);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        Commands commands = new Commands(lookCommand, moveCommand, suicideCommand);


        KatacombsOfDoom katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);

        katacombsOfDoom.start();

    }
}
