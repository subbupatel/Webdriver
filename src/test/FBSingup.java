package test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSingup {

	private static final String Gender = null;
	private static final String driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		WebElement SignUp = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click();
		
		WebElement Fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement Lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));Thread.sleep(5000);
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	
		Fname.sendKeys("Fname");
		Lname.sendKeys("Lname");
		Mobile.sendKeys("1234567890");
		password.sendKeys("xyz@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select ddmonth = new Select(month);
	    ddmonth.selectByVisibleText("Sep");
	    
	    System.out.println("selected month is " + ddmonth.getFirstSelectedOption().getText());
	    
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select ddyear = new Select(year);
		ddyear.selectByVisibleText("1992");
		
		List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
		for(WebElement elm: AllMonths) {
		System.out.println(elm.getText());
		}
		String Gender ="Male";
		
		WebElement Female =driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement Male =driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement other =driver.findElement(By.xpath("//input[@type='radio' and @value='-1']"));
		
		if(Gender.equals("Female"))  {
			Female.click();
}

			else if(Gender.equals("Male"))  {
			Male.click();
		}
			else {
				other.click();
		}       
}
}
