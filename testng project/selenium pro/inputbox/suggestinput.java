package inputbox;

import org.openqa.selenium.By;

import util.setup;

public class suggestinput extends setup {

	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome");
		
		
		d.get("http://www.google.com");
		
		d.findElement(By.id("input")).sendKeys("flipkart");
		
		
		
		
		
		close();
		
		
		

	}

}
