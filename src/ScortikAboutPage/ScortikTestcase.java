package ScortikAboutPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
public class ScortikTestcase {
	//@Test(priority=1)
	public void ScortikTestcase() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://scortik.com/about-scortik/");
		Driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click(); // locate elements on a webpage. findElement points to a single element
		//Driver.manage().window().maximize();
		
		String heading = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/h1")).getText(); //string is a class which is present in java.lang package which creates string objects.
    	String expectedheading = "About Scortik";
		if(expectedheading.equalsIgnoreCase(heading)) {
			// compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string.
          	System.out.println("The expected heading is same as actual heading --- "+heading);
		}else { 
          	System.out.println("The expected image doesn't match the actual heading --- "+heading);
		}
		 WebElement t = Driver.findElement(By.tagName("h1")); //Anything that is present on the web page is a WebElement such as text box, button, etc
	      String s = t.getCssValue("color"); //obtain color in rgba
	      String c = Color.fromString(s).asHex(); // convert rgba to hex
	      System.out.println("Color is :" + s);
	      System.out.println("Hex code for color:" + c);
	      WebElement text = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/h1"));
	      String fontSize = text.getCssValue("font-size");
	      System.out.println("Font Size -> "+fontSize);
	      
	      
	      
	
Driver.close();
}
	
	    
}

/*
 Steps to write code-
Create a Selenium WebDriver instance
Configure browser if required
Navigate to the required web page and locate the relevant web element
Perform action on the web element
Verify and validate the action.
system.property = used to Create a Selenium WebDriver instance
driver.get("http://atlas-90592714.us-east-1.elb.amazonaws.com/login") =  Navigate to the web URL
driver.findElement(By.id("user_email_login")); = Locate it via the ID locator in Selenium WebDriver, Locators are an essential part of every Selenium script as they identify the elements that the test script will interact with to replicate user actions.For example, let’s try to locate the email and password field of the login form of Atlas Clinic sign in page.

*/
	
		
		
