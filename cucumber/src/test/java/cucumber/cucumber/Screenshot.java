package cucumber.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static{System.setProperty("webdriver.chrome.driver","H:\\keshav\\chromedriver.exe");}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.quit();

	}
	public static void screenshot()
	{
		
	}

}