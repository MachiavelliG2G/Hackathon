package data;

public class GameCharacter {
	private String name;
	private int health;
	private int attack_power;
	private int defend_power;
	private int staerke;
	
	public GameCharacter (String sName, int iHealth, int iAttackPower, int iDefendPower, int iStaerke) {
		this.setName(sName);
		this.setHealth(iHealth);
		this.setAttackPower(iAttackPower);
		this.setDefendPower(iDefendPower);
		this.setStaerke(iStaerke);
	}
	
	//setters
	
	public void setStaerke (int iStaerke) {
		if (checkStaerke(iStaerke)) {
			this.staerke = iStaerke;
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
	
	public int getStaerke () {
		return this.staerke;
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
	
	private boolean checkStaerke (int iStaerke) {
		return iStaerke >= 0;
	}
}
