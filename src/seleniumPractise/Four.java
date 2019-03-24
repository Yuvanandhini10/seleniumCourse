package seleniumPractise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four {
	
public static void main (String[] args) {
     //try {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\Documents\\selenium softwares\\chromedriver_win32_2.3.5\\chromedriver.exe\\");
    	 WebDriver driver = new ChromeDriver(); 
    	 
    	 
    	 for(int a=1;a<4;a++){
    		 driver.findElement(By.xpath("//div[@name='searchBar"+a+"']")).sendKeys("Hello");
    	 }
    	 
    	 int totalSearchBars = driver.findElements(By.xpath("//div[contains(@name,'searchBar')]")).size();
    	 
    	 
    	 
    	 
    	 
//    	 
//    	 driver.get("https://www.yahoo.com");
//    	 try{
//    	 WebElement signin = driver.findElement(By.id("uh-signin111111111111"));
//    	 signin.click();
//    	 }
//    	 catch(Exception e){
//    		 System.out.println("I got an Error. That is OK. Carry on");
//    	 }
		 try{
			 System.out.println(6/0);
		 }
		 catch(NullPointerException e){
			 System.out.println("NullPointerException Error Handled");
		 }
		 catch(ArithmeticException  e){
			 System.out.println("ArithmeticException Error Handled");
		 }
    	 System.out.println("This is Next line. Resumed . Pint this line to console");
//    	 signin.click();
//    	 WebElement mailid = driver.findElement(By.id("login-username"));
//    	 mailid.click();
//    	 mailid.sendKeys("Yuvanandhini1007");
//    	 WebElement nextbtn = driver.findElement(By.id("login-signin"));
//    	 nextbtn.click();
//    	 
//    	 WebElement passwd = driver.findElement(By.id("login-passwd"));
//    	 passwd.click();
//    	 passwd.sendKeys("Abc@1234");
//    	 WebElement sign = driver.findElement(By.id("login-signin"));
//    	 sign.click();
    	 
    	 

//     }catch (Exception e){
//     System.out.println("Result");
//     }
}

}
