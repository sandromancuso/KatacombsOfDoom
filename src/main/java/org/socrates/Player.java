package org.socrates;

class Player {

    private Room currentRoom;

    Player(Room initialRoom) {
        this.currentRoom = initialRoom;
    }

    void moveNorth() {
        if (currentRoom.north().isPresent()) {
            currentRoom = currentRoom.north().get();
        }
    }

    Room currentRoom() {
         return currentRoom;
    }
}
