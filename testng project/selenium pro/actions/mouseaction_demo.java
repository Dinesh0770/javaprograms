package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.setup;

public class mouseaction_demo extends setup{

	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		
		d.get("https://www.flipkart.com");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//button[text()='✕']")).click();;
		
		Actions act=new Actions(d);
		
		WebElement elecb=d.findElement(By.xpath("//div[text()='Electronics']"));
		
		act.moveToElement(elecb).perform();
		Thread.sleep(3000);

	WebElement homeb=d.findElement(By.xpath("//div[text()='Home']"));
		
		act.moveToElement(homeb).perform();
		Thread.sleep(3000);

		WebElement homesub=d.findElement(By.xpath("//a[text()='Home Decor']"));
		
		act.moveToElement(homesub).perform();
		Thread.sleep(3000);

WebElement clock=d.findElement(By.xpath("//a[text()='Clocks']"));
		
		act.moveToElement(clock).click().build().perform();
		Thread.sleep(3000);
//
//		List<WebElement> li= d.findElements(By.tagName("a"));
//		
//		for(WebElement l:li) {
//			
//			String list=l.getText();
//			String list1=l.getAttribute("href");
//			System.out.println(list+"="+list1);
//			
//		}
//		
		

		WebElement sss=d.findElement(By.xpath("//*[@name='otracker']"));
		
		String df=sss.getAttribute("value");
		System.out.println(df);
		
		
		
		close();
	}

}
