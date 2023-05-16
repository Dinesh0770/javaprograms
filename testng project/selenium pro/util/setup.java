package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setup {

	public static WebDriver d = null;

	public static void browser(String name) {

		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
			d = new ChromeDriver();

			d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.Firefox.driver", "D:\\driver\\geckodriver.exe");
			d = new FirefoxDriver();

			d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}

	}

	public static void close() throws InterruptedException {

		Thread.sleep(2000);
		d.quit();

	}

}
