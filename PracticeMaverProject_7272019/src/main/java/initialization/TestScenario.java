package initialization;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class TestScenario {

	public void tt() throws IOException {

		Utility mag = new Utility();

		Properties	dagon = mag.PropertyFileTest();
		



		mag.cusClick(By.xpath(dagon.getProperty("more")));
		mag.cusClick(By.xpath(dagon.getProperty("career")));
		//mag.cusClick(By.xpath(xpathExpression));
	}


}
