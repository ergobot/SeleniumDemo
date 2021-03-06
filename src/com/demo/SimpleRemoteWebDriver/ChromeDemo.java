package com.demo.SimpleRemoteWebDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


/*
 * Description: Simplest use of a RemoteWebDriver with chrome
 * Requirements: You need to start a hub and node using the commands in the file "commandList.txt"
 */
public class ChromeDemo {

	private static ChromeDriverService service;

	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
	    	.usingDriverExecutable(new File("C:\\Selenium\\chromedriver.exe"))
	        .usingAnyFreePort()
	        .build();
	    service.start();
	  }
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
		createAndStartService();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
//		Open the first browser
		WebDriver driver = new RemoteWebDriver(service.getUrl(),capabilities);
		driver.get("http://www.google.com/");
		Thread.sleep(4000);
		driver.get("http://news.google.com/");
		Thread.sleep(4000);
		
//		Open the second browser
		WebDriver driver2 = new RemoteWebDriver(service.getUrl(),capabilities);
		Thread.sleep(4000);
		driver2.get("http://blog.petrockblock.com/");
		Thread.sleep(4000);
		driver2.get("http://www.sparkfun.com/");
		Thread.sleep(4000);
		
		
		driver.quit();
		driver2.quit();
		
		service.stop();
		System.out.println("Completed program, exiting");
	}

}
