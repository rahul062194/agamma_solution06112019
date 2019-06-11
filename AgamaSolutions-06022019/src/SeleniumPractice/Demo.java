package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//driver are what instantiate the browser
		System.setProperty("webdriver.chrome.driver", "C:\\libs\\chromedriver75\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("rahulIsToCoolForSkool@gmail.com"); //web element is anything that is on a webpage
		Thread.sleep(2000);
		
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);

		String at=driver.getTitle();
		String et="gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test is succsessful");
		}
		else
		{
			System.out.println("Test failure");
		}
		
		
		

	}

}
