package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.AddEmployeePage;
import POM.AssignLeavePage;
import POM.HomePage;
import POM.LoginPage;
import generic.AutoConstant;
import generic.ExcelData;

public class LoginToHRM implements AutoConstant {

	public static void main(String[] args) {

		System.setProperty(key, value);

		WebDriver dr = new ChromeDriver();
		dr.get(ExcelData.getexceldata(Excelsheetpath, "LoginPage", 1, 0));
		dr.manage().window().maximize();

		LoginPage l = new LoginPage(dr);
		l.usernametb(ExcelData.getexceldata(Excelsheetpath, "LoginPage", 1, 1));
		l.passwordtb(ExcelData.getexceldata(Excelsheetpath, "LoginPage", 1, 2));
		l.loginbtn();

		HomePage h = new HomePage(dr);
		h.pimmenuddmenu(dr);
		h.addemployeebtn(dr);

		AddEmployeePage addemp = new AddEmployeePage(dr);
		addemp.fnametb(ExcelData.getexceldata(Excelsheetpath, "AddEmployeePage", 1, 0));
		addemp.lnametb(ExcelData.getexceldata(Excelsheetpath, "AddEmployeePage", 1, 1));
		addemp.savebtn();

		h.dashboardmenu(dr);
		h.assignleavebtn(dr);

		AssignLeavePage leave = new AssignLeavePage(dr);
		leave.empnametb(ExcelData.getexceldata(Excelsheetpath, "AssignLeavePage", 1, 0));
		leave.leavetypedd(ExcelData.getexceldata(Excelsheetpath, "AssignLeavePage", 1, 1));
		leave.fromdatecal(ExcelData.getexceldata(Excelsheetpath, "AssignLeavePage", 1, 2));
		leave.todatecal(ExcelData.getexceldata(Excelsheetpath, "AssignLeavePage", 1, 3));
		leave.assignbtn(dr);

		dr.close();

	}

}
