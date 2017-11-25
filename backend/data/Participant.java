package data;

public class Participant {
	private String name;
	private int health;
	private int attack_power;
	private int defend_power;
	private int agility;
	private int type; // 0 ist Monster, 1 ist GameCharacter
	private int status; //0 disconnected 1 besiegt/tot 2 ready 3 not ready
	
	public Participant (String sName, int iHealth, int iAttackPower, int iDefendPower, int iAgility, int iType, int iStatus) {
		this.setName(sName);
		this.setHealth(iHealth);
		this.setAttackPower(iAttackPower);
		this.setDefendPower(iDefendPower);
		this.setAgility(iAgility);	
		this.setType(iType);
		this.setStatus(iStatus);
	}
	
	//setters
	
	public void setType (int iType) {
		if (iType == 0 || iType == 1) {
			this.type = iType;
		}
	}
	
	public void setStatus (int iStatus) {
		if (iStatus >= 0 && iStatus <= 3) {
			this.status = iStatus;
		}
	}
	
	public void setAgility (int iAgility) {
		if (checkAgility(iAgility)) {
			this.agility = iAgility;
		}
	}
	
	public void setName (String sName) {
		this.name = sName;
	}
	
	public void setHealth (int iHealth) {
		if (this.checkHealth(iHealth)) {
			this.health = iHealth;
		}
	}
	
	public void setAttackPower (int iAttackPower) {
		if (this.checkAttackPower(iAttackPower)) {
			this.attack_power = iAttackPower;
		}
	}
	
	public void setDefendPower (int iDefendPower) {
		if (this.checkDefendPower(iDefendPower)) {
			this.defend_power = iDefendPower;
		}
	}
	
	//getters
	
	public String getName () {
		return this.name;
	}
	
	public int getHealth () {
		return this.health;
	}
	
	public int getAttackPower () {
		return this.attack_power;
	}
	
	public int getDefendPower () {
		return this.defend_power;
	}
	
	public int getAgility () {
		return this.agility;
	}
	
	public int getType () {
		return this.type;
	}
	
	public int getStatus () {
		return this.status;
	}
	
	//checkers
	
	private boolean checkHealth (int iHealth) {
		return (iHealth >= 0) && (iHealth <= 100);
	}
	
	private boolean checkAttackPower (int iAttackPower) {
		return (iAttackPower > 0);
	}
	
	private boolean checkDefendPower (int iDefendPower) {
		return (iDefendPower > 0);
	}
	
	private boolean checkAgility (int iAgility) {
		return iAgility >= 0;
	}
}

