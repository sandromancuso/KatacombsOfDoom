package org.socrates;

import java.util.HashMap;
import java.util.Map;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        LookCommand lookCommand = new LookCommand(console);


        Room initialRoom = new Room("Initial room");
        Position initialPosition = new Position(0, 0);

        Room northRoom = new Room("North room");
        Position northPosition = new Position(0, 1);

        Room eastRoom = new Room("East room");
        Position eastPosition = new Position(1, 1);

        Map<Position, Room> rooms = new HashMap<>();
        rooms.put(initialPosition, initialRoom);
        rooms.put(northPosition, northRoom);
        rooms.put(eastPosition, eastRoom);

        Maze maze = new Maze(initialPosition, rooms);


        GameState gameState = new GameState(maze);
        MoveCommand moveCommand = new MoveCommand(gameState, console);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        Commands commands = new Commands(lookCommand, moveCommand, suicideCommand);


        KatacombsOfDoom katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);

        katacombsOfDoom.start();

    }
}
