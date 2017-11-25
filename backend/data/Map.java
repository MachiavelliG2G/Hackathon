package data;

public class Map {
	private int id;
	private String name;
	private int anzahlMonster;
	
	public Map (int iId, String sName, int iAnzahlMonster) {
		this.setId(iId);
		this.setName(sName);
		this.setAnzahlMonster(iAnzahlMonster);
	}
	
	//setters
	
	public void setId (int iId) {
		this.id = iId;
	}
	
	public setName (String sName) {
		this.name = sName;
	}
	
	public setAnzahlMonster (int iAnzahlMonster) {
		if (checkAnzahlMonster(iAnzahlMonster)) {
			this.anzahlMonster = iAnzahlMonster;
		}
	}
	
	//getters
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAnzahlMonster() {
		return this.anzahlMonster;
	}
	//checkers
	
	private boolean checkAnzahlMonster (int iAnzahlMonster) {
		return (iAnzahlMonster > 0);
	}
}
