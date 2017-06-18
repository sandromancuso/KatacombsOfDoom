package org.socrates;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        Room initialRoom = new Room("Initial room");
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
