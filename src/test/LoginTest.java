package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		Thread.sleep(5000);

		//step1 click login
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		//step2
		WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys("abc@xyz.com");
        //step 3
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test@1234");
        Thread.sleep(15000);
        //step 4 click remember me
    
        //step5 login
        WebElement LoginBtn = driver.findElement(By.name("btn_login"));
        LoginBtn.click();
        //step6
        WebElement Error = driver.findElement(By.id("msg_box"));
        
        String ActError = Error.getText();
        String ExpError = "The email or paasword you have entered is invalid.";
        
        if(ActError.equals(ExpError))  {
        	System.out.println("Tc passed");
        } else {
        	System.out.println("Tc failed");
        }
        
		List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("The total no of links are " + Links.size());
        
        for(int index=0;index<Links.size();index++) {
        	System.out.println(Links.get(index).getAttribute("href"));
        }
        driver.close();
        }
}