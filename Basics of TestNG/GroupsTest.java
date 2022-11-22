package Sandushi;

import org.testng.annotations.Test;

public class GroupsTest {
  @Test(groups = {"smoke"})
  public void a() {
	  System.out.println("Method a");
  }
  @Test(groups = {"reg"})
  public void b() {
	  System.out.println("Method b");
  }
  @Test(groups = {"sanity"})
  public void c() {
	  System.out.println("Method c");
  }
  @Test(groups = {"smoke"})
  public void d() {
	  System.out.println("Method d");
  }
  @Test(groups = {"reg","sanity"})
  public void e() {
	  System.out.println("Method e");
  }
}
