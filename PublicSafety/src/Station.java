import java.util.Scanner;

public class Station {

	public static final int TOTAL_DETECTIVES = 5;                        // total number of detectives for any given station
	public static int lastBadgeNumber = 1;                               // holds value of last badge number currently assigned 
	public Detective [] arrDetectives = new Detective[TOTAL_DETECTIVES]; // inital array to hold detectives for a given station
	public String stationName;                                           // the name of the station
	public static Scanner sc = new Scanner(System.in);                   // the scanner object
	public int detectiveCount = 0;                                       // counter for number of detectives assigned

	/*
	 * Get the total number of detectives hired
	 * 
	 * @return the integer of detectives hired
	 */
	public int getDetectiveCount() {
		return detectiveCount;
	}

	/*
	 * Get the name of the station
	 * 
	 * @return the string containing the station name
	 */
	public String getStationName() {
		return stationName;
	}

	/*
	 * Gets the constant for the total number of detectives
	 * 
	 * @return total number of detectives for a given station
	 */
	public static int getTotalDetectives() {
		return TOTAL_DETECTIVES;
	}

	/*
	 * Hire a detective for a given station.
	 * 
	 * @return if a detective was successfully hired
	 */
	public boolean hireDetective() {
		System.out.print("New hire for " + this.stationName + "...Enter detective's name: ");
		String name = sc.nextLine(); // get the name of a detective from the user using Scanner

		for(int i = 0; i < arrDetectives.length; i++) {
			// If at the end of the array of detectives and the badge number is already set to a number other than the default zero, cannot hire.
			if(i == arrDetectives.length - 1 && arrDetectives[i].getBadgeNumber() != 0) {
				return false;
			}
			// If a detective can be added, set dective name and badge number, increment last badge number for all stations 
			// and the total number of detecives hired for the given station
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

	/*
	 * Get the array of detectives for a given station
	 * 
	 * @return the detective array
	 */
	public Detective[] getArrDetectives() {
		return arrDetectives;
	}

	/*
	 * Constructor for the Station class. Initializes the array of detectives
	 * using base Detective constructor
	 * 
	 * @param stationName the name of the station
	 */
	public Station(String stationName) {
		super();
		this.stationName = stationName;
		for(int i = 0; i < this.arrDetectives.length; i++) {
			this.arrDetectives[i] = new Detective();
		}
	}



}
