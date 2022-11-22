package Sandushi;

import org.testng.annotations.Test;

public class DescriptionTest {
  @Test(description = "This is a simple TestNG Test")
  public void a() {
	  System.out.println("Method a");
  }
}
