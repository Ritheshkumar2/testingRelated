package pages;

import org.testng.annotations.Test;

import utilsone.DataProviderRelatedClass;

@Test(dataProvider="logintest",dataProviderClass=DataProviderRelatedClass.class )
public class PrintMultipleTestData {

	public void loginTest(String username,String password) {
		System.out.println(username+"-"+password);
	}

}
