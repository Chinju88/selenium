import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		//WebElement wb;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//Synchronization in Selenium(imlicit wait)
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		//WebDriverWait wait= new WebDriverWait(driver,8);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(null))));
		
		//Thread.sleep(2000);
		
		
		List<WebElement> alist=new ArrayList<WebElement>();
		alist= driver.findElements(By.cssSelector("h4.product-name"));
		String[] vegs = {"Carrot", "Beans","Brinjal"};
		String VegName;
		List<String> VegList=Arrays.asList(vegs);
		//System.out.println(VegList);
		String NameofVeg;
		
		int count=0;
		int VegSize=vegs.length;
		//System.out.println(VegSize);
		
		for(int i=0;i<alist.size();i++) {
			VegName=alist.get(i).getText();
			//System.out.println(VegName);
			String[] splitVeg=VegName.split(" - ");
			NameofVeg=splitVeg[0];
			//System.out.println(NameofVeg);
			
		
			if(VegList.contains(NameofVeg))
			{
			
				count=count+1;
				if(NameofVeg.contains("Carrot")) {
					driver.findElements(By.cssSelector("a.increment")).get(i).click();
					//Thread.sleep(1000);
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					int c=Integer.parseInt(driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::p")).get(i).getText());
					//System.out.println("c: "+c);
					
					
					
					
					
				}else if(NameofVeg.contains("Beans")){
				
					driver.findElements(By.cssSelector("input.quantity")).get(i).clear();
					driver.findElements(By.cssSelector("input.quantity")).get(i).sendKeys("3");
					//Thread.sleep(5000);
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					int b=Integer.parseInt(driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::p")).get(i).getText());
					//System.out.println("B: "+b);
					
					
					//Thread.sleep(5000);
				
				}
				else {
					//Thread.sleep(5000);
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					
					int Br=Integer.parseInt(driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::p")).get(i).getText());
					//System.out.println("Br: "+Br);
					//Thread.sleep(1000);
				}
			
				
				Thread.sleep(5000);
				if(count==VegSize) {
					break;
				}
				
			}
				
			
		}
		
		//if(VegSize==)
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.action-block")).click();
		List<WebElement> cartinfo=new ArrayList<WebElement>();
		cartinfo= driver.findElements(By.cssSelector("div.cart-info strong"));
		String price=cartinfo.get(1).getText();
		System.out.println("Total Price: "+price);
		
		
		
		//Thread.sleep(4000);
		
		//driver.quit();
		
		
	}
}
