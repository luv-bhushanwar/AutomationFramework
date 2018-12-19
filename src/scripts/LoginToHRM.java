package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.LoginPage;
import generic.AutoConstant;
import generic.ExcelData;

public class LoginToHRM implements AutoConstant {

	public static void main(String[] args) {

		System.setProperty(key, value);

		WebDriver dr = new FirefoxDriver();
		dr.get(ExcelData.getexceldata(Excelsheetpath, "LoginPage", 1, 0));
		
		LoginPage l = new LoginPage(dr);
		l.usernametb(ExcelData.getexceldata(Excelsheetpath, "LoginPage", 1, 1));
		l.passwordtb(ExcelData.getexceldata(Excelsheetpath, "LoginPage", 1, 2));
		l.loginbtn();

	}

}
