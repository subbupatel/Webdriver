package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTabExamples {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		//Launch 
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		
		String Parentwin = driver.getWindowHandle();
		System.out.println("before clicking tab button the window is " + Parentwin );
		
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		
		System.out.println("after clicking the window");
		Set<String> allWins = driver.getWindowHandles();
		
		for (String win : allWins)  {
			System.out.println(win);
		if(!win.equals(Parentwin))  {
			driver.switchTo().window(win);
		}
	}
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(childHeader.getText());
		
		driver.switchTo().window(Parentwin);
		
		WebElement WinBtn = driver.findElement(By.id("windowButton"));
		WinBtn.click();
		
		  driver.quit();
		}
}
