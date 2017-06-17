package org.socrates;

public class KatacombsOfDoomApp {

    public static void main(String[] args) {
        Console console = new Console();
        Room initialRoom = new Room("Initial room");
        LookCommand lookCommand = new LookCommand(console);
        Player player = new Player(initialRoom);
        MoveNorthCommand moveNorthCommand = new MoveNorthCommand(player, console);
        SuicideCommand suicideCommand = new SuicideCommand(console);
        Commands commands = new Commands(lookCommand, moveNorthCommand, suicideCommand);


        KatacombsOfDoom katacombsOfDoom = new KatacombsOfDoom(initialRoom, commands, console);

        katacombsOfDoom.start();

    }
}
