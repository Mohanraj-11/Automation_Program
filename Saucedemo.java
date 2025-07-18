package sauceDemo;

// Import necessary Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo {

    public static void main(String[] args) {

        // Launch a new Chrome browser instance
        ChromeDriver driver = new ChromeDriver();

        // Open the SauceDemo login page
        driver.get("https://www.saucedemo.com/v1/");

        // Enter the username "standard_user" in the username field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter the password "secret_sauce" in the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click on the login button
        driver.findElement(By.id("login-button")).click();

        // Close the browser
        driver.quit();
    }
}
