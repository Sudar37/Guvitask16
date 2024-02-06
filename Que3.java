package GuviTask16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Navigate to Wikipedia
	        driver.get("https://www.wikipedia.org/");

	        // Search for "Artificial Intelligence"
	        WebElement searchBox = driver.findElement(By.id("searchInput"));
	        searchBox.sendKeys("Artificial Intelligence");
	        searchBox.submit();

	        // Click on the "History" section
	        WebElement historyLink = driver.findElement(By.linkText("History"));
	        historyLink.click();

	        // Print the title of the section
	        String sectionTitle = driver.getTitle();
	        System.out.println("Title of the History section: " + sectionTitle);

	        // Close the browser
	        driver.quit();
	}

}
