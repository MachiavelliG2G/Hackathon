package data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Fight {
	private ArrayList<Participant> participants;
	private int roundCount;
	
	public Fight () {
		this.participants = new ArrayList<Participant>();
		this.setRoundCount(0);
	}
	
	//setters
	
	public void addParticipant (Participant oParticipant) {
		participants.add(oCharacter);
	}
	
	public void removeParticipant (int iIndex) {
		this.participants.remove(iIndex);
	}
	
	public void setRoundCount (int iRoundCount) {
		if (this.checkRoundCount(iRoundCount)) {
			this.roundCount = iRoundCount;
		}
	}
	
	//getters
	
	public GameCharacter getParticipant (int iIndex) {
		return this.participants.get(iIndex);
	}
	
	public int getRoundCount () {
		return this.roundCount;
	}
	
	//checkers
	
	private boolean checkRoundCount (int iRoundCount) {
		return (iRoundCount >= 0);
	}
	
	//other methods
	
	public void initialize () {
		Random rand = new Random();
		for (Participant part: participants) {
			part.setHealth(100);
			part.setAgility(rand.nextInt(1000000000));
		}
	}
	
	public ArrayList<object> getReihenfolge () {
		Collections.sort(participants, new CustomComparator());
		return participants;
	}
	
	public void attack () {
		for (Participant part: participants) {
			if (part.getType() == 0) {
				// Monster
			} else {
				// Game Character
			}
		}
		roundCount++;
	}
	
	
	
	
	
}
