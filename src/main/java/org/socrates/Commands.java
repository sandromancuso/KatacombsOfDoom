package org.socrates;

class Commands {

    private LookCommand lookCommand;
    private MoveNorthCommand moveNorthCommand;

    Commands(LookCommand lookCommand, MoveNorthCommand moveNorthCommand) {
        this.lookCommand = lookCommand;
        this.moveNorthCommand = moveNorthCommand;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            lookCommand.execute();
        }
        if ("Move North".equals(command)) {
            moveNorthCommand.execute();
        }
    }
}
