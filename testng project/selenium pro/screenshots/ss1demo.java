package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import util.setup;

public class ss1demo extends setup {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("chrome");

		d.get("https://www.amazon.in/");

		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement image = d.findElement(By.xpath("//ul[@role='list']"));

		TakesScreenshot ts = ((TakesScreenshot) d);

		File SrcFile = image.getScreenshotAs(OutputType.FILE);

		File sr = ts.getScreenshotAs(OutputType.FILE);

		File DestFile = new File("C:\\Users\\HEMANT\\eclipse-workspace\\sel\\Screenshot\\poster.png");

		FileHandler.copy(SrcFile, DestFile);

		close();

	}

}
