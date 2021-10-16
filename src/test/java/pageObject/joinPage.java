package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class joinPage {
		
		public WebDriver driver;
		
	
		

		public joinPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
		}
		
		By slots=By.xpath("//div/ul[1]/li[2]/a");
		
		By join=By.cssSelector(".newUser.green");
		By name=By.name("map(firstName)");
		By surname=By.name("map(lastName)");
		By tickbox=By.id("checkbox");
		By submit=By.xpath("//input[@id='form']");
		By dob=By.xpath("//label[@for='dob']");
		
		
		
		
		public List<WebElement> getslots()
		{
			return driver.findElements(slots);
		}
		

		public WebElement joinNow()
		{
		return driver.findElement(join);
		}
		
		public WebElement enterName()
		{
		return driver.findElement(name);	
		}
		
		public WebElement enterSurname()
		{
		return driver.findElement(surname);
		}
		
		public WebElement clickBox()
		{
		return driver.findElement(tickbox);
		}
		
		public WebElement submitIt()
		{
		return driver.findElement(submit);
		}
		
		public WebElement birth()
		{
		return driver.findElement(dob);
		}
}
