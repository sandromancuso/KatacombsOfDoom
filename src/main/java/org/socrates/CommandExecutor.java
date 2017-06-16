package org.socrates;

class CommandExecutor {

    private LookCommand lookCommand;

    public CommandExecutor(LookCommand lookCommand) {
        this.lookCommand = lookCommand;
    }

    void execute(String command) {
        if ("Look".equals(command)) {
            lookCommand.execute();
        }
    }
}
