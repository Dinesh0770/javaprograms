package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.setup;

public class popupFlipkart extends setup {

	public static void main(String[] args) throws InterruptedException {
		
		
		browser("chrome");
		
		d.get("https://www.flipkart.com");
		
		String txt=d.findElement(By.xpath("//p[@class='_1-pxlW']")).getText();
		
		System.out.println(txt);
		
		
		WebElement box = d.findElement(By.className("_2IX_2- VJZDxU"));
		
	System.out.println(box.isEnabled());
		
		Thread.sleep(2000);
		close();

	}

}
