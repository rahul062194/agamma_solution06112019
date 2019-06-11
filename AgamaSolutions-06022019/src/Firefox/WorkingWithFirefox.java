package Firefox;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithFirefox {
	
	//https://seleniumhq.github.io/selenium/docs/api/java/index.html
	//ctrl shift o to get rid of warnings.
	FirefoxDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\libs\\Firefoxdriver24\\geckodriver.exe");
		driver=new FirefoxDriver();
		
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
