package learningLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Id
	  driver.findElement(By.id("username")).sendKeys("demosalesmanager"); //30-1 29
		
		
		// name
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		// tag name
		String text = driver.findElement(By.tagName("label")).getText();

		System.out.println(text);
		// classname linkText partial linkText tagname xpath css

		driver.findElement(By.className("decorativeSubmit")).click();

		// partialLinktext

		driver.findElement(By.partialLinkText("CR")).click();

		// linkText
		driver.findElement(By.linkText("Leads")).click();
		
		//create leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mohan");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohan Raj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
