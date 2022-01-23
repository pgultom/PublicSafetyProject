
public class PublicSafety {

	private Station universityStation;
	private Station cityStation;
	
	public PublicSafety(String string, String string2) {
		// TODO Auto-generated constructor stub
		if (string == "CSM") {
			String [] detectives = {};
			universityStation = new Station(detectives); 
		}
		else if (string == "CU") {
			String [] detectives = {};
			cityStation = new Station(detectives); 
		}
	}

	public void doHire(boolean b) {
		// TODO Auto-generated method stub
		if (b) {
			cityStation.hireDetective();
		}
		else {
			universityStation.hireDetective();
		}
		
	}

	public void printDetectiveLists() {
		// TODO Auto-generated method stub
		
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
