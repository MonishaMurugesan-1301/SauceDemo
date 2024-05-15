package testCases_5;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webpages_1.LoginPage;

public class Login_Test5 extends Driver_5{
	
@Test(dataProvider = "getData")
    
    public void loginTest5(String username,String password) throws InterruptedException{
    	
         LoginPage lp = new LoginPage(driver);
       	 lp.enterUsername(username);
         lp.enterPassword(password);
         lp.clickLoginButton();
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
