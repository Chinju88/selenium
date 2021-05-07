import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		//WebElement wb;
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("abcd");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		/*Alert a1 = driver.switchTo().alert();
		String alerttext= a1.getText();
		System.out.println(alerttext);
		Thread.sleep(2000);
		a1.accept();
		Thread.sleep(3000);
		*/
	
		Thread.sleep(3000);
		
	
		driver.quit();
	}
	
}
