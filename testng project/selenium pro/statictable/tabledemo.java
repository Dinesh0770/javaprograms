package statictable;

import org.openqa.selenium.By;

import util.setup;

public class tabledemo extends setup {

	public static void t2() throws InterruptedException {
		browser("chrome");

		d.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		int row = d.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr")).size();

		System.out.println("sss" + row);
		close();
	}

	public static void main(String[] args) throws InterruptedException {

		t2();
	}

}
