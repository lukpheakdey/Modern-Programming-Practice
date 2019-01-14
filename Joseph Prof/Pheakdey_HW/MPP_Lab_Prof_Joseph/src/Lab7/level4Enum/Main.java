package Lab7.level4Enum;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Test Enum");
		System.out.println(Constants.SCHOOL.strVal);
		System.out.println(Constants.LOCATION.strVal);
		System.out.println(Constants.ZIPCODE.intVal);
		
		
		//Test Immutable Class
		System.out.println("\n\nTest Immutabale Class");
		TestImmutable im = new TestImmutable("Pheakdey", "986591");
		System.out.println(im.getName());
		System.out.println(im.getId());
		
		// Error with Immutable
		//im.name = "LUK";

	}

}
