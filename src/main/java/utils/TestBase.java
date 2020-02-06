package utils;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	public static WebDriver driver;
	
	@BeforeMethod
	public static void beforeMethod(Method method)
	{
		String Methodname= method.getName();
		System.out.println("Method execution started : " + Methodname);
		launch();
		
	}
	
	@AfterMethod
	public static void afterMethod(Method method)
	{
		String Methodname= method.getName();
		System.out.println("Method execution started : " + Methodname);
		driver.quit();
		
	}
	
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moh\\Desktop\\New folder\\Selenium_test-\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	
	}

}
