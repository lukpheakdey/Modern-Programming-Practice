package Lab7.level4Enum;

public final class TestImmutable {

	final String name;
	final String id;
	
	TestImmutable(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
}
