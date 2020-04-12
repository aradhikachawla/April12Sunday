


import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
	
	protected static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS );
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys("aradhikachawla@cpq4ever.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Ashish_123");
		driver.findElement(By.cssSelector("#Login")).click();
		driver.findElement(By.xpath("//nav[contains(@class,'appLauncher')]//button")).click();
		Thread.sleep(15000);
		((JavascriptExecutor) driver).executeScript(     "arguments[0].click();",     driver.findElement(By.xpath("//button[text()='View All']")));
		Thread.sleep(5000);
	   ((JavascriptExecutor) driver).executeScript(     "arguments[0].click();",     driver.findElement(By.xpath("//a[@data-label='Opportunities']")));
		System.out.println("parent title"+driver.getTitle());
		((JavascriptExecutor) driver).executeScript(     "arguments[0].click();",     driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Opportunities')]")));
	    Thread.sleep(8000);
	   ((JavascriptExecutor) driver).executeScript(     "arguments[0].click();",  driver.findElement(By.xpath("//div[@class='slds-truncate']")) );
	    Thread.sleep(8000);
		add(4,5);
		driver.findElement(By.cssSelector("input[id$='a']")).sendKeys("23");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox']//input")).click();
		add(1,5);
        Thread.sleep(5000);
		add(9,5);
		driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();
        Thread.sleep(5000);
	//	driver.findElement(By.xpath("//span[@class='slds-day weekday todayDate selectedDate DESKTOP uiDayInMonthCell--default']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='today slds-button slds-align_absolute-center slds-text-link']")).click();
		Thread.sleep(5000);
        //button[@class='today slds-button slds-align_absolute-center slds-text-link']
    	driver.findElement(By.xpath("//div[contains(@class,'full forcePageBlock forceRecordLayout')]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//div[1]//div[1]//input[1]")).sendKeys("Second opp");
		Thread.sleep(5000);

    	driver.findElement(By.xpath("//div[@class='uiMenu uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select']//div[@class='uiPopupTrigger']//div//div//a[@class='select']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Negotiation')]")).click();
        Thread.sleep(5000);       
        driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']//span[contains(@class,'label bBody')]")).click();
		
	}
	
	
	
	
	
	
	public static void add(int a, int b) {
		int c= a +b;
		System.out.println("c" + c);
	}
	
	
	

	public static void loginSalesforce() throws InterruptedException {

	Thread.sleep(5000);
	
	Thread.sleep(5000);
	System.out.println("c" );

	driver.findElement(By.cssSelector("#username")).sendKeys("aradhikachawla@cpq4ever.com");
	Thread.sleep(5000);


	driver.findElement(By.cssSelector("#password")).sendKeys("Ashish_123");
	driver.findElement(By.cssSelector("#Login")).click();
	
	Thread.sleep(15000);
	}
	
	
	public static void loginSalesforce1() throws InterruptedException {
		//Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("aradhikachawla@cpq4ever.com");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("Ashish_123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(15000);
	}

	public static void navigateViaAppLauncher(By element) {
		   driver.findElement(By.xpath("//nav[contains(@class,'appLauncher')]//button")).click();
		   ((JavascriptExecutor) driver).executeScript(     "arguments[0].click();",     driver.findElement(By.xpath("//button[text()='View All']")) );

		   jsClick(By.xpath("//button[text()='View All']"));
		   jsClick(element);
	}
	
	
	public static void jsClick(By locator) { 
		jsClick(driver.findElement(locator));
	}
	
	
	public static void jsClick(WebElement elem) { 
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elem     ); 
		try {
			Thread.sleep(1000L); 
		} catch (InterruptedException ie) {
			; /* ignore */ }
	}
	
	
	
}




//int size = driver.findElements(By.tagName("iframe")).size();
//	System.out.println("size"+ size);

//	driver.switchTo().frame(0);
//	System.out.println("childWindowId title"+driver.getTitle());
//WebDriver driver1 = new  SafariDriver();		
//	WebDriver driver2 = new FirefoxDriver();
//	WebDriver driver3 = new InternetExplorerDriver();
//driver.findElement(By.cssSelector("button.tds-button_neutral")).click();
//	driver.findElement(By.cssSelector("#login_with_google")).click();

//driver.findElement(By.cssSelector("img[alt='salesforce']")).click();
////a[@class='slds-card__footer-action']
// add(4,5);
//loginSalesforce();
//loginSalesforce();
//jsClick(By.xpath("//button[text()='View All']"));
		// navigateViaAppLauncher(By.xpath("//a[@data-label='Accounts']"));
		// jsClick(By.xpath("//a[@data-label='Accounts']"));
//jsClick(driver.findElement(By.xpath("//button[text()='View All']"))); 
//div[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox']//input
//driver.findElement(By.cssSelector("input[id$='a']")).sendKeys("Second Opp");
//driver.findElement(By.xpath("//div[@id='1344:0']//div//a[@class='select'][contains(text(),'--None--')]")).click();
//((JavascriptExecutor) driver).executeScript(   
//"arguments[0].click());", driver.findElement(By.xpath ("//div[@class='slds-float_right']//button[1]//span[1]")));
//div[@class='button-container-inner slds-float_right']//button[1]//span[1]
//button[contains(@class,'slds-button slds-button--neutral uiButton--neutral uiButton forceActionButton')]//span[contains(@class,'label bBody')][contains(text(),'Cancel')]
//((JavascriptExecutor) driver).executeScript(     "arguments[0].click());",     driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button--neutral uiButton--neutral uiButton forceActionButton')]//span[contains(@class,'label bBody')][contains(text(),'Cancel')]")) );
//input[contains(@class,'uiInputSmartNumber uiInput uiInput--default uiInput--input')]
//div[@class='slds-truncate']

//Thread.sleep(5000);

//	driver.quit();  
