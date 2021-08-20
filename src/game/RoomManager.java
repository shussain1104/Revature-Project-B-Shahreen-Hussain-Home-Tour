package game;

import java.util.List;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms = new Room[5];
	//This sets the room details
	public void starting()
	{
		//This sets the details for the Foyer
		Room foyer = new Room("The Foyer","a small foyer",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
						+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		List<String> directions = foyer.getDirections();
	    rooms = new Room[directions.size()];
	    //This sets the details for the library
	    Room library = new Room("The Library","a cozy library",
	    		"This square room has the west and south walls completely covered with built-in bookshelves, the bottoms of which are \n "
	    		+ "storage cabinets. The floor is covered in a large persian rug, atop which 3 antique parlor chairs are arranged "
	    		+ "\n in front of the bookshelves. A small cocktail table sites between the chairs, hosting a stack of books. "
	    		+ "A piano sits \n against the north wall, and windows to the east let in the morning sun. "
	    		+ "The foyer is visible to the south.");
	    this.rooms[1] = library;
	    //This sets the details for the dining room
	    Room dining = new Room("The dining room","a long dining room","This long rectangular room has a table made from hard wood  brown oak \n "
	    		+ "with 8 chairs and has an egyptian cotton-made runner and place mats. An antique clock hangs on the wall with a candle chandelier \n"
	    		+ "hanging from the ceiling. A foyer is open to the North, where a small entryway of a neo-colonial house is, and to the south and east \n"
	    		+ " there are walls surrounding the dining room. ");
	    this.rooms[2] = dining;
	    //This sets the details for the  patio
	    Room patio = new Room("The Patio", "An open yard with a patio deck","French doors on the east side of the dining room wall lead to \n"
	    		+ "an open yard. There is an elevated patio deck made of brown oak with a patio seating set as well. Stairs lead down to the \n"
	    		+ "yard, where sections are sided off start planting a garden.");
	    this.rooms[3] = patio;
	    //The next set of code sets the direction of specific rooms starting from the foyer.
	    rooms[directions.indexOf("South")] = dining;
	    rooms[directions.indexOf("North")] = library;
	    rooms[directions.indexOf("East")] = patio;
	    rooms[directions.indexOf("West")] = null;
	    // This sets the exit points from the foyer
	    foyer.setExits(rooms);
	    //This sets new room directions after entering the library
	    rooms = new Room[directions.size()];
	    rooms[directions.indexOf("South")] = foyer;
	    rooms[directions.indexOf("East")] = patio;
	    rooms[directions.indexOf("West")] = null;
	    // This sets the exit points from the library
	    library.setExits(rooms);
	    //This sets new positions of the rooms after entering the dining room.
	    rooms = new Room[directions.size()];
	    //This sets the position of other rooms based off the dining room.
	    rooms[directions.indexOf("North")] = foyer;
	    rooms[directions.indexOf("East")]= patio;
	    rooms[directions.indexOf("West")] = null;
	 // This sets the exit points from the dining room.
	    dining.setExits(rooms);

	}}
