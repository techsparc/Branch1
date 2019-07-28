package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Test;

import initialization.Base;
import initialization.TestScenario;

public class SmokeTest {

	

		@BeforeClass
		public static void bo() {
			
		Base op = new Base();
		op.openBro();
		op.scrollDown();
		}
		
		@Test
		public void ts() throws IOException {
			
		TestScenario dora = new TestScenario();
		
		dora.tt();
		
		//op.closeBro();
		
	}
	
}
