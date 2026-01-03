package utilsone;

import org.testng.annotations.DataProvider;

public class DataProviderRelatedClass {

	
	@DataProvider(name="logintest")
	public Object[][] getMultipletestdata(){
		
		return new Object[][] {
			{"username","password"},
			{"username1","password1"},
			{"username2","password2"}
		};
		
	}
}
