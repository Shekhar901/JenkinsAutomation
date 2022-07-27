package ScortikDashboardPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class ScortikDashboard{

	private static Timeouts wait;
	private static WebElement text;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://scortik.com/");
		Driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		wait = Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//TestCase1
		String image = Driver.findElement(By.xpath("//*[@id=\"et-boc\"]/header/div/div/div[1]/div[1]/div/a/span/img")).getText();
    	String expectedimage = "//*[@id=\"et-boc\"]/header/div/div/div[1]/div[1]/div/a/span/img";
		if(expectedimage.equalsIgnoreCase(image))
          	System.out.println("The expected image is same as actual image --- "+image);
    	else
          	System.out.println("The expected image doesn't match the actual image --- "+image);
		 WebElement t = Driver.findElement(By.tagName("img"));
	      //obtain color in rgba
	      String s = t.getCssValue("color");
	      // convert rgba to hex
	      String c = Color.fromString(s).asHex();
	      System.out.println("Color is :" + s);
	      System.out.println("Hex code for color:" + c);
	      WebElement text = Driver.findElement(By.xpath("//*[@id=\"et-boc\"]/header/div/div/div[1]/div[1]/div/a/span/img"));
	      String fontSize = text.getCssValue("font-size");
	      System.out.println("Font Size -> "+fontSize);
	      
	      Driver.findElement(By.xpath("//*[@id=\\\"menu-item-105\\\"]/a")).click();
	    	String expectedabout = "//*[@id=\"et-boc\"]/header/div/div/div[1]/div[1]/div/a/span/img";
			if(expectedabout.equalsIgnoreCase(c))
	          	System.out.println("The expected image is same as actual image --- "+c);
	    	else
	          	System.out.println("The expected image doesn't match the actual image --- "+c);
	      Driver.get("https://scortik.com/about-scortik/");
	      Driver.findElement(By.xpath("//*[@id=\"menu-item-105\"]/a")).click();
	      System.out.println("About is successfully hit");
		
	      /*
		//TestCase2
		String heading1 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/p[1]/strong")).getText();
    	String expectedHeading1 = "Scortik is a developer’s roadmap for Web3 ecosystem protocols, tools and technology that provides an objective landscape for evaluating and analyzing the technical components and measurements.";
		if(expectedHeading1.equalsIgnoreCase(heading1))
          	System.out.println("The expected Paragrapgh1 is same as actual para --- "+heading1);
    	else
          	System.out.println("The expected Paragrapgh1 doesn't match the actual para --- "+heading1);
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
		
		//TestCase3
		String heading2 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/p[2]")).getText();
    	String expectedHeading2 = "From core aspects like write speed, read speed, and gas fee to extended analysis in developer support, and GitHub engagement, Scortik covers everything and offers a 360-degree overview of a protocol’s developer ecosystem.";
		if(expectedHeading2.equalsIgnoreCase(heading2))
          	System.out.println("The expected Paragraph2 is same as actual para --- "+heading2);
    	else
          	System.out.println("The expected paragraph2 doesn't match the actual para --- "+heading2);
		WebElement t2 = Driver.findElement(By.tagName("p"));
	      //obtain color in rgba
	      String s2 = t2.getCssValue("color");
	      // convert rgba to hex
	      String c2 = Color.fromString(s2).asHex();
	      System.out.println("Color is :" + s2);
	      System.out.println("Hex code for color:" + c2);
	      WebElement text2 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/p[2]"));
	      String fontSize2 = text2.getCssValue("font-size");
	      System.out.println("Font Size -> "+fontSize2);
		
		//TestCase4
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
		
		/*
	      //TestCase5
		String image2 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[2]/div[1]/div[1]/div/span/img")).getText();
    	String expectedimage2 = "//*[@id=\\\"post-48\\\"]/div/div/div/div[2]/div[1]/div[1]/div/span/img";
		if(expectedimage2.equalsIgnoreCase(image2))
          	System.out.println("The expected image is same as actual image --- "+image2);
    	else
          	System.out.println("The expected image doesn't match the actual image --- "+image2);
		
		//TestCase6
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
		
		
		//Testcase7
		String para5= Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[2]/div[1]/div[2]/div/div/p[2]")).getText();
    	String expectedpara5 = "Most existing blockchain review platforms focus on security audits or price tracking of cryptocurrencies. The lack of a neutral, third-party blockchain developer ecosystem evaluation and verification system has hindered the demanding needs of Web3 developers. Scale-ups, enterprises, and even startups of Web3 developers need a comprehensive in-depth technical analysis of blockchain protocols to asses their suitability for development.";
		if(expectedpara5.equalsIgnoreCase(para5))
          	System.out.println("The expected text is same as actual para5 --- "+para5);
    	else
          	System.out.println("The expected text doesn't match the actual para5 --- "+para5);
		WebElement t7 = Driver.findElement(By.tagName("p"));
	      //obtain color in rgba
	      String s7 = t7.getCssValue("color");
	      // convert rgba to hex
	      String c7 = Color.fromString(s7).asHex();
	      System.out.println("Color is :" + s7);
	      System.out.println("Hex code for color:" + c7);
	      WebElement text7 = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[2]/div[1]/div[2]/div/div/p[2]"));
	      String fontSize7 = text7.getCssValue("font-size");
	      System.out.println("Font Size -> "+fontSize7);
		*/
		//Getting color of the headiing
		/*
		 WebElement t = Driver.findElement(By.tagName("h1"));
	      //obtain color in rgba
	      String s = t.getCssValue("color");
	      // convert rgba to hex
	      String c = Color.fromString(s).asHex();
	      System.out.println("Color is :" + s);
	      System.out.println("Hex code for color:" + c);
	*/	
	}

	}

