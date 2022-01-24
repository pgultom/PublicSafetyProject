import java.util.Scanner;

public class Station {

	public static final int TOTAL_DETECTIVES = 5;
	public static int lastBadgeNumber = 1;
	public Detective [] arrDetectives = new Detective[TOTAL_DETECTIVES];
	public String stationName;
	public static Scanner sc = new Scanner(System.in);
	
	public int detectiveCount = 0;
	
	public int getDetectiveCount() {
		return detectiveCount;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	public static int getTotalDetectives() {
		return TOTAL_DETECTIVES;
	}
	
	public boolean hireDetective() {
		System.out.print("New hire for " + this.stationName + "...Enter detective's name: ");
		String name = sc.nextLine();
		
		for(int i = 0; i < arrDetectives.length; i++) {
			
			if(i == arrDetectives.length - 1 && arrDetectives[i].getBadgeNumber() != 0) {
				return false;
			}
			else if(arrDetectives[i].getBadgeNumber() == 0 && arrDetectives[i].getDetectiveName() == "") {
				arrDetectives[i].setDetectiveName(name);
				arrDetectives[i].setBadgeNumber(lastBadgeNumber);
				lastBadgeNumber++;
				detectiveCount++;
				break;
			}
		}
		
		return true;
	}

	public Detective[] getArrDetectives() {
		return arrDetectives;
	}

	public Station(String stationName) {
		super();
		this.stationName = stationName;
		for(int i = 0; i < this.arrDetectives.length; i++) {
			this.arrDetectives[i] = new Detective();
		}
	}

	

}
