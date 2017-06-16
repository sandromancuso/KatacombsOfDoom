package org.socrates;

class KatacombsOfDoom {

    private Console console;

    KatacombsOfDoom(Console console) {
        this.console = console;
    }

    void start() {
        console.write("You are in a room.");
        String command = "";
        while (!"Suicide".equals(command = console.read())) {
            if ("Look".equals(command)) {
                console.write("There is an exit to the north");
            }
        }
        console.write("See you in hell.");
    }
}
