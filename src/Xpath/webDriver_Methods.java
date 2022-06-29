package Xpath;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_Methods 

{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//1 Type
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		Navigation Navi= driver.navigate();
		Thread.sleep(2000);
		
		Navi.refresh();
		Thread.sleep(2000);
		
		Navi.back();
		Thread.sleep(2000);
		
		Navi.forward();
		Thread.sleep(2000);
		
		//2 Type
		
		//Navi.to("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(2000);
		
		//3 Type
		
		Options m= driver.manage();
		Window w= m.window();
		
		w.maximize();
		Thread.sleep(2000);
		
		Dimension D= new Dimension(1200,550);
		Thread.sleep(2000);
		
		w.setSize(D);
		Thread.sleep(2000);
		
		Point P= new Point (1200,550);
		w.setPosition(P);
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
