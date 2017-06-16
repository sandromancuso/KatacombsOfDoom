package org.socrates;

class KatacombsOfDoom {

    private Console console;
    private Commands commands;

    KatacombsOfDoom(Console console, Commands commands) {
        this.console = console;
        this.commands = commands;
    }

    void start() {
        console.write("You are in a room.");
        String command = "";
        while (!"Suicide".equals(command = console.read())) {
            commands.execute(command);
        }
        console.write("See you in hell.");
    }
}
