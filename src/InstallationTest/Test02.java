package InstallationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 
{
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
	
	
	}
}

