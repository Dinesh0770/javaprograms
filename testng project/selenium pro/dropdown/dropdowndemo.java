package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.setup;

public class dropdowndemo extends setup {

	public static void main(String[] args) throws InterruptedException {

		browser("chrome");

		d.get("https://www.facebook.com/");

		d.findElement(By.xpath("//a[text()='Create new account']")).click();

		Thread.sleep(2000);

		WebElement yr = d.findElement(By.id("year"));

		Select s = new Select(yr);

		List<WebElement> l = s.getOptions();

		System.out.println(l.size());
		String str = null;
		String st = "2020";
		for (WebElement li : l) {

			str = li.getText();
			System.out.print(str + ",");

		}

//		while (true) {
//			if (str.equalsIgnoreCase(st)) {
//				s.selectByVisibleText("2020");
//				break;
//
//			} else {
//
//			}
//		}

		s.selectByVisibleText("1999");
		close();

	}

}
