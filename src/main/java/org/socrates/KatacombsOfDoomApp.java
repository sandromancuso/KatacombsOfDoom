package org.socrates;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        LookCommand lookCommand = new LookCommand(console);
        Player player = new Player();
        MoveNorthCommand moveNorthCommand = new MoveNorthCommand(player);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        Commands commands = new Commands(lookCommand, moveNorthCommand, suicideCommand);

        Room initialRoom = new Room("Initial room");

        KatacombsOfDoom katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);

        katacombsOfDoom.start();

    }
}
