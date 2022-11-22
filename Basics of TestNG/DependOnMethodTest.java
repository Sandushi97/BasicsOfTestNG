package Sandushi;

import org.testng.annotations.Test;

public class DependOnMethodTest {
  @Test
  public void startCar() {
	  System.out.println("Start Car");
  }
  @Test(dependsOnMethods = "startCar")
  public void driveCar() {
	  System.out.println("Drive Car");
  }
  @Test(dependsOnMethods = "driveCar")
  public void stopCar() {
	  System.out.println("Stop Car");
  }
  @Test(dependsOnMethods = { "driveCar","stopCar"})
  public void parkCar() {
	  System.out.println("Park Car");
  }
}
