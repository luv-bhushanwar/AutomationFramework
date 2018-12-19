package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath="//b[.='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//b[.='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addemployee;
	
	@FindBy(xpath="//span[.='Assign Leave']")
	private WebElement assignleave;
	
	public HomePage(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
	public void assignleavebtn(WebDriver dr)
	{
		WebDriverWait w = new WebDriverWait(dr,10);
		WebElement we = assignleave;
		w.until(ExpectedConditions.elementToBeClickable(we));
		we.click();
	}

	public void pimmenuddmenu(WebDriver dr)
	{
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(dr);
		a.moveToElement(pim).perform();
	}
	
	public void addemployeebtn(WebDriver dr)
	{
		WebDriverWait w = new WebDriverWait(dr,10);
		WebElement we = addemployee;
		w.until(ExpectedConditions.elementToBeClickable(we));
		we.click();
	}
	
	public void dashboardmenu(WebDriver dr)
	{
		WebDriverWait w = new WebDriverWait(dr,10);
		WebElement we = dashboard;
		w.until(ExpectedConditions.elementToBeClickable(we));
		we.click();
	}
	
}
