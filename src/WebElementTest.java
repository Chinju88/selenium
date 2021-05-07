import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		WebElement wb;
		driver.get("https://facebook.com");
		//wb=driver.findElement(By.id("twotabsearchtextbox"));
		//wb.
		wb=driver.findElement(By.id("email"));
		wb.sendKeys("chinju");
		Thread.sleep(2000);
		wb=driver.findElement(By.name("email"));
		//wb=driver.findElement(By.tagName("email"));
		wb.clear();
		wb=driver.findElement(By.xpath("//input[@name='email']"));
	    wb.sendKeys("george");
	    wb=driver.findElement(By.cssSelector("Input.inputtext._55r1._6luy"));
	    //wb=driver.findElement(By.cssSelector("input[id='pass']"));
	    //wb=driver.findElement(By.cssSelector("input#password"));//shortcut
		wb.sendKeys("password");
		String str= driver.findElement(By.cssSelector("h2._8eso")).getText();
		
		System.out.println("The text is : "+str);
		//wb=driver.findElement(By.linkText("Forgot Password?"));
		//wb=driver.findElement(By.partialLinkText("Forgot Password?"));
		//wb.click();
		Thread.sleep(5000);
		driver.quit();
	
}
}
