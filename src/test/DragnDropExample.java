package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		//Launch demo.guru99.com
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		//li[@id='credit2']/a
		WebElement From = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions act = new Actions(driver); 
		act.dragAndDrop(From, To).build().perform();
		
	}

}
