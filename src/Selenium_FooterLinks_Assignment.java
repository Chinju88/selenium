import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FooterLinks_Assignment {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		//WebElement wb;
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElements(By.cssSelector("div[id='gf-BIG' a]"));
		List<WebElement> flist=new ArrayList<WebElement>();
		flist=driver.findElements(By.cssSelector("div#gf-BIG a"));
		
		//System.out.println(flist);
		
		for(int i=0;i<flist.size();i++) {
		 System.out.println(flist.get(i).getText());
		}
		driver.quit();
		
		
		
	}

}
