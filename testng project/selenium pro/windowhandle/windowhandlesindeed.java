package windowhandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import util.setup;

public class windowhandlesindeed extends setup {

	public static void main(String[] args) throws InterruptedException {

		browser("chrome");

		d.get("https://secure.indeed.com/auth");

		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		String title = d.getTitle();
		System.out.println("title=" + title);

		String mainwin = d.getWindowHandle();

		Thread.sleep(2000);

		d.findElement(By.xpath("//button[@id='login-google-button']")).click();
		Thread.sleep(2000);

//		boolean googletext = d.findElement(By.xpath("//div[text()='Sign in with Google']")).isDisplayed();
//		System.out.println(googletext);

		d.findElement(By.xpath("//button[@id='apple-signin-button']")).click();
		Thread.sleep(2000);

//		boolean appalelogo = d.findElement(By.xpath("//a[@aria-label=\"Apple\"]")).isDisplayed();
//		System.out.println(appalelogo);
//		

		d.findElement(By.xpath("//button[@id='login-facebook-button']")).click();
		Thread.sleep(2000);

		// boolean facebook = d.findElement(By.xpath("//div[text()='Log in to use your
		// Facebook account with ']")).isDisplayed();
//		System.out.println(facebook);
//		

		Set<String> windows = d.getWindowHandles();

		System.out.println("id=" + windows);
		System.out.println("\n" + mainwin);

		String apple = "";

		for (String str : windows) {

			if (str != mainwin) {

				d.switchTo().window(str);

				try {
					System.out.println("title page===============" + d.getTitle());
					d.findElement(By.xpath("//a[@aria-label=\"Apple\"]")).isDisplayed();
					apple = str;
					System.out.println("applle id=" + apple);

					break;
				} catch (Exception e) {
					System.out.println(e);

				}

			}

		}

		String fb = "";
		for (String str : windows) {

			if (str != mainwin && str != apple) {

				d.switchTo().window(str);

				fb = str;

			}

		}

		System.out.println("apple id=" + apple + "   " + "fb id=" + fb + "\n main id" + mainwin);

		
		//apple window
		d.switchTo().window(apple);

		String applet = d.getTitle();

		if (applet.equalsIgnoreCase("Sign in with Apple ID")) {

			System.out.println("in apple window");
		} else {
			System.out.println("failed");
		}
		d.close();

		
		//fb window
		d.switchTo().window(fb);

		String fbt = d.getTitle();

		if (fbt.equalsIgnoreCase("Facebook")) {

			System.out.println("in facebook window");
		} else {
			System.out.println("failed");
		}
		d.close();

		
		
		//main window
		d.switchTo().window(mainwin);

		String mainwint = d.getTitle();

		if (mainwint.equalsIgnoreCase("Sign In | Indeed Accounts")) {

			System.out.println("in main parent window");
		} else {
			System.out.println("failed");
		}
	

		close();

	}

}
