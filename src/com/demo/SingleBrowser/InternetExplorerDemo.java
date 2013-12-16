package com.demo.SingleBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class InternetExplorerDemo {

	 private static InternetExplorerDriverService service;

	 public static void createAndStartService() throws IOException {
		 service = new InternetExplorerDriverService.Builder()
		 	.usingDriverExecutable(new File("C:\\Selenium\\IEDriverServer.exe"))
		 	.usingAnyFreePort()
		 	.build();
		 
		 service.start();
	  }
	
	public static void main(String[] args) throws IOException {
		
		//Start the service
		createAndStartService();
		
		System.out.println("Starting a new internet explorer browser");
		WebDriver driver = new InternetExplorerDriver(service);
		
		System.out.println("Going to the page: http://www.google.com");
		driver.get("http://www.google.com");
		
		System.out.println("Quiting the browser application");
		driver.quit();

		System.out.println("Stoping the InternetExplorerDriverService");
		service.stop();
	}

}
