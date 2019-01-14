package Lab7.level4Enum;

public enum Constants {
	
	SCHOOL("MUM"),
	LOCATION("IA"),
	ZIPCODE(52557);
	
	int intVal;
	String strVal;
	
	Constants(int x){
		intVal = x;
	}
	
	Constants(String x){
		strVal = x;
	}
	
	public int intVal() {
		return intVal;
	}

	public String strVal() {
		return strVal;
	}

}
