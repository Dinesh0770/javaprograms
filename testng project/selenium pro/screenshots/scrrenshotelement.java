package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import util.setup;

public class scrrenshotelement extends setup {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("chrome");

		d.get("https://www.facebook.com/login/");

		d.manage().window().maximize();

		WebElement im = d.findElement(By.className("login_form_container"));

		File src = im.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\HEMANT\\eclipse-workspace\\sel\\Screenshot\\" + d.getTitle() + ".png");

		FileHandler.copy(src, dest);

		close();
	}

}
