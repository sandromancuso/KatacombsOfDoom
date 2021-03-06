package org.socrates;

import static org.socrates.Direction.*;

class Commands {

    private LookCommand lookCommand;
    private MoveCommand moveCommand;
    private SuicideCommand suicideCommand;

    Commands(LookCommand lookCommand,
             MoveCommand moveCommand,
             SuicideCommand suicideCommand) {
        this.lookCommand = lookCommand;
        this.moveCommand = moveCommand;
        this.suicideCommand = suicideCommand;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            lookCommand.execute();
        }
        if ("Move North".equals(command)) {
            moveCommand.execute(NORTH);
        }
        if ("Move South".equals(command)) {
            moveCommand.execute(SOUTH);
        }
        if ("Move East".equals(command)) {
            moveCommand.execute(EAST);
        }
        if ("Move West".equals(command)) {
            moveCommand.execute(WEST);
        }
        if ("Suicide".equals(command)) {
            suicideCommand.execute();
        }
    }
}
