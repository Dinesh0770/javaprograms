package setpositionwindow;

import org.openqa.selenium.Point;

import util.setup;

public class yt extends setup {

	public static void main(String[] args) throws InterruptedException {

		browser("chrome");

		d.get("https://www.youtube.com/");

		d.navigate().refresh();

		d.manage().window().maximize();
		Thread.sleep(5000);
//		Dimension s = new Dimension(400, 500);
//
//		d.manage().window().setSize(s);

		Thread.sleep(3000);

		Point p = new Point(700, 950);

		d.manage().window().setPosition(p);
		Thread.sleep(3000);
		d.quit();
	}

}
