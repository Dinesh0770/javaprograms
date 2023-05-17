package testngpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testingtitles {

	public static WebDriver d = null;

//	@BeforeMethod
//	public static void setup(String broname) {
//		if (broname.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
//
//			d = new ChromeDriver();
//
//			d.manage().window().maximize();
//
//		} else if (broname.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
//
//			d = new FirefoxDriver();
//
//			d.manage().window().maximize();
//
//		}
//
//	}
	@BeforeMethod
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		//
		d = new ChromeDriver();
		//
		d.manage().window().maximize();
	}

	@AfterMethod
	public static void close() {
		d.quit();
	}

	@Test
	public static void test1() {

		d.get("https://www.flipkart.com");

		String title = d.getTitle();

		String ptitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		if (title.equalsIgnoreCase(ptitle)) {
			System.out.println("passed test");
		} else {
			System.out.println("failed test");
		}

	}

	@FindBy(xpath = "//img[@alt='Facebook']")
	public static WebElement fblogo;

	@Test
	public static void tr() {

		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		//
		d = new ChromeDriver();

		d.get("https://www.facebook.com");

		System.out.println(fblogo.isDisplayed());

	}

}
