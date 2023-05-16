package basicprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setup {

	public static WebDriver d = null;

	public static void bro(String broname, String web) {

		if (broname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			d = new ChromeDriver();

			d.manage().window().maximize();

		} else if (broname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");

			d = new FirefoxDriver();

			d.manage().window().maximize();

		}
	}

	public static void close() throws InterruptedException {

		Thread.sleep(2000);
		d.quit();

	}

	public static void main(String[] args) {

		bro("chrome", "https://www.flipkart.com");

	}

}
