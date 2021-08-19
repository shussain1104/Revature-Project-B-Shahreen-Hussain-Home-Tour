package fixtures;

import java.util.Arrays;
import java.util.List;

public class Room extends Fixture{

	private Room[] exits;
	private List<String> directions = Arrays.asList("North", "East", "South", "West");
	public Room() {
		// TODO Auto-generated constructor stub
	}
	public Room(String name, String shortDescription,String longDescription) {
		super(name,shortDescription,longDescription);
		this.setExits(new Room[20]);
	}

	/**
	 * @return the exits
	 */
	public Room[] getExits() {
		return exits;
	}
	/**
	 * @param exits the exits to set
	 */
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	// Returns the room based off the direction the user inputs by looking at the index
	public Room getExit(String direction)
	{
		return exits[directions.indexOf(direction)];
	}
	//Getter for directions List to ensure the direction user inputs is properly returned.
	public List<String> getDirections()
	{
		return directions;
	}
	//Setter for directions List to ensure user input matches existing data list
	public void setDirections(List<String> directions)
	{
		this.directions = directions;
	}
	@Override //This will return the direction of the exits based off the room.
	public String toString()
	{
		String exits = "";
		for(String direction: this.directions)
		{
			if(getExit(direction)!= null)
			{
				exits += (direction + "  :  " + getExit(direction).getShortDescription() + "\n");
			}
		}
		return this.getName() + "\n" + this.getLongDescription() + "\n" + "Exits:\n Which way do you want to go? \n" + exits;
	}
}
