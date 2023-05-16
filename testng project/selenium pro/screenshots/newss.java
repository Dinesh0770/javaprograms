package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import util.setup;

public class newss extends setup {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("chrome");

		d.get("https://www.youtube.com/");

		Thread.sleep(2000);

		File src = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\HEMANT\\eclipse-workspace\\sel\\Screenshot" + d.getTitle() + ".png");

		FileHandler.copy(src, dest);

		close();
	}

}
