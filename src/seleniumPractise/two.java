package seleniumPractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class two {
	public static void main(String args [])throws InterruptedException, IOException{
		System.out.println("Hi");
		try{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\Documents\\selenium softwares\\chromedriver_win32_2.3.5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.switchTo().frame("iframeResult");

		WebElement search = driver.findElement(By.xpath("//a[@title='Search W3Schools']"));
		search.click();
		
		WebElement stext = driver.findElement(By.id("gsc-i-id1"));
		stext.click();
		stext.sendKeys("html");
		stext.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='w3-bar']//a[@title='Change Theme']")).click();
		
		//string.oldwin = driver.getWindowHandles();
		
		}catch(Exception e){
		System.out.println("uhh");
		}
		
		}
	
	}

 