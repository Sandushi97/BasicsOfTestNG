 package Sandushi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersTest1 {
	WebDriver driver=new ChromeDriver();
  @BeforeTest
  public void callBrowser() {
	  
	  String url="http://localhost/userLogin/index.php";
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	  System.out.println("Browser called");
  }
  @Parameters({"username","userpassword"})
  @Test
  public void loginUser(String uname, String upassword) {
	 /* WebElement username=driver.findElement(By.xpath("//*[@id=\"txt_uname\"]"));
	  username.sendKeys("");
	  WebElement password=driver.findElement(By.name("txt_pwd"));
	  password.sendKeys("");
	  WebElement cli=driver.findElement(By.xpath("//*[@id=\"but_submit\"]"));
	  cli.click();*/
	  System.out.println("Username :"+uname);
	  System.out.println("Password :"+upassword);
	  
	  driver.findElement(By.xpath("//*[@id=\"txt_uname\"]")).sendKeys(uname);
	  driver.findElement(By.name("txt_pwd")).sendKeys(upassword);
	 WebElement cli=driver.findElement(By.xpath("//*[@id=\"but_submit\"]"));
	  cli.click();
	  System.out.println("User Login");
  }
  @AfterTest
  public void logoutUser() {
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/form/input")).click();
	  System.out.println("User Logout");
  }
}
