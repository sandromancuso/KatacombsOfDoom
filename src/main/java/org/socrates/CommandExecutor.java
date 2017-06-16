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

//        if ("Look".equals(command)) {
//            console.write("There is an exit to the north");
//        }
    }
}
