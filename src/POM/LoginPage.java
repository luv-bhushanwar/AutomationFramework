package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(id="txtUsername")
private WebElement username;

@FindBy(id="txtPassword")
private WebElement password;

@FindBy(id="btnLogin")
private WebElement login;


public LoginPage(WebDriver dr)
{
	PageFactory.initElements(dr,  this);
}


public void usernametb(String uname)
{
	username.sendKeys(uname);
}

public void passwordtb(String pwd){
	password.sendKeys(pwd);
}

public void loginbtn()
{
	login.click();
}

}
