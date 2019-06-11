package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommandPractice {
	
	private ChromeDriver driver;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\libs\\\\chromedriver75\\\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public void openBroswer()
	{
		//get command loads a new webpage
		driver.get("https://www.google.co.in/");
	}
	
	public void toDo()
	{
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("Title length is ::: " +title.length());
		String url=driver.getCurrentUrl();
		
		String desiredUrl="https://www.google.co.in/";
		if(url.equalsIgnoreCase(desiredUrl))
		{
			System.out.println("It is the desired URL");
		}
		else
		{
			System.out.println("It is not the desired url!!!!!!!");
		}
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		System.out.println("Page Source length is::: "+pageSource.length() );
		
		driver.close();
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebCommandPractice obj= new WebCommandPractice();
		obj.invokeBrowser();
		obj.openBroswer();
		obj.toDo();
	
	}

}
