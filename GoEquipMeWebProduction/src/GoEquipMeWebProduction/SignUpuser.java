 package GoEquipMeWebProduction;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpuser {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://goequipme.com");

		// maximize window
		driver.manage().window().maximize();

		// login element
		driver.findElement(By.linkText("Sign In or Register")).click();

		// CLick on signup
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

		// create a new user here
		driver.findElement(By.id("login-email")).sendKeys("tim@yopmail.com	");

		// fill password
		driver.findElement(By.id("login-password")).sendKeys("123");
		// fill confirm password
		driver.findElement(By.id("login-c-password")).sendKeys("123");
		// click on next button
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		//Complete profile
		//enter the first name
		driver.findElement(By.id("login-fname")).sendKeys("Test");
		
		//enter the last name
		driver.findElement(By.id("login-lname")).sendKeys("Tim");

		//enter company name
		driver.findElement(By.id("login-company")).sendKeys("QA Assurance");
		
		//enter the loczation 
		driver.findElement(By.id("login-address")).sendKeys("mohali");
		
		//select location from dropdown
		driver.findElement(By.className("address-suggesion")).click();
		
		//enter the number
		driver.findElement(By.id("login-phone")).sendKeys("7845126954");
		//agree terms and a condition
		driver.findElement(By.className("PrivateSwitchBase-input css-1m9pwf3")).click();
		//click on the finish button
		driver.findElement(By.id("more-btn")).click();
		//print message
		System.out.print("User registered successfully");	
		
		
		
		//CLose the browser
//		driver.close();
//	//capture alert message and print in the console
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Email already exists.")));
	}

}
