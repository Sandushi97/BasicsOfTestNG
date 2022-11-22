package Sandushi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
	@Test
	  public void startCar() {
		  System.out.println("Start Car");
		  Assert.fail();
	  }
	  @Test(dependsOnMethods = "startCar")
	  public void driveCar() {
		  System.out.println("Drive Car");
	  }
	  @Test(dependsOnMethods = "driveCar")
	  public void stopCar() {
		  System.out.println("Stop Car");
	  }
	  @Test(dependsOnMethods = { "driveCar","stopCar"},alwaysRun = true)
	  public void parkCar() {
		  System.out.println("Park Car");
	  }
	@Test
	public void a() {
		System.out.println("Method a");
	}
	@Test
	public void b() {
		System.out.println("Method b");
	}
	@Test(dependsOnMethods = "b")
	public void c() {
		System.out.println("Method c");
	}
	
}
