package Sandushi;

import org.testng.annotations.Test;

public class AlwaysRunVSEnabled {
  @Test
  public void a() {
	  System.out.println("Method a");
  }
  @Test
  public void b() {
	  System.out.println("Method b");
  }
  @Test(alwaysRun=true,enabled=false)
  public void c() {
	  System.out.println("Method c");
  }
}
