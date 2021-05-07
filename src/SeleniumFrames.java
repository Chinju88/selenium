import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		WebElement wb;
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//html/body/a/img")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//html/body/a/img")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
