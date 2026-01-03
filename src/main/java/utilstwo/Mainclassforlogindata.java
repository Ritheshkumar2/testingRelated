package utilstwo;

import org.testng.annotations.Test;

public class Mainclassforlogindata {
	
	@Test(dataProvider="logindata",dataProviderClass=DataProviderClass.class)
	public void maintest(String username,String password) {
		System.out.println
		(username+"-"+password);
	}

}
