package Xpath;

import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElement_FB
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(1500);
        driver.manage().window().maximize();
        Thread.sleep(1500);
        
        WebElement Button = driver.findElement(By.xpath("(//a[@role='button']) [2]"));
        Button.click();
        Thread.sleep(4500);
        driver.findElement(By.name("firstname")).sendKeys("Krishna");
        driver.findElement(By.name("lastname")).sendKeys("Lahamge");
        driver.findElement(By.name("reg_email__")).sendKeys("Krishna.Lahamge19@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Krishna.lahamge19@gmail.com");
        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("8983881818");
        Thread.sleep(4500);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(4500);

        
       WebElement DayDB = driver.findElement(By.name("birthday_day"));
       Select Date= new Select(DayDB);
       Date.selectByVisibleText("29");
       
       WebElement MonthDB= driver.findElement(By.name("birthday_month"));
       Select Month= new Select(MonthDB);
       Month.selectByIndex(11);
        
       WebElement YearDB= driver.findElement(By.name("birthday_year"));
       Select Year= new Select(YearDB);
       Year.selectByValue("1996");
       Thread.sleep(4500);
       
       WebElement Day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
       Select Dayda= new Select(Day);
       List<WebElement> List= Dayda.getOptions();
       int Size = List.size();
        Thread.sleep(1000);
        
        
        
       for(int i=0; i<= Size-1; i++)
    	   
       {
    	  WebElement Get= List.get(i);
    	  String A= Get.getText();
    	  System.out.println(A);
    	  Thread.sleep(2000);
    	  
    	  driver.close();
       }
	}
}
       
    
      


