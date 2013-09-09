import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxDriver {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// The Firefox driver supports javascript
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demos.telerik.com/aspnet-ajax/xmlhttppanel/examples/clientsidecontentload/defaultcs.aspx");
		List<WebElement> personsElements = driver.findElements(By.className("rgRow"));
		personsElements.addAll(driver.findElements(By.className("rgAltRow"))); 
		
		
		ElementFinder finder = new ElementFinder();
		
		ArrayList<Person> persons = new ArrayList<Person>();
//		List<WebElement> personDivs = new List<WebElement>();
		
		for (WebElement personElement: personsElements) {
			// click the element
			personElement.click();
			
			Person person = new Person();
			List<WebElement> elements = finder.getElementsByClass("info", driver);
			if(persons.size()> 0)
			{
				while(persons.get(persons.size()-1).getName().compareTo(elements.get(0).getText()) == 0)
				{
					System.out.println("This was the previous entry, trying again");
					elements = finder.getElementsByClass("info", driver);
				}
				
				
			}
			person.setName(elements.get(0).getText());
			person.setJob(elements.get(1).getText());
			person.setCompanyName(elements.get(2).getText());
			person.setAddress(elements.get(3).getText());
			person.setCity(elements.get(4).getText() + ", " + elements.get(5).getText());
			persons.add(person);
			
			
			// Get the div of people
			
		}
		
		for(Person person : persons){
			System.out.println(
					"\n**********Person**********" + "\n" +
					person.getName() + "\n" +
					person.getJob()  + "\n" +
					person.getCompanyName() + "\n" +
					person.getAddress() + "\n" +
					person.getCity() + "\n" +
					"**************************\n"
					);
		}
		

//		for (String state : states) {
//			// Go to the Google Suggest home page
//			driver.get("http://www.google.com/");
//
//			// Enter the query string "Cheese"
//			WebElement query = driver.findElement(By.name("q"));
//			query.sendKeys(state+"\n");
//
//			List<WebElement> allResults = driver.findElements(By.xpath("//*[@id=\"rso\"]/li/div/h3/a"));
//			int resultsCounter = 0;
//			for (WebElement suggestion : allResults) {
//				resultsCounter++;
//				System.out.println("Result #" + resultsCounter + ": "
//						+ suggestion.getText());
//			}
//		}


	}

}
