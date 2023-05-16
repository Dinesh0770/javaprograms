package dragndrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.setup;

public class globalsqa extends setup{

	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		
		d.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		d.manage().window().maximize();
		
		
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement pic1=d.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		
		WebElement trash=d.findElement(By.xpath("//div[@id='trash']"));
		
		WebElement pic2=d.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		
		
		Actions act=new Actions(d);
		
		//act.clickAndHold(pic1).moveToElement(trash).release().build().perform();
		Thread.sleep(3000);
		act.dragAndDrop(pic1, trash).perform();
		act.dragAndDrop(pic2, trash).perform();
		//act.clickAndHold(pic2).moveToElement(trash).release().build().perform();
		
		
		
		
		Thread.sleep(3000);
		
		close();

	}

}
