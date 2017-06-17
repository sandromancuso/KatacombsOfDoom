package org.socrates;

class KatacombsOfDoom {

    private final Room room;
    private Console console;
    private Commands commands;

    KatacombsOfDoom(Room initialRoom, Commands commands, Console console) {
        this.room = initialRoom;
        this.commands = commands;
        this.console = console;
    }

    void start() {
        console.write("You are in " + room.name());
        String command = "";
        while (!"Suicide".equals(command = console.read())) {
            commands.execute(command);
        }
        commands.execute("Suicide");
    }
}
