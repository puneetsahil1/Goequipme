import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//	
//System.setProperty(");
//WebDriver driver = new ChromeDriver();
//driver.get("http//:goequipme.com");
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\New driver\\\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://Goequipme.com");
        
        
        //Driver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\New driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		//Webaddress
        driver.get("http://3.20.17.1");
		driver.findElement(By.id(":r2:")).sendKeys("1000000");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
//		driver.findElement(By.className("MuiTypography-root MuiTypography-h6 reset-filter css-1anx036")).click();
		
		driver.findElement(By.xpath("//img[@alt='Equipment Lending']")).click();
//		driver.findElement(By.id(":r0:")).sendKeys("ooooooo");
//		driver.findElement(By.id("btn_start")).click();
		driver.findElement(By.id("btn_start")).click();
System.out.println("hi this is test ");
		//driver.close();
	}
	

}

