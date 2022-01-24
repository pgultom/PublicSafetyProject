
public class PublicSafety {

	private Station universityStation;
	private Station cityStation;
	
	public PublicSafety(String string, String string2) {
		// TODO Auto-generated constructor stub
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

	public void doHire(boolean b) {
		// TODO Auto-generated method stub
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

	public void printDetectiveLists() {
		System.out.println("List of detectives for " + cityStation.getStationName());
		for(int i = 0; i < cityStation.getArrDetectives().length; i++) {
			if(cityStation.getArrDetectives()[i].getBadgeNumber() != 0) {
				System.out.println(cityStation.getArrDetectives()[i]);
			}
			
		}
		System.out.println("\nList of detectives for " + universityStation.getStationName());
		for(int i = 0; i < universityStation.getArrDetectives().length; i++) {
			if(universityStation.getArrDetectives()[i].getBadgeNumber() != 0) {
				System.out.println(universityStation.getArrDetectives()[i]);
			}
		}
		System.out.println();
	}

	public Station getSchoolStation() {
		return universityStation;
	}

	public void setSchoolStation(Station schoolStation) {
		this.universityStation = schoolStation;
	}

	public Station getTownStation() {
		return cityStation;
	}

	public void setTownStation(Station townStation) {
		this.cityStation = townStation;
	}

	
	
}
