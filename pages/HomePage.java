package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class HomePage extends TestBase{
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	private final String searchButton_Xpath="//input[@id='twotabsearchtextbox']";
	
	private final String GoButton_Xpath="//input[@type='submit'][@value='Go']";
	
	//Web element for searchBox
	@FindBy(how=How.XPATH, using=searchButton_Xpath) 
	private WebElement searchBox;
	
	//Web element for goButton
	@FindBy(how=How.XPATH, using=GoButton_Xpath) 
	private WebElement goButton;
	
	public void enterTextInSearchBox(String searchText)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		searchBox.sendKeys(searchText);
		
	}
	
	public void clickAtGoButton()
	{
		goButton.click();
	}
	
	

}
