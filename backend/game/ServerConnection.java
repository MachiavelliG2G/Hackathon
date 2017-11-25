package game;

import data.*;
import server.ServerHandler;

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
		//break up  JSON
		
	}
	
	
	private void receiveFightCommand(GameCharacter c, String command) {
		
	}
	
	private void receiveMoveCommand(GameCharacter c, String command) {
		
	}
	
	
	
}
