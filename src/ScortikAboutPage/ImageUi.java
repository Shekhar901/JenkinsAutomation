package ScortikAboutPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
public class ImageUi{

   // @Test(priority=3)
	public void ImageUI() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://scortik.com/about-scortik/");
		Driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		Timeouts wait = Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
	String image = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[2]/div/span/img")).getText();
	String expectedimage = "//*[@id=\"et-boc\"]/header/div/div/div[1]/div[1]/div/a/span/img";
	if(expectedimage.equalsIgnoreCase(image))
      	System.out.println("The expected image is same as actual image --- "+image);
	else
      	System.out.println("The expected image doesn't match the actual image --- "+image);
	WebElement t3 = Driver.findElement(By.tagName("img"));
      //obtain color in rgba
      String s3 = t3.getCssValue("color");
      // convert rgba to hex
      String c3 = Color.fromString(s3).asHex();
      System.out.println("Color is :" + s3);
      System.out.println("Hex code for color:" + c3);
      WebElement text3 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[2]/div/span/img"));
      String fontSize3 = text3.getCssValue("font-size");
      System.out.println("Font Size -> "+fontSize3);
    }}