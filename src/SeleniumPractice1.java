import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		WebElement wb;
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Gmail");
		//driver.findElement(null)
		
		//wb.sendKeys("nordia");
		//driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Hey Google");
		//driver.quit();
	}
}
