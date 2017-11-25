package server;

import java.util.ArrayList;

import data.*;


public class GameManager {
	private ParticipantContainer partCont;
	private Fight fight;
	private static GameManager instance = null;

	public GameManager () {
		partCont = new ParticipantContainer();
		fight = new Fight();
	}
	
	public GameManager instance () {
		if (instance == null) {
			instance = new GameManager();
		}
		return instance;
	}
	
	public void addParticipant (String sName) {
		partCont.addParticipant(sName);
	}
	
	public void setStatus (String sName, int iStatus) {
		ArrayList<Participant> participants = partCont.getParticipants();
		for (Participant part: participants) {
			if (part.getName() == sName) {
				part.setStatus(iStatus);
			}
		}
	}
	
	public ParticipantContainer getParticipantContainer () {
		return this.partCont;
	}
	
	public Fight getFight () {
		return this.fight;
	}
}
