package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import utils.TestBase;

public class HomePageTest extends TestBase {
	
	@Test()
	public void searchLaptop()
	{
	HomePage homepage=new HomePage(driver);
	homepage.enterTextInSearchBox("Dell");
	homepage.clickAtGoButton();
	}
	
	/*
	 * @DataProvider() public Object[] laptopSearchList() { Object[] obj= {
	 * "HP","DELL","LENOVO"}; return obj; }
	 */
}
