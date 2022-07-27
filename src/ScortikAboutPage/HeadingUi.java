package ScortikAboutPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
public class HeadingUi{

    //@Test(priority=5)
	public void headingUi() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://scortik.com/about-scortik/");
		Driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		Timeouts wait = Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		
	//TestCase2
	String parag1 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/p[1]/strong")).getText();
	String expectedparag1 = "Scortik is a developer’s roadmap for Web3 ecosystem protocols, tools and technology that provides an objective landscape for evaluating and analyzing the technical components and measurements.";
	if(expectedparag1.equalsIgnoreCase(parag1)) 
    	System.out.println("The expected Paragrapgh1 is same as actual para --- "+parag1);
	else 
    	System.out.println("The expected Paragrapgh1 doesn't match the actual para --- "+parag1);
	
	WebElement t1 = Driver.findElement(By.tagName("strong"));
    //obtain color in rgba
    String s1 = t1.getCssValue("color");
    // convert rgba to hex
    String c1 = Color.fromString(s1).asHex();
    System.out.println("Color is :" + s1);
    System.out.println("Hex code for color:" + c1);
    WebElement text1 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/p[1]/strong"));
    String fontSize1 = text1.getCssValue("font-size");
    System.out.println("Font Size -> "+fontSize1);
    }}
