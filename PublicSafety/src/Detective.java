
public class Detective {

	private int badgeNumber;
	
	private String detectiveName;

	public int getBadgeNumber() {
		return this.badgeNumber;
	}

	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	
	public String getDetectiveName() {
		return detectiveName;
	}

	public void setDetectiveName(String detectiveName) {
		this.detectiveName = detectiveName;
	}
	
	public Detective() {
		this.badgeNumber = 0;
		this.detectiveName = "";
	}
	
	public Detective(int badgeNumber, String detectiveName) {
		this.badgeNumber = badgeNumber;
		this.detectiveName = detectiveName;
	}

	@Override
	public String toString() {
		return "Detective [Badge=" + this.badgeNumber + ", Name=" + this.detectiveName + "]"; 
	}
	
	
}
