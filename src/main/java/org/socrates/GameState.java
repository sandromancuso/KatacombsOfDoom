package org.socrates;

class GameState {

    private Room currentRoom;

    GameState(Room initialRoom) {
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
