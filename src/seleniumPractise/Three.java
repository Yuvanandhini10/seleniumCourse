package seleniumPractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {
	public static void main(String[] args){
	
		try{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\Documents\\selenium softwares\\chromedriver_win32_2.3.5\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	String oldone = driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@class='icons fb']")).click();
	
	
	Set<String> allwindows = driver.getWindowHandles();
	for (String a : allwindows)
	{
		if(!a.equals(oldone))
			driver.switchTo().window(a);
			
	}
	
		}catch(Exception e){
			System.out.println();
		}
	
	}

}
