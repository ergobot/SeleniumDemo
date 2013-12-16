package com.demo.ParallelDemo;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

/*
 * This class is required to run ParallelDemo.java
 */
public class BrowserThread implements Runnable {

	// Threads own copy of urls
	ArrayList<String> urls = new ArrayList<String>();
	WebDriver driver = null;

	public BrowserThread(ArrayList<String> pages,WebDriver driver) throws IOException {
		this.urls = pages;
		this.driver = driver;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start");
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	private void processCommand() {
		try {
			// Go to each page
			for(String url:urls)
			{
				System.out.println(Thread.currentThread().getName() + "-going to: " + url);
				driver.get(url);
				System.out.println(Thread.currentThread().getName() + "-loadded: " + url);
				Thread.sleep(2000);
			}
			if(driver != null)
			{
				driver.quit();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem when opening browser and going to pages");
			System.out.println("Browser is closing");

			if(driver != null)
			{
				driver.quit();
			}
			
			
		}

	}

}
