package Sandushi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderTest {
	
 
  @Test(dataProvider = "login1",dataProviderClass = CustomDataProvider.class)
  public void loginUser(String email,String pass) {
	  WebDriver driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver.get("http://localhost/userLogin/index.php");
	  System.out.println("Browser Called");
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id=\"txt_uname\"]")).sendKeys(email);
	  driver.findElement(By.name("txt_pwd")).sendKeys(pass);
	 driver.findElement(By.id("but_submit")).click();
	  System.out.println("User Login");
  }
}
