package Sandushi;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	 @DataProvider(name="login1")
	  public String[][] getData() {
		  String[][] data=new String [2][2];
		  data[0][0]="yssyogesh";
		  data[0][1]="12345";
		  
		  data[1][0]="bsonarika";
		  data[1][1]="12345";
		  return data;
	  }
}
