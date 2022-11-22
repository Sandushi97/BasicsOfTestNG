package Sandushi;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test
  public void signUp() {
	  System.out.println("SignUp");
  }
  @Test
public void login() {
	System.out.println("Login");
  }
  @Test(priority = -3)
public void searchProduct() {
	System.out.println("SearchProduct");
}
  @Test(priority = 4)
public void addToCart() {
	System.out.println("AddToCart");
}
  @Test(priority = 5)
public void signOut() {
	System.out.println("SignOut");
}
}
