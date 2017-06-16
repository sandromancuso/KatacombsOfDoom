package org.socrates;

class CommandExecutor {

    private Console console;

    public CommandExecutor(Console console) {
        this.console = console;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            console.write("There is an exit to the north");
        }
    }
}
