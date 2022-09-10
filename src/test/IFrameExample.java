package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		//Launch 
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame("frame1");
		
		WebElement Header = driver.findElement(By.id("sampleHeading"));
		System.out.println(Header.getText());
		
		driver.switchTo().defaultContent();
	}

}
