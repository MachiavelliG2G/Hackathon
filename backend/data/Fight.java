package data;

public class Fight {
	private ArrayList<GameCharacter> participants;
	private int roundCount;
	private Monster monster;
	
	public Fight (int iRoundCount, Monster oMonster) {
		this.participants = new ArrayList<GameCharacter>();
		this.setMonster(oMonster);
		this.setRoundCount(iRoundCount);
	}
	
	//setters
	
	public void addParticipant (GameCharacter oCharacter) {
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
	
	public void setMonster (Monster oMonster) {
		this.monster = oMonster;
	}
	
	//getters
	
	public GameCharacter getParticipant (int iIndex) {
		return this.participants.get(iIndex);
	}
	
	public int getRoundCount () {
		return this.roundCount;
	}
	
	public Monster getMonster () {
		return this.monster;
	}
	
	//checkers
	
	private boolean checkRoundCount (int iRoundCount) {
		return (iRoundCount >= 0);
	}
	
}
