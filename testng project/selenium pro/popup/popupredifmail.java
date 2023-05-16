package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.setup;

public class popupredifmail extends setup{

	public static void main(String[] args) throws InterruptedException {
		
		
		browser("chrome");
		
		d.get("https://www.rediff.com/");
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.manage().window().maximize();
	
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		WebElement b=d.findElement(By.className("signinbtn"));
		
		b.click();
		
		
		Alert alt = d.switchTo().alert();
		
		Thread.sleep(2000);
		alt.accept();
	
		
		
		close();

	}

}
