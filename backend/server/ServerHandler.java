package server;


import game.ServerConnection;
import io.scalecube.*;
import io.scalecube.socketio.SocketIOServer;


public class ServerHandler {
    
	private SocketIOServer server;
	private ServerConnection sc;
	
	public void linkServerConnection(ServerConnection sc) {
		this.sc = sc;
	}
	
	public void open() {
		server = SocketIOServer.newInstance(5000);
		
		GameSocketListener ls = new GameSocketListener();
		ls.linkServerConnection(sc);
		server.start();
	}
	

	
	
}

