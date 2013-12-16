package com.demo.SingleBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Starting a new firefox browser");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Going to the page: http://www.google.com");
		driver.get("http://www.google.com");
		
		System.out.println("Quiting the browser application");
		driver.quit();

	}

}
