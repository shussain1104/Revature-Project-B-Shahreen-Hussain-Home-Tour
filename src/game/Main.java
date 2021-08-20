package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[]args)
	{
		//pulls up the room information from RoomManager class
		RoomManager manager = new RoomManager();
		manager.starting();
		//Creates a new player and sets them in the foyer as that is set as the starting room, and will then collect user input from there.
		Player player = new Player(manager.startingRoom);
		while(true)
		{
			printRoom(player);
			parse(collectInput(), player);
		}
	}
	//This will print the room the player is currently in in characters of string
	private static void printRoom(Player player)
	{
		System.out.println(player.getCurrentRoom().toString());
	}
	//This will get user input 
	private static String[] collectInput() 
	{
		return userinput.nextLine().split("");
	}
	//This will explain the user which way to go to leave the room and how to proceed.
	private static void parse( String[] command, Player player)
	{
		switch(command[0])
		{
		case "go":
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
			break;
		case "exit":
			player.setCurrentRoom(player.getCurrentRoom().getExit(null));
			userinput.close();
		default:
			break;
		}
	}
}
