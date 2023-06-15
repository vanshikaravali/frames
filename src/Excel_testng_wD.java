

	import java.io.FileInputStream;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	public class Excel_testng_wD {
	
		WebDriver driver;
			@BeforeClass
			public void startUp() {
				ChromeOptions ob= new ChromeOptions();
				ob.addArguments("--remote-allow-origins=*");
				driver	=new ChromeDriver(ob);
				
		}
		@AfterClass
		public  void tearDown() {
			driver.close();
		}
		@Test
		public  void tc001() throws Exception{
			FileInputStream file =new FileInputStream("C:\\Users\\User\\Desktop//Book1.xlxs");
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			System.out.println("Application Opened");
			Reporter.log("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		Thread.sleep(3000);
		Reporter.log(driver.getTitle());
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout completed");

		}

	}



