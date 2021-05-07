import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		//WebElement wb;
		String str;
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.id("location-field-leg1-origin-menu")).click();
		driver.findElement(By.id("location-field-leg1-origin")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> e=new ArrayList();
		e=driver.findElements(By.cssSelector("li.uitk-typeahead-result-item.has-subtext strong"));
		System.out.println("Element Size: "+ e.size());
		for(int i=0; i<e.size(); i++) {
			str=e.get(i).getText();
			System.out.println(str);
			if(str.contains("Delhi")) {
				e.get(i).click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
		
	}
}
