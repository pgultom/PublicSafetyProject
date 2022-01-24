
public class PublicSafety {

	private Station universityStation; // the university station object for a given public safety object
	private Station cityStation;       // the city station object for a given public safety object

	/*
	 * Constructor for the PublicSafety class.
	 * Sets universityStation to param string 
	 * Sets cityStation to param string2 
	 * 
	 * @param string the string for initializing the universityStation object
	 * @param string2 the string for initializing the cityStation object
	 */
	public PublicSafety(String string, String string2) {
		if (string == "CSM") {
			universityStation = new Station(string); 
		}
		else if (string == "CU") {
			universityStation = new Station(string); 
		}

		if (string2 == "Golden") {
			cityStation = new Station(string2); 
		}
		else if (string2 == "Boulder") {
			cityStation = new Station(string2); 
		}
	}

	/*
	 * Hire a detective. If param b is true, hire a detective for cityStation.
	 * If param b is false, hire a detective for universityStation
	 * If the total number detectives has been reached for a given statio, 
	 * can no longer hire a detective.
	 * 
	 * @param b the boolean indicating which station to hire a detective for
	 */
	public void doHire(boolean b) {
		if (b) {
			if(cityStation.getDetectiveCount() < Station.getTotalDetectives()) {
				cityStation.hireDetective();
			}
			else {
				System.out.println("Can't hire any more detectives for " + cityStation.getStationName());
			}
		}
		else {
			if(universityStation.getDetectiveCount() < Station.getTotalDetectives()) {
				universityStation.hireDetective();
			}
			else {
				System.out.println("Can't hire any more detectives for " + universityStation.getStationName());
			}
		}
	}

	/*
	 * Print the list of detectives to the console, for all of the detective in each station
	 */
	public void printDetectiveLists() {
		System.out.println("List of detectives for " + cityStation.getStationName());
		for(int i = 0; i < cityStation.getArrDetectives().length; i++) {
			// if the badge number is not the defuault zero, print the dective
			if(cityStation.getArrDetectives()[i].getBadgeNumber() != 0) {
				System.out.println(cityStation.getArrDetectives()[i]);
			}

		}
		System.out.println("\nList of detectives for " + universityStation.getStationName());
		for(int i = 0; i < universityStation.getArrDetectives().length; i++) {
			// if the badge number is not the defuault zero, print the dective
			if(universityStation.getArrDetectives()[i].getBadgeNumber() != 0) {
				System.out.println(universityStation.getArrDetectives()[i]);
			}
		}
		System.out.println();
	}
}
