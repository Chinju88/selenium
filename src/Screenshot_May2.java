import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_May2 
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");

WebDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

List<WebElement> ele=new ArrayList();

String str=null;
WebElement wb; 
String url="https://www.expedia.com/";
driver.get(url);
driver.manage().window().maximize();
driver.findElement(By.linkText("Flights")).click();

TakesScreenshot scrshot=(TakesScreenshot) (driver);

}
}