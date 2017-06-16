package org.socrates;

public class SuicideCommand {

    private Console console;

    public SuicideCommand(Console console) {
        this.console = console;
    }

    public void execute() {
        console.write("See you in hell.");
    }
}
