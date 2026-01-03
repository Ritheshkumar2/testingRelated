package utilstwo;

import org.testng.annotations.Test;

public class MainClassForExcel {
	
	@Test(dataProvider="logintestOne",dataProviderClass=DPCLasswithExcel.class)
	public void test(String username,String password) {
		System.out.print(username+"-"+password);
	}

}
