package GuviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Navigate to Demoblaze website
	        driver.get("https://www.demoblaze.com/");

	        // Verify the title of the page
	        String pageTitle = driver.getTitle();
	        if (pageTitle.equals("STORE")) {
	            System.out.println("Page landed on correct website");
	        } else {
	            System.out.println("Page not landed on correct website");
	        }

	        // Close the browser
	        driver.quit();
	}

}
