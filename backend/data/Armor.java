package data;

public class Armor {
	private String name;
	private int rating; //this describes how much the soldier can get hurt 
	
	public Armor (String sName, int iRating) {
		this.setName(sName);
		this.setRating(iRating);
	}
	
	//setters
	
	public void setName (String sName) {
		this.name = sName;
	}
	
	public void setRating (int iRating) {
		if (this.checkRating(iRating)) {
			this.rating = iRating;
		}
	}
	
	//getters
	
	public String getName () {
		return this.name;
	}
	
	public int getRating () {
		return this.rating;
	}
	
	//checkers
	
	private boolean checkRating (int iRating) {
		return ((iRating) >= 0) && ((iRating) <= 100); 
	}
}
