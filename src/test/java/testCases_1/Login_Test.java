package testCases_1;

import org.testng.annotations.*;

import webpages_1.LoginPage;

public class Login_Test extends Driver{
        
    @Test(dataProvider = "getData")
    
    public void loginTest(String username,String password) throws InterruptedException{
    	
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
    

    	 