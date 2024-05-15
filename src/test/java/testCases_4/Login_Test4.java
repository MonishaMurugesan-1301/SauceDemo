package testCases_4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webpages_4.LoginPage4;



public class Login_Test4 extends Driver_4 {
	
@Test(dataProvider = "getData")
    
    public void loginTest4(String username, String password) throws InterruptedException{
    	
         LoginPage4 lp4 = new LoginPage4(driver);
       	 lp4.enterUsername(username);
         lp4.enterPassword(password);
         lp4.clickLoginButton();
         Thread.sleep(2000);
    }
    
     @DataProvider
     public Object[][] getData() {
         String sheetname = "Sheet1";
         int rows = excel.getRowCount(sheetname);
         int cols = excel.getColumnCount(sheetname);

         Object[][] data = new Object[rows - 1][cols];

         for (int rowNum = 2; rowNum <= rows; rowNum++) {
        	 data[rowNum - 2][0] = excel.getCellData(sheetname, 0, rowNum);
             data[rowNum - 2][1] = excel.getCellData(sheetname, 1, rowNum);
         }
         
         return data;
     }
}


