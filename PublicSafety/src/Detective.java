
public class Detective {

	private int badgeNumber;      // the badge number for a detective
	private String detectiveName; // the name of a detective
	
	/*
	 * Constructor for the Detective class that initializes the badge number and detective's name to unused values
	 */
	public Detective() {
		this.badgeNumber = 0;
		this.detectiveName = "";
	}
	
	/*
	 * Get the badge number for a detective
	 * 
	 * @return the integer for a detective's badge number
	 */
	public int getBadgeNumber() {
		return this.badgeNumber;
	}

	/*
	 * Set the badge number for a detective
	 * 
	 * @param badgeNumber the integer to set the detective's badge number to
	 */
	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	/*
	 * Get the detective's name
	 * 
	 * @return the string of the dectives name
	 */
	public String getDetectiveName() {
		return detectiveName;
	}

	/*
	 * Set the detective name
	 * 
	 * @param detectiveName the name of the detective
	 */
	public void setDetectiveName(String detectiveName) {
		this.detectiveName = detectiveName;
	}

	@Override
	public String toString() {
		return "Detective [Badge=" + this.badgeNumber + ", Name=" + this.detectiveName + "]"; 
	}


}
