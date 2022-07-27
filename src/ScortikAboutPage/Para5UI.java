package ScortikAboutPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;
public class Para5UI {
	WebDriver Driver;

	private static Timeouts wait;
	private static WebElement text;

	@Test(priority=2)
	public void ParaUI5() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://scortik.com/about-scortik/");
		Driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		wait = Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
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
	      Driver.close();
	}
	      
	    @Test(priority=1)
	  	public void ScortikTestcase() {
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\Development\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver D= new ChromeDriver();
			D.get("https://scortik.com/about-scortik/");
	      D.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click(); // locate elements on a webpage. findElement points to a single element
			//Driver.manage().window().maximize();
			
			String heading = D.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/h1")).getText(); //string is a class which is present in java.lang package which creates string objects.
	    	String expectedheading = "About Scortik";
			if(expectedheading.equalsIgnoreCase(heading)) {
				// compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string.
	          	System.out.println("The expected heading is same as actual heading --- "+heading);
			}else { 
	          	System.out.println("The expected image doesn't match the actual heading --- "+heading);
			}
			 WebElement t = D.findElement(By.tagName("h1")); //Anything that is present on the web page is a WebElement such as text box, button, etc
		      String s = t.getCssValue("color"); //obtain color in rgba
		      String c = Color.fromString(s).asHex(); // convert rgba to hex
		      System.out.println("Color is :" + s);
		      System.out.println("Hex code for color:" + c);
		      WebElement text = Driver.findElement(By.xpath("//*[@id=\"post-48\"]/div/div/div/div[1]/div/div[1]/div/div/h1"));
		      String fontSize = text.getCssValue("font-size");
		      System.out.println("Font Size -> "+fontSize);
		      D.close();
	    }
		      @Test(priority=3)
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
		      Driver.close();
		      }
		      
		      
		    @Test(priority=4)
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
		  	    Driver.close();
		    }
		  	      
		  	      
		  	  @Test(priority=5)
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
		  	  Driver.close();
		  	    }

	     
             
	
	    
}