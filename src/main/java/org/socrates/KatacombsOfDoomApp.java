package org.socrates;

import java.util.Optional;

import static java.util.Optional.empty;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        Room northRoom = new Room("North room", empty());
        Room initialRoom = new Room("Initial room", Optional.of(northRoom));
        LookCommand lookCommand = new LookCommand(console);
        GameState gameState = new GameState(new Maze());
        MoveNorthCommand moveNorthCommand = new MoveNorthCommand(gameState, console);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        Commands commands = new Commands(lookCommand, moveNorthCommand, suicideCommand);


        KatacombsOfDoom katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);

        katacombsOfDoom.start();

    }
}
