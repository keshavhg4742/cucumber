package cucumber.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pagelibrary.BranchesPage;
import pagelibrary.LoginPage;

public class Step_defination {
	WebDriver driver;
	public Step_defination() {
		this.driver=Hooks.driver;

	}

	@Given("^Launch the site$")
	public void Launch_the_site() throws Throwable {
		
		driver.get("http://183.82.100.55/ranford1/home.aspx");

	}

	@When("^Enter the username with \"([^\"]*)\" and password with \"([^\"]*)\" and click on login btn$")
	public void Enter_the_username_with_and_password_with_and_click_on_login_btn(String username, String pwd) throws Throwable {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.username.sendKeys(username);
		LoginPage.password.sendKeys(pwd);
		LoginPage.loginbtn.click();

	}

	@Then("^Branches btn should be displayed$")
	public void Branches_btn_should_be_displayed() throws Throwable {
		PageFactory.initElements(driver, BranchesPage.class);
		boolean b = BranchesPage.branches.isDisplayed();
		Assert.assertTrue(b);
		{
			BranchesPage.branches.click();
		}
	}

	@Then("^close site$")
	public void close_site() throws Throwable {
		//driver.close();
	}

	@Then("^Handle the alert message$")
	public void Handle_the_alert_message() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@Then("^Branches btn should be displayed and click on Branches btn$")
	public void Branches_btn_should_be_displayed_and_click_on_Branches_btn() throws Throwable {

		PageFactory.initElements(driver, BranchesPage.class);
		boolean b = BranchesPage.branches.isDisplayed();
		Assert.assertTrue(b);
		{
			BranchesPage.branches.click();
		}
	}
	
	@When("^enter the Branchname \"([^\"]*)\" ,adress \"([^\"]*)\" ,zipcode \"([^\"]*)\" ,country \"([^\"]*)\" ,state \"([^\"]*)\" ,city \"([^\"]*)\"$")
	public void enter_the_Branchname_adress_zipcode_country_state_city(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		PageFactory.initElements(driver, BranchesPage.class);
		BranchesPage.newbranch.click();
		BranchesPage.branchname.sendKeys(arg1);
		Thread.sleep(2000);
		BranchesPage.adress.sendKeys(arg2);
		Thread.sleep(2000);
		//Base.JSSendkeys(BranchesPage.zipcode, arg3, driver);
		
		BranchesPage.zipcode.sendKeys(arg3);
		BranchesPage.country.sendKeys(arg4);
		BranchesPage.state.sendKeys(arg5);
		BranchesPage.city.sendKeys(arg6);
		//BranchesPage.submit.click();
	}
	
	/*@Then("^click on submit$")
	public void click_on_submit() throws Throwable {
	    
	}*/
	
}
