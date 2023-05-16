package iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.setup;

public class framedemo extends setup{

	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		
		d.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		//Frames Example in Selenium webdriver
		
		String t=d.getTitle();

	System.out.println(t);
		
	if(t.equalsIgnoreCase("Frames Example in Selenium webdriver")) {
		
		Boolean heaD=d.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).isDisplayed();
		System.out.println(heaD);
		
	}else {
		System.out.println("error");
	}
	
	

	
	Thread.sleep(2000);
	
	try {
		d.switchTo().frame(0);
//Boolean tt=	d.findElement(By.xpath("//body//b[text()='Topic']")).isDisplayed();
d.findElement(By.tagName("input")).sendKeys("hello");
		
	}
	catch(Exception e) {

		e.printStackTrace();
		System.out.println();
}
	
	
	
	try {
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@id='a']")).click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	d.switchTo().defaultContent();
	d.switchTo().frame(1);
	
	
	WebElement s=d.findElement(By.xpath("//select[@class='col-lg-3']"));
	
	Select ss=new Select(s);
	
	Thread.sleep(2000);
	ss.selectByVisibleText("Avatar");
	
	
	//h1[text()='Frames Examples in Selenium Webdriver']
		
	
	d.switchTo().defaultContent();
	
	String maint=d.getTitle();
		System.out.println(maint);
		
		close();

	}

}
