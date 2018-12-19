package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

	@FindBy(id = "firstName")
	private WebElement firstname;

	@FindBy(id = "lastName")
	private WebElement lastname;

	@FindBy(id = "btnSave")
	private WebElement save;

	public AddEmployeePage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}

	public void fnametb(String fname) {
		firstname.sendKeys(fname);
	}

	public void lnametb(String lname) {
		lastname.sendKeys(lname);
	}

	public void savebtn() {
		save.click();
	}
}
