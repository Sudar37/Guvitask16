package GuviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new FirefoxDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("https://www.google.com/");

        // Print the current page URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Reload the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
	}

}
