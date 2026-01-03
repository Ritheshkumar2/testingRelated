package utilstwo;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="logindata")
	public Object[][] logintestdata() {
		return new Object[][] {
			{"username","password"},
			{
			"username1","password1"}
			}
		;
		
	}

}
