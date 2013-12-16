package com.demo.SingleBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {

	

		private static ChromeDriverService service;

		public static void createAndStartService() throws IOException {
			service = new ChromeDriverService.Builder()
		    	.usingDriverExecutable(new File("C:\\Selenium\\chromedriver.exe"))
		        .usingAnyFreePort()
		        .build();
		    service.start();
		  }
	
	public static void main(String[] args) throws IOException {
		
		//Start the service
		createAndStartService();
		
		System.out.println("Starting a new chrome browser");
		WebDriver driver = new ChromeDriver(service);
		
		System.out.println("Going to the page: http://www.google.com");
		driver.get("http://www.google.com");
		
		System.out.println("Quiting the browser application");
		driver.quit();
		
		System.out.println("Stoping the ChromeDriverService");
		service.stop();

	}

}
