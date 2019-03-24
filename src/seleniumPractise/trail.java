package seleniumPractise;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class trail {
	public static void main(String args[]) throws InterruptedException, IOException{
		System.out.println("Hi");
		try{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\Documents\\selenium softwares\\chromedriver_win32_2.3.5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name(""));
		Thread.sleep(3000);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Path= "C:\\Users\\santhosh\\Documents\\selenium softwares\\Seleniumscreenshots\\" + src.getName();
		FileUtils.copyFile(src, new File(Path));
		
		
//		WebElement userNameBtn = driver.findElement(By.id("email"));
//		userNameBtn.click();
//		userNameBtn.sendKeys("santhosh.kas@gmail.com");
//		
//		WebElement passBtn = driver.findElement(By.id("pass"));
//		passBtn.click();
//		passBtn.sendKeys("dinesh31");
//		
		String oldWindow = driver.getWindowHandle();//a1
//		driver.findElement(By.id("privacy-link")).click();
//		
//		Set<String> allWindows = driver.getWindowHandles();// a1 a2
//		
//		
//		for(String a : allWindows){
//			if(!a.equals(oldWindow))
//				driver.switchTo().window(a);
//		}
//		
//		System.out.println(driver.getTitle());
//		String title = driver.getTitle();
//		
//		if(title.equals("Data Policy"))
//			System.out.println("Passed");
//		else
//			System.out.println("Failed");
		
//		try
//		{
//			WebElement errorTooltip = driver.findElement(By.xpath("//a[text()='Sign up for an account.']"));
//			if(errorTooltip.isDisplayed())
//			{
//				System.out.println("Passed");
//			}
//		}
//		catch(Exception e){
//			System.out.println("Failed");
//		}
		driver.quit();}
		catch(Exception ex){
			System.out.println("ec");
		}
	}
}
