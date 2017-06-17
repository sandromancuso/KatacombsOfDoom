package org.socrates;

class Commands {

    private LookCommand lookCommand;
    private MoveCommand moveCommand;
    private SuicideCommand suicideCommand;

    Commands(LookCommand lookCommand, MoveCommand moveCommand, SuicideCommand suicideCommand) {
        this.lookCommand = lookCommand;
        this.moveCommand = moveCommand;
        this.suicideCommand = suicideCommand;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            lookCommand.execute();
        }
        if ("Move North".equals(command)) {
            moveCommand.execute();
        }
        if ("Suicide".equals(command)) {
            suicideCommand.execute();
        }
    }
}
