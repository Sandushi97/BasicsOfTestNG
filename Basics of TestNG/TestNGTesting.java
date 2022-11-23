package user_demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTesting {
	WebDriver driver=new ChromeDriver();
  @BeforeTest
 
  public void callBrowser() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  String url="http://localhost/employee/admin/users.php";
	  driver.get(url);
	  driver.manage().window().maximize();
	  
  }
  @Test(priority = 1)
  public void login() {
	 WebElement username= driver.findElement(By.xpath("//*[@id=\"login-frm\"]/div[1]/input"));
	 username.sendKeys("admin");
	  WebElement password=driver.findElement(By.xpath("//*[@id=\"login-frm\"]/div[2]/input"));
	  password.sendKeys("admin@123");
	 
	  
	   String uname = driver.findElement(By.xpath("//*[@id=\"login-frm\"]/div[1]/input")).getAttribute("value");;
	  String pwd=driver.findElement(By.xpath("//*[@id=\"login-frm\"]/div[2]/input")).getAttribute("value");
	  
	  if(!uname.equals("admin")||!pwd.equals("admin@123")) {
		  System.out.println("Username or Password incorrect !.");
	  }
	  else {
		 
		  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"login-frm\"]/button[1]")).click();
		  
		  System.out.println("Successfully logged");
	  }
	  
  }
  @Test(dependsOnMethods = "login")
  public void loadUserPage() {
	 // driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  WebElement userpage=driver.findElement(By.xpath("//a[@href='users.php']"));
	  userpage.click();
	 
  }
  @Test(priority = 2)
  public void searchEmployee() {
	  driver.findElement(By.xpath("//a[@href='employee.php']")).click();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input"));
	 search.sendKeys("ab");
	 
	 String txt=driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td")).getText();
	 
	 if(txt.equals("No data available in table")) {
		 System.out.println("Data undetected");
	 }
	 else {
		 System.out.println("Data detected");
	 }
	 //To clear the serach bar
	 driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).clear();
	 
  }
 @Test(priority = 3)
  public void deleteUser() {
	  WebElement userpage=driver.findElement(By.xpath("//a[@href='users.php']"));
	  userpage.click();
	  WebElement delete=driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[4]/center/button[2]"));
	  delete.click();
	  String message1=driver.switchTo().alert().getText();
	  System.out.println("The alert message is :"+message1);
	  driver.switchTo().alert().dismiss();
	  
	  
	  
  }
 @Test(priority = 4)
 public void clickEditUserAndCloseWindow() {
	 WebElement clickEdit=driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[4]/center/button[1]"));
	 clickEdit.click();
	 //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.findElement(By.xpath("//*[@id=\"manage_user\"]/div/div/div/button")).click();
 }
 @Test(priority = 5)
 public void clickAddNewAndCloseWindow() {
	 WebElement ckickAddNew=driver.findElement(By.xpath("//*[@id=\"new_user\"]"));
	 ckickAddNew.click();
	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 WebElement closeAddNew=driver.findElement(By.xpath("//*[@id=\"manage_user\"]/div/div/div/button"));
	 closeAddNew.click();
 }
 @AfterTest
 public void logout() {
	 driver.quit();
	 System.out.println("Successfully logout the system");
 }
 
  
  
}
