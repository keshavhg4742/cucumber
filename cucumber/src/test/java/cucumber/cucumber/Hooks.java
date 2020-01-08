package cucumber.cucumber;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Method;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	ExtentReports extent;
	ExtentTest Test;
	Method method;

	@Before
	public void launch_browse()
	{
		System.setProperty("webdriver.chrome.driver","D:\\keshav\\keshav\\ranf\\drivers\\chromedriver.exe");


		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*extent=new ExtentReports(".\\extentreport\\report.html",true);
		
		Test=extent.startTest((this.getClass().getSimpleName()+" : : "+method.getName()));
		Test.assignCategory("Regression");
		Test.assignAuthor("Shiva");*/

		//driver.quit();

	}
	@After
	public  void screenshot(Scenario s)
	{if(s.isFailed())
	{
		try {
			Robot r = new Robot();
			BufferedImage bufferedImage = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(bufferedImage, "png", new File(".\\target"+s.toString()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//extent.flush();

	}
	}
	
	/*@BeforeTest
	public void Generate_ER()
	{
		extent=new ExtentReports(".\\extentreport\\report.html",true);
	}

	@BeforeMethod
	public void Send_method_to_report(Method method)
	{
		Test=extent.startTest((this.getClass().getSimpleName()+" : : "+method.getName()));
		Test.assignCategory("Regression");
		Test.assignAuthor("Shiva");

	}*/

}
