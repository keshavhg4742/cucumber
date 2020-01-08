package pagelibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage {
	@FindBy(xpath="//img[@src='images/Branches_but.jpg']")
	public static WebElement branches;
	@FindBy(id="BtnNewBR")
	public static WebElement newbranch;
	@FindBy(id="txtbName")
	public static WebElement branchname;
	@FindBy(id="txtAdd1")
	public static WebElement adress;
	@FindBy(id="txtZip")
	public static WebElement zipcode;
	@FindBy(id="lst_counrtyU")
	public static WebElement country;
	@FindBy(id="lst_stateI")
	public static WebElement state;
	@FindBy(id="lst_cityI")
	public static WebElement city;
	@FindBy(id="btn_insert")
	public static WebElement submit;
	

}
