package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement01 
{
public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.javatpoint.com/v-model");
		driver.manage().window().maximize();
		WebElement wele= driver.findElement(By.name("search"));
		wele.sendKeys("Manual Testing");
		WebElement SearchButton= driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button"));
		SearchButton.click();
	
	
	}

}
