package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import util.setup;

public class ss2 extends setup {

	public static void sc(WebDriver dr, String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) dr;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\HEMANT\\eclipse-workspace\\sel\\Screenshot\\" + filename + ".jpeg");

		FileHandler.copy(src, dest);

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("chrome");

		d.get("https://www.flipkart.com");

		Thread.sleep(2000);

		sc(d, d.getTitle());

		close();

	}

}
