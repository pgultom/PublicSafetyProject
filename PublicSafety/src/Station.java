 
public class Station {

	public static final int TOTAL_DETECTIVES = 0;
	public static int lastBadgeNumber;
	public String [] arrDetectives;
	
	public static int getLastBadgeNumber() {
		return lastBadgeNumber;
	}
	
	public static void setLastBadgeNumber(int lastBadgeNumber) {
		Station.lastBadgeNumber = lastBadgeNumber;
	}
	
	public static int getTotalDetectives() {
		return TOTAL_DETECTIVES;
	}
	
	public boolean hireDetective() {
		return true;
	}

	public Station(String[] arrDetectives) {
		super();
		this.arrDetectives = arrDetectives;
	}

}
