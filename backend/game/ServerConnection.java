package game;

import data.*;
import server.ServerHandler;

import java.io.StringReader;

import javax.json.*;

public class ServerConnection {

	private ServerHandler sh;
	
	
	public ServerConnection() {
		sh = null;
	}
	 
	public void linkServerHandler(ServerHandler sh) {
		this.sh = sh;
	}
	
	
	public void postFightUpdate(Fight f, GameCharacter gc) {
		//Construct JSON
		
		//Hand to server manager
		
	}
	
	public void postCharacterUpdate(GameCharacter gc) {
		//Construct JSON
		
		//Hand to server manager
	}
	
	public void postWorldUpdate(World w, GameCharacter gc) {
		//Construct JSON
		
		//Hand to server manager
		
	}
	
	
	//user actions
	public void interpretJSON(String JSON) {
		//interpret  JSON

		JsonReader jsonReader = Json.createReader(new StringReader(JSON));
		JsonObject o = jsonReader.readObject();
		
		/*
		JsonReader jsonReader = Json.createReader(new StringReader(JSON));
		JsonArray arr = jsonReader.readArray();

		String command = arr.getString(0);
		String name = arr.getString(1);
		
		System.out.println(command);
		System.out.println(name);
		
		int a = 0;
		*/
	}
	
	
	private void receiveFightCommand(GameCharacter c, String command) {
		
	}
	
	private void receiveMoveCommand(GameCharacter c, String command) {
		
	}
	
	
	private void receiveNewPlayer(String name) {
		
	}
	
	
	public static void main(String args[]) {
		String dummyFightCommand = "{command:\"NEW_PLAYER\",name:\"Simon\"}";
		String dummyMoveCommand = "{body:[{type:'command_move', target='3'}]}";

		ServerConnection sc = new ServerConnection();
		
		sc.interpretJSON(dummyFightCommand);
		
	}
	
	
}
