package dropdown;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.setup;

public class dropdownfacebook extends setup {

	public static void main(String[] args) throws InterruptedException {
	
		setup.browser("chrome");
		
		d.get("https://www.facebook.com/");
		
		
		
		d.findElement(By.linkText("Create new account")).click();
		
		WebElement mon=d.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(mon);
		
		s.selectByVisibleText("Nov");
		
		List l=new LinkedList();
		List<WebElement> allmonth = s.getOptions();
		System.out.println(allmonth.size());
		for(WebElement e:allmonth) {
			System.out.println(e.getText());
			String m=e.getText();
			l.add(m);
			
			
		}
		Collections.sort(l);
		System.out.println(l);
		
		WebElement yr=d.findElement(By.id("year"));
		
		String no="1999";
		Select s1=new Select(yr);
		
		List<WebElement> y=s1.getOptions();
		
		
		

		if(y.equals(no))
		{
			yr.click();
		Thread.sleep(3000);
		}
		
		else {
		yr.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		
		yr.click();
		}
		
		
		
		
		setup.close();
	}

}
