package org.socrates;

class KatacombsOfDoom {

    private Console console;
    private CommandExecutor commandExecutor;

    KatacombsOfDoom(Console console, CommandExecutor commandExecutor) {
        this.console = console;
        this.commandExecutor = commandExecutor;
    }

    void start() {
        console.write("You are in a room.");
        String command = "";
        while (!"Suicide".equals(command = console.read())) {
            commandExecutor.execute(command);
        }
        console.write("See you in hell.");
    }
}
