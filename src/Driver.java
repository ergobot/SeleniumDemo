import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// The Firefox driver supports javascript
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("C:\\Users\\Sean\\workspace\\SeleniumDemo\\src\\state_table.html");
		List<WebElement> stateElements = driver.findElements(By
				.tagName("option"));
		ArrayList<String> states = new ArrayList<String>();
		for (WebElement state : stateElements) {
			System.out.println(state.getText());
			states.add(state.getText());
		}

		for (String state : states) {
			// Go to the Google Suggest home page
			driver.get("http://www.google.com/");

			// Enter the query string "Cheese"
			WebElement query = driver.findElement(By.name("q"));
			query.sendKeys(state+"\n");

			List<WebElement> allResults = driver.findElements(By.xpath("//*[@id=\"rso\"]/li/div/h3/a"));
//					.xpath("//*[@id=\"rso\"]/li[1]/div/h3/a"));
			int resultsCounter = 0;
			for (WebElement suggestion : allResults) {
				resultsCounter++;
				System.out.println("Result #" + resultsCounter + ": "
						+ suggestion.getText());
			}
		}

		// for (int i = 0; i < waitTime; i++)
		// {
		// // Wait one second
		// try {
		// Thread.sleep(1000);
		//
		// // Check for the element
		// WebElement resultsDiv = driver.findElement(By.id(elementId));
		// // if it is there end the waiting
		// i=waitTime;
		// found = true;
		// // if it is not, catch the exception
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// catch (NoSuchElementException e){
		// System.out.println("Element not found.  wait time: " +
		// i+"/"+waitTime);
		// }
		//
		//
		//
		// }

		// if the element is not present after waiting
		// do not do anything else
		// if(!found)
		// {
		// throw new NoSuchElementException(elementId);
		// }

		// And now list the suggestions
		// List<WebElement> allSuggestions =
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
		// }

	}

}
