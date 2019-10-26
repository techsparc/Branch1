import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class smokeTest {

	static TestScenario run = new TestScenario();
	//This is a git change
	//git hub integration into eclipse 
	
	@BeforeClass
	public static void BrowOpen() {
		
		run.openBrowser();
		
	}
		
	@Test
	
	public void testRun() {
				 	 
	 run.logoVerification();
	 run.scrollDownPixel();
	 run.FindCareer();
	 		
	}
	
	@AfterClass
	public static void CloBro() {
		
		run.closeBrowser();
	}
	
	
}
