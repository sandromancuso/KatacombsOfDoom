package org.socrates;

import java.util.Optional;

import static java.util.Optional.empty;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        Room northRoom = new Room("North room", empty());
        Room initialRoom = new Room("Initial room", Optional.of(northRoom));
        LookCommand lookCommand = new LookCommand(console);
        Player player = new Player(initialRoom);
        MoveNorthCommand moveNorthCommand = new MoveNorthCommand(player, console);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        Commands commands = new Commands(lookCommand, moveNorthCommand, suicideCommand);


        KatacombsOfDoom katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);

        katacombsOfDoom.start();

    }
}
