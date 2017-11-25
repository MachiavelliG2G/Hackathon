package server;

import java.util.ArrayList;
import data.*;

public class ParticipantContainer {
	private ArrayList<Participant> participants = new ArrayList<Participant>();
	
	public ParticipantContainer () {
		participants = new ArrayList<Participant>();
	}
	
	public void addParticipant (String sName) {
		Participant oParticipant = new Participant(sName, 100, 20, 20, 0, 1, 0);
		participants.add(oParticipant);
	}
	
	public void removeParticipant (int iIndex) {
		this.participants.remove(iIndex);
	}
	
	public ArrayList<Participant> getParticipants() {
		return this.participants;
	}
}
