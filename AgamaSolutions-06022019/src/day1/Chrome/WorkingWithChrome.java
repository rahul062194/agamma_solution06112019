package day1.Chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	//https://seleniumhq.github.io/selenium/docs/api/java/index.html
	ChromeDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\libs\\chromedriver75\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com"); //url of website that we want to go
		
	}
	
	public void getTitleOfThePage()
	{
		System.out.println("Title of the page :: "+driver.getTitle());
	}
	
	public void closeBrowser()
	{
		//driver.close(); // it only closes the current active window
		driver.quit(); // It closes all the windows opened by selenium
	}
	
	public void navigateCommands()
	{
		driver.navigate().to("http://facebook.com"); // takes you to the url
		driver.navigate().back();					//takes you back 1 browser history
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

}
