package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		//Launch 
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		
		WebElement FileUpload = driver.findElement(By.name("uploadfile_0"));
		FileUpload.sendKeys("C:\\Users\\vipin vishwakarma\\Desktop");
		
		WebElement TnC = driver.findElement(By.id("terms"));
		TnC.click();
		
		WebElement Submit = driver.findElement(By.id("submitbutton"));
		Submit.click();
		
	}

}


