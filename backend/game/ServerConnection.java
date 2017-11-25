package game;

import data.*;
import server.ServerHandler;

import java.io.StringReader;

import javax.json.*;

public class ServerConnection {

	private ServerHandler sh;
	//private GameManager gm;
	
	private static final String CMD_NEW = "NEW_PLAYER";
	private static final String CMD_ATTACK = "ATTACK";
	private static final String CMD_SPECIAL = "SPECIAL";
	
	
	
	public ServerConnection() {
		sh = null;
		//gm = null;
	}
	 
	
	//public void linkGameManager(GameManager gm) {
		//this.gm = gm;
	//}
	
	public void linkServerHandler(ServerHandler sh) {
		this.sh = sh;
	}
	
	public String getUpdateString() {
		return "Nein";
	}
	
	//user actions
	public void interpretJSON(String JSON) {
		//interpret  JSON
		try {
			JsonReader jsonReader = Json.createReader(new StringReader(JSON));
			JsonArray arr = jsonReader.readArray();

			String command = arr.getString(0);
			String name = arr.getString(1);
			
			if(command == this.CMD_NEW) {
				this.receiveNewPlayer(name);
			}
			if(command == this.CMD_ATTACK) {
				this.receiveFightCommand(name);
			}
			if(command == this.CMD_SPECIAL) {
				this.receiveSpecialCommand(name);
			}		
				
			int a = 0;			
		}
		catch(Exception e) {
				
		}

	}
	
	
	private void receiveFightCommand(String name) {
		
	}
	
	private void receiveSpecialCommand(String name) {
		
	}
	
	
	private void receiveNewPlayer(String name) {
		
	}
	
	
}
