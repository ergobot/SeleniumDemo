package com.demo.ParallelDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDemo {

	public static void main(String[] args) throws IOException {
		
		// Make a list of pages
		ArrayList<String> pages = new ArrayList<String>();
		pages.add("http://www.google.com");
		pages.add("http://news.google.com");
		pages.add("http://www.sparkfun.com");
		pages.add("http://blog.petrockblock.com/");
		pages.add("http://www.adafruit.com");
		
		// Total amont of threads
		int totalThreads = 5;
		
		ExecutorService executor = Executors.newFixedThreadPool(totalThreads);
		
        for (int i = 0; i < totalThreads; i++) {
        	// Real copy
        	ArrayList<String> urls = new ArrayList<String>();
        	for(String page : pages)
        	{
        		urls.add(page);
        	}
        	
			//Setup WebDriver
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			
			WebDriver driver = new RemoteWebDriver(capabilities);
        	
			// Give the WebDriver it's own thread
            Runnable worker = new BrowserThread(urls,driver);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
	

	}

}
