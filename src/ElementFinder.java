import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementFinder {

	// getElementById

	public WebElement getElementById(String elementId, WebDriver webDriver) {

		
		
		
		
		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.id(elementId));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				return result;
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(elementId);
		}

		return null;

	}

	// getElementbyClass
	public WebElement getElementByClass(String elementClass, WebDriver webDriver) {
		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.className(elementClass));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				return result;
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(elementClass);
		}
		return null;
		
	}

	public List<WebElement> getElementsByClass(String elementClass, WebDriver webDriver) {
		List<WebElement> result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElements(By.className(elementClass));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				return result;
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(elementClass);
		}
		return null;
		
	}

	
	
	public WebElement getElementByXpath(String xpath, WebDriver webDriver) {
		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.xpath(xpath));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				return result;
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(xpath);
		}
		
		return null;
	}

	public List<WebElement> getElementsByXpath(String xpath, WebDriver webDriver) {
		List<WebElement> results;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				results = webDriver.findElements(By.xpath(xpath));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				return results;
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(xpath);
		}
		
		return null;
	}

	
	// clickOnelementBy
	public void clickElementById(String elementId, WebDriver webDriver) {
		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.id(elementId));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				result.click();
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(elementId);
		}

	}

	// clickOnElementById
	public void clickElementByXpath(String xpath, WebDriver webDriver) {
		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.xpath(xpath));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				result.click();
				
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(xpath);
		}

	}

	// inputTextById
	public void inputTextById(String elementId, WebDriver webDriver,
			String inputText) {
		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.id(elementId));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				result.sendKeys(inputText);
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(elementId);
		}
		

	}

	public void inputTextByXpath(String xpath, WebDriver webDriver,
			String inputText) {

		WebElement result;
		boolean found = false;
		int waitTime = 30; // in seconds
		for (int i = 0; i < waitTime; i++) {
			// Wait one second
			try {
				Thread.sleep(1000);

				// Check for the element
				result = webDriver.findElement(By.xpath(xpath));
				// if it is there end the waiting
				i = waitTime;
				found = true;
				
				result.sendKeys(inputText);
				
				// if it is not, catch the exception
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchElementException e) {
				System.out.println("Element not found.  wait time: " + i + "/"
						+ waitTime);
			}

		}

		// if the element is not present after waiting
		// do not do anything else
		if (!found) {
			throw new NoSuchElementException(xpath);
		}
		
	}

	// Sleep until the div we want is visible or 5 seconds is over
	// long end = System.currentTimeMillis() + 5000;
	// while (System.currentTimeMillis() < end) {
	// WebElement resultsDiv = driver.findElement(By.id("rso"));
	//
	// if (resultsDiv.isDisplayed()) {
	// break;
	// }
	// }

	// // And now list the suggestions
	// // List<WebElement> allSuggestions =
	// driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));
	// List<WebElement> allResults =
	// driver.findElements(By.xpath("//*[@id=\"rso\"]/li[1]/div/h3/a"));
	// int resultsCounter = 0;
	// for (WebElement suggestion : allResults) {
	// // System.out.println(suggestion.getText());
	// resultsCounter++;
	// // WebElement link = suggestion.findElement(By.tagName("a"));
	// // WebElement title = link.findElement(By.tagName("em"));
	// System.out.println("Result #" + resultsCounter + ": " +
	// suggestion.getText());

}
