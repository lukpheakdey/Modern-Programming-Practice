package assignment10.school;

public interface IPerson {

	default void myDefault()
	{
		System.out.println("From Default method.. ");
	}
	
    static void myStatic()
	{
		System.out.println("From Static method.. ");
	}
    
    void myAbstract();
}
