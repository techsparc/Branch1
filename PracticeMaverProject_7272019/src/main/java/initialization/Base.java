package initialization;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	
	public void openBro() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farabi\\Desktop\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
				
	}
	
	public void scrollDown() {
		
		JavascriptExecutor x = (JavascriptExecutor)driver;
		x.executeScript("window.scrollBy(0,10000)");
	}
	
	public void closeBro() {
		
		driver.quit();
	}
	
}
