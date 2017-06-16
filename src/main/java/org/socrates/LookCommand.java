package org.socrates;

class LookCommand {

    private Console console;

    LookCommand(Console console) {
        this.console = console;
    }

    void execute() {
        console.write("There is an exit to the north");
    }
}
