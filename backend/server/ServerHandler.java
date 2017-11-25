package server;


import io.scalecube.*;
import io.scalecube.socketio.SocketIOServer;


public class ServerHandler {
    
	private SocketIOServer server;
	
	public void open() {
		server = SocketIOServer.newInstance(5000);
	}
	

	public static void main(String[] args) {
		
		ServerHandler sh = new ServerHandler();
		
		sh.open();
		
	}
	
}

