package ScortikAboutPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
public class HeadingUi4 {
	WebDriver Driver;

	private static Timeouts wait;
	private static WebElement text;

	//@Test(priority=4)
	public void headingUI4() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://scortik.com/about-scortik/");
		Driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		wait = Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		String heading4 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[2]/div[1]/div[2]/div/div/p[1]/strong")).getText();
    	String expectedheading4 = "The Need for Scortik in the Blockchain Space";
		if(expectedheading4.equalsIgnoreCase(heading4))
          	System.out.println("The expected heading is same as actual heading --- "+heading4);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading4);
		WebElement t6 = Driver.findElement(By.tagName("strong"));
	      //obtain color in rgba
	      String s6 = t6.getCssValue("color");
	      // convert rgba to hex
	      String c6 = Color.fromString(s6).asHex();
	      System.out.println("Color is :" + s6);
	      System.out.println("Hex code for color:" + c6);
	      WebElement text6 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[2]/div[1]/div[2]/div/div/p[1]/strong"));
	      String fontSize6 = text6.getCssValue("font-size");
	      System.out.println("Font Size -> "+fontSize6);

}
	
	    
}