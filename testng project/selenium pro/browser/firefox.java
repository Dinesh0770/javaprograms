package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
	
	WebDriver d=new FirefoxDriver();
	
	d.get("https://www.flipkart.com");
	
	d.quit();
}

}

