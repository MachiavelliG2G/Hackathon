package server;

import java.net.SocketAddress;

import game.ServerConnection;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.scalecube.socketio.Session;
import io.scalecube.socketio.SocketIOAdapter;

public class GameSocketListener extends SocketIOAdapter {
	
	private ServerConnection sc;
	
	
	public GameSocketListener() {
		sc = null;
	}
	
	public void linkServerConnection(ServerConnection sc) {
		this.sc = sc; 
	}
	
	
	public void onConnect(Session session) {
	     if(sc == null)
	    	 return;
	}
	  
	public void onMessage(Session session, ByteBuf message) {
		if(sc == null)
	    	 return;
	     sc.interpretJSON(message.toString());
	     
	     
	     String s = sc.getUpdateString();
	     ByteBuf update = Unpooled.wrappedBuffer(s.getBytes());

	     session.send(update);
	     
	     
	 }
		  
	 public void onDisconnect(Session session) {
		 if(sc == null)
		     return;
	 }
	  
  }