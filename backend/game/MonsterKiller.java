package game;

import server.ServerHandler;

public class MonsterKiller {

	public static void main(String args[]) {
		
		ServerConnection sc = new ServerConnection();
		ServerHandler sh = new ServerHandler();
		
		sc.linkServerHandler(sh);
		sh.linkServerConnection(sc);
		sh.open();
		
	}
	
}
