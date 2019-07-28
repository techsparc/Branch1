package initialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Utility extends Base {

	public void cusClick(By var) {

		driver.findElement(var).click();

	}
	
	public void cusSenKey(By kola, String v) {
		
		driver.findElement(kola).sendKeys(v);
	}

	

		public Properties PropertyFileTest() throws IOException {

			FileInputStream pull = new FileInputStream("repo.properties");

			Properties hex = new Properties();

			hex.load(pull);
			return hex;
	
}
