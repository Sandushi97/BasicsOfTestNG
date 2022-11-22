package Sandushi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount_IncvocationTimeOut_Test {
	WebDriver driver=new ChromeDriver();
	String url="https://www.google.com/";
  @Test(invocationCount = 5,invocationTimeOut=10000)
  public void callBrowser() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver.get(url);
	  driver.manage().window().maximize();
	  String name=driver.getTitle();
	  System.out.println(name);
  }
}
