package utilstwo;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DPCLasswithExcel {
	
	@DataProvider(name="logintestOne")
	public Object[][] getdata() throws IOException{
		return ExcelRelated.gettestdata("", "");
		
	}

}
