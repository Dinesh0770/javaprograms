package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import util.setup;

public class alertprompt extends setup{

	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		
		
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		System.out.println(d.getTitle());
		
		d.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		d.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		d.switchTo().alert().sendKeys("heelooooo");
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		close();

	}

}
