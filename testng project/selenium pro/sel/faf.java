package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class faf {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=null;
		
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		 
	//	System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
//		ChromeOptions co = new ChromeOptions();
//	
//		co.addArguments("--remote-allow-origins=*");

		d = new ChromeDriver();
		
		
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		d.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		String t=d.getCurrentUrl();
		String t1=d.getTitle();
		
		System.out.println(t+":"+t1);

		d.quit();
	}

}
