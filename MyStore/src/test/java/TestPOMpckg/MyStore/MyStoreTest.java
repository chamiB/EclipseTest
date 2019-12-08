package TestPOMpckg.MyStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class MyStoreTest {
	
	
	
	@Test
	
	public void testmtd() {
	
	System.setProperty("webdriver.chrome.driver","F:\\Java studies\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.linktext("Contact us")).click();
	sub = driver.findElemet(By.id("uniform-id_contact")).
	
	}
	
	
	
	
	
	
	
	

}
