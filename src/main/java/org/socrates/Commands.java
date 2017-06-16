package org.socrates;

class Commands {

    private LookCommand lookCommand;
    private MoveNorthCommand moveNorthCommand;
    private SuicideCommand suicideCommand;

    Commands(LookCommand lookCommand, MoveNorthCommand moveNorthCommand, SuicideCommand suicideCommand) {
        this.lookCommand = lookCommand;
        this.moveNorthCommand = moveNorthCommand;
        this.suicideCommand = suicideCommand;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            lookCommand.execute();
        }
        if ("Move North".equals(command)) {
            moveNorthCommand.execute();
        }
        if ("Suicide".equals(command)) {
            suicideCommand.execute();
        }
    }
}
