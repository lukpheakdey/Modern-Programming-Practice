 
import junit.framework.TestCase;

public class TestCalculateTwoInteger extends TestCase {

	public static void main(String[] args) {
	}

	public TestCalculateTwoInteger(String arg0) {
		super(arg0);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	   public void testSum () {
		   
		   CalculateTwoInteger c1 = new CalculateTwoInteger();		 
		   int result = c1.sum(10, 50);
		   assertEquals(60, result);  		   
	   }
	   
   public void testProduct () {
		   
		   CalculateTwoInteger c1 = new CalculateTwoInteger();		 
		   int result = c1.product(10, 3);
		   assertEquals(80, result);	   		   
	   }

}
