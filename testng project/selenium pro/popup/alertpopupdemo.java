package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.setup;

public class alertpopupdemo extends setup{

	public static void main(String[] args) throws InterruptedException {
browser("chrome");
		
		d.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		d.manage().window().maximize();
	
		Thread.sleep(2000);
		
		WebElement b=d.findElement(By.xpath("//input[@type='button']"));
		
		b.click();
		
		Thread.sleep(2000);
		
		Alert alt = d.switchTo().alert();
		
		Thread.sleep(2000);
		
		alt.accept();
		
		Thread.sleep(2000);
		d.findElement(By.name("confirmation")).click();
		

		
		Thread.sleep(2000);
		
		alt.dismiss();
		
		
		Thread.sleep(2000);
		

		d.findElement(By.name("prompt")).click();
		 Alert alt1 = d.switchTo().alert();
		Thread.sleep(2000);
		alt1.sendKeys("hello");
		Thread.sleep(5000);
		alt1.accept();
		Thread.sleep(2000);
		
		close();

	}

}
