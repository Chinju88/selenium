import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTry1 {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
			
			//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
			
			WebDriver driver= new ChromeDriver();
			WebElement wb;
			driver.get("https://www.espncricinfo.com");
			wb=driver.findElement(By.cssSelector("i.espn-icon.icon-search-solid-after.icon-.text-light"));
			wb.click();
			wb=driver.findElement(By.cssSelector("input[name='search']"));
			wb.sendKeys("India");
			wb=driver.findElement(By.cssSelector("button[type='submit']"));
			wb.click();
			wb=driver.findElement(By.cssSelector("a[href='/db/NATIONAL/IND/']"));
			wb.click();
			
			
			Thread.sleep(3000);
			driver.quit();

	}

}
