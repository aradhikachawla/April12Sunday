package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClassicTest {
	protected static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS );
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("aradhikachawla@cpq4ever.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Ashish_123");
		driver.findElement(By.cssSelector("#Login")).click();
		Thread.sleep(15000);
		System.out.println("parent title"+driver.getTitle());
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@value='Send to Salesforce']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("First opp");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id='opp9']")).click();
		add(7,9);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[contains(@name,'opp9')]")).click();
		Thread.sleep(12000);
	//	driver.findElement(By.xpath("//a[contains(@class,'calToday')]")).click();
		
		//driver.findElement(By.xpath("//td[contains(@text(),'27')]")).click();

	//	driver.findElement(By.xpath("//tr[6]//td[5]")).click();
		Thread.sleep(8000);	
		//driver.findElement(By.xpath("//select[@id='opp11']")).sendKeys("Prospecting");
		Thread.sleep(8000);
		add(4,5);
		driver.findElement(By.name("save")).click();
		String errorMessage = driver.findElement(By.xpath("//div[@class = 'errorMsg']")).getText();
	
		System.out.println("errorMessage : " + errorMessage);
	}
	

	
	
	
	public static void add(int a, int b) {
		int c= a +b;
		System.out.println("c" + c);
	}

}






//Set<String> handler = 	driver.getWindowHandles();		
	//	java.util.Iterator<String> it =  handler.iterator();
	//	String  childWindowId = it.next();			
	//	System.out.println("childWindowId"+ childWindowId);

	//	driver.switchTo().window(childWindowId);
	//	System.out.println("childWindowId title"+driver.getTitle());
