package Sandushi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  String url="https://www.youtube.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
  }
}
