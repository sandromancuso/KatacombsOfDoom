package org.socrates;

class Commands {

    private LookCommand lookCommand;

    Commands(LookCommand lookCommand) {
        this.lookCommand = lookCommand;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            lookCommand.execute();
        }
    }
}
