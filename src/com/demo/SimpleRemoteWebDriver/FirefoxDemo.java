package com.demo.SimpleRemoteWebDriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
 * Description: Simplest use of a RemoteWebDriver with firefox
 * Requirements: You need to start a hub and node using the commands in the file "commandList.txt"
 */
public class FirefoxDemo {
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	    	
//		Open the first browser
		WebDriver driver = new RemoteWebDriver(capabilities);
		driver.get("http://www.google.com/");
		Thread.sleep(4000);
		driver.get("http://news.google.com/");
		Thread.sleep(4000);
		
//		Open the second browser
		WebDriver driver2 = new RemoteWebDriver(capabilities);
		Thread.sleep(4000);
		driver2.get("http://blog.petrockblock.com/");
		Thread.sleep(4000);
		driver2.get("http://www.sparkfun.com/");
		Thread.sleep(4000);
		
		driver.quit();
		driver2.quit();
		
		System.out.println("Completed program, exiting");
		
	}

}