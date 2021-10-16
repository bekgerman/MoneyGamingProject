package MoneyGaming.MGProject;

import java.awt.List;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.joinPage;
import resources.base;

public class homePage extends base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void Initialize() throws IOException
	{
		driver=initializeDriver();
		
	}
	
	@Test
	public void a()
	{
		driver.get(prop.getProperty("url"));
		//driver.get("https://moneygaming.qa.gameaccount.com/");
		
		driver.manage().window().maximize();
		
		 
		joinPage jp=new joinPage(driver);
			
		jp.joinNow().click();
		jp.enterName().sendKeys("Ulugbek");
		jp.enterSurname().sendKeys("Yusupov");
		jp.clickBox().click();
		jp.submitIt().click();
		Assert.assertEquals(jp.birth().getText(), "This field is required");
		
	
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
