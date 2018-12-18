package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignLeavePage {

	@FindBy(id="assignleave_txtEmployee_empName")
	private WebElement empname;
	
	@FindBy (id="assignleave_txtLeaveType")
	private WebElement leavetype;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[1]")
	private WebElement fromdate;
	
	@FindBy(xpath="(//img[@class='ui-datepicker-trigger'])[2]")
	private WebElement todate;
	
	@FindBy(id="assignBtn")
	private WebElement assign;
	
	public AssignLeavePage(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	
	public void empnametb(String ename)
	{
		empname.sendKeys(ename);
	}
	
	public Select leavetypedd(String ltype)
	{
		Select s = new Select(leavetype);
		s.selectByVisibleText(ltype);
		return s;
	}
	
	
	public void fromdatecal(String frmdt)
	{
		fromdate.sendKeys(frmdt);
	}
	
	public void todatecal(String todt)
	{
		todate.sendKeys(todt);
	}
	
	public void assignbtn()
	{
		assign.click();
	}
	
}
