package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		//Launch 
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		
		WebElement Button1 = driver.findElement(By.id("alertButton"));
		Button1.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		WebElement Button2 = driver.findElement(By.id("confirmButton"));
		Button2.click();
		
		 alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		WebElement Button3 = driver.findElement(By.id("promtButton"));
		Button3.click();
		
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.sendKeys("Hello World");
		alert.accept();
	}
	

}
