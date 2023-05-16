package iframes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.setup;

public class iframe2 extends setup{

	public static void main(String[] args) throws InterruptedException {
	
		browser("chrome");
		
		
		d.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.switchTo().frame("frm2");
		
	d.findElement(By.id("firstName")).sendKeys("xyz");
		
	d.findElement(By.id("lastName")).sendKeys("xyz");
	
	d.findElement(By.id("femalerb")).click();
	
	

	
	
List<WebElement> s=	d.findElements(By.className("bcCheckBox"));
	
System.out.println(s.size());


//all checkbox select

//for(int i=0;i<s.size();i++) {
//	
//	s.get(i).click();
//	
//}



//specific checkbox select


//for(WebElement ch:s) {
//	
//	
//String sub=	ch.getAttribute("id");
//
//if(sub.equalsIgnoreCase("hindichbx") || sub.equalsIgnoreCase("frenchchbx")) {
//	
//	ch.click();
//}
//
//
//
//}
		


//1st 3

//for(int i=0;i<s.size();i++) {
//	
//	if(i<3) {
//		s.get(i).click();
//	}
//	
//}



//last 3


for(int i=s.size()-2;i>s.size();i++) {
	s.get(i).click();
	
}


d.switchTo().frame("frm3");

WebElement se=d.findElement(By.id("selectnav1"));

Select ss=new Select(se);

System.out.println(ss.getOptions().size());





		
		close();

	}

}
