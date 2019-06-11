package day1.Edge;

import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEdge {
	
	//https://seleniumhq.github.io/selenium/docs/api/java/index.html
	EdgeDriver driver;
	
	public void invokeBrowser()
	{
		//System.setProperty("webdriver.edge.driver", "C:\\libs\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		
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
	

}
