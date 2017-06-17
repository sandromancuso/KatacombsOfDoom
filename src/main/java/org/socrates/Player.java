package org.socrates;

class Player {

    private Room currentRoom;

    Player(Room initialRoom) {
        this.currentRoom = initialRoom;
    }

    void moveNorth() {
    }

    Room currentRoom() {
         return currentRoom;
    }
}
