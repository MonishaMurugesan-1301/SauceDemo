package testCases_2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webpages_2.LoginPage2;

public class Login_Test2 extends Driver_2 {
	
@Test(dataProvider = "getData")
    
    public void loginTest2(String username,String password) throws InterruptedException{
    	
         LoginPage2 lp2 = new LoginPage2(driver);
       	 lp2.enterUsername(username);
         lp2.enterPassword(password);
         lp2.clickLoginButton();
         Thread.sleep(2000);
    }
    
     @DataProvider
     public Object[][] getData() {
         String sheetname = "Sheet1";
         int rows = excel.getRowCount(sheetname);
         int cols = excel.getColumnCount(sheetname);

         Object[][] data = new Object[rows - 1][cols];

         for (int rowNum = 2; rowNum <= rows; rowNum++) {
             for (int colNum = 0; colNum < cols; colNum++) {
                 data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
             }
         }
         return data;
     }
}


