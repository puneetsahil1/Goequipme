import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class Logoutcase {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\New driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.20.17.1");
		WebDriverWait wait = new WebDriverWait(driver, 10);

// click over login button
		driver.findElement(By.xpath("//a[@class='MuiTypography-root MuiTypography-inherit MuiLink-root MuiLink-underlineAlways nav-item desktop-visible testt css-15kjgm']//p[@class='MuiTypography-root MuiTypography-body1 css-9l3uo3'][normalize-space()='Login']")).click();

//perform Login here 
		driver.findElement(By.id("email")).sendKeys("QA@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

// Fluent wait for alert
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Welcome to GoEquipMe. Login successfully.')]")));
        driver.findElement(By.xpath("//div[contains(text(),'Welcome to GoEquipMe. Login successfully.')]")).click();

//Logout from here
        WebElement element1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[1]/a[7]/p[1]"))); 
        
//click over the logout button  
        driver.findElement(By.xpath("//header/div[1]/div[1]/a[7]/p[1]")).click();
        WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='No']")));
        
//Click over the alert either yes or no
        Thread.sleep(20);
        driver.findElement(By.xpath("//button[normalize-space()='No']")).click();
}
}
