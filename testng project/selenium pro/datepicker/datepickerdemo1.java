package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.setup;

public class datepickerdemo1 extends setup {

	public static void main(String[] args) throws InterruptedException {

		browser("chrome");

		d.get("https://demo.automationtesting.in/Datepicker.html");

		d.manage().window().maximize();

		System.out.println(d.getWindowHandle());

		d.findElement(By.xpath("//input[@id='datepicker1']")).click();

		WebElement my = d.findElement(By.className("ui-datepicker-title"));

		String s = my.getText();

		String arr[] = s.split(" ");

		System.out.println(arr[0] + " " + arr[1]);
		String mon = "nov";

		String year = "1999";

		String mon1 = arr[0];
		String year1 = arr[1];
		while (true) {

			if (mon1.equalsIgnoreCase(mon) && year1.equalsIgnoreCase(year)) {
				break;
			} else {
				Thread.sleep(2000);
				d.findElement(By.xpath("//a[@data-handler='prev']")).click();

			}

		}

	}

}
