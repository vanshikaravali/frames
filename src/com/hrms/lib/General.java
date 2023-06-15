package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class General  extends Global {
	public void openApplication() {
		ChromeOptions ob= new ChromeOptions();
		ob.addArguments("--remote-allow-origins=*");
	driver	=new ChromeDriver(ob);
		driver.navigate().to(url);
		System.out.print("Application Opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.print("Application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(Emplnf_frame);
		System.out.println("Enter into frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.name(btn_save)).click();
		System.out.println("NewEmpAdded");
	}
}







