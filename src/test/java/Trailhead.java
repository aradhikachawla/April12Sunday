

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trailhead {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://trailhead.salesforce.com");		
		Thread.sleep(5000);	
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button.tds-button_neutral")).click();
		Thread.sleep(5000);	
		driver.findElement(By.cssSelector("img[alt='salesforce']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#username")).sendKeys("aradhikachawla@cpq4ever.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Ashish_123");
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(15000);
		driver.findElement(By.partialLinkText("badges")).click();
		Thread.sleep(20000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='slds-card__footer-action']")));

		
		System.out.println("done");
	
	}

}
