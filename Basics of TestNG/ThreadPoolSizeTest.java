package Sandushi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSizeTest {
	WebDriver driver=new ChromeDriver();
	String url="https://www.google.com";
  @Test(invocationCount=3,threadPoolSize=3)
  public void test3() {
	  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	  driver.get(url);
	  driver.manage().window().maximize();
	  System.out.println("This is a testng testing");
  }
}
