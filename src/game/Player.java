package game;

import fixtures.Room;

public class Player {
	Room currentRoom;
	//Base constructor for Player class inheriting Room variables, which inherit from the base class.
	public Player(Room currentRoom) {
		super();
		this.currentRoom = currentRoom;
	}
	//Getter
	public Room getCurrentRoom()
	{
		return currentRoom;
	}
	//Setter
	public void setCurrentRoom(Room currentRoom)
	{
		this.currentRoom = currentRoom;
	}

}
