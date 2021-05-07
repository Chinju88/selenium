import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_xpedia {
	
	public void location(WebDriver driver, String loc){
		List<WebElement> originList=new ArrayList<WebElement>();
		String originAirportList;
		originList=driver.findElements(By.cssSelector("li.uitk-typeahead-result-item.has-subtext strong"));
		//System.out.println(originList.size());
		for(int i=0; i<originList.size(); i++) {
			
			originAirportList=originList.get(i).getText();
			System.out.println(originAirportList);
			if(originAirportList.contains(loc)) {
				originList.get(i).click();
				break;
			}
		}
		
	}
	//public String originAirportList;
	//public String DestionationAirportList;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		Assigment_xpedia source= new Assigment_xpedia();
		
		WebDriver driver= new ChromeDriver();
		WebElement wb;
		driver.get("https://www.expedia.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		
		
		
		//Source
		driver.findElement(By.id("location-field-leg1-origin-menu")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#location-field-leg1-origin")).sendKeys("cok");
		Thread.sleep(2000);
//		List<WebElement> originList=new ArrayList<WebElement>();
//		String originAirportList;
//		originList=driver.findElements(By.cssSelector("li.uitk-typeahead-result-item.has-subtext strong"));
//		//System.out.println(originList.size());
//		for(int i=0; i<originList.size(); i++) {
//			
//			originAirportList=originList.get(i).getText();
//			System.out.println(originAirportList);
//			if(originAirportList.contains("Cochin")) {
//				originList.get(i).click();
//				break;
//			}
//			
//			
//		}
		source.location(driver, "Cochin");
		
		//Destination
		driver.findElement(By.id("location-field-leg1-destination-menu")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#location-field-leg1-destination")).sendKeys("Toronto");
		Thread.sleep(2000);
//		List<WebElement> destinationList=new ArrayList<WebElement>();
//		destinationList=driver.findElements(By.cssSelector("li.uitk-typeahead-result-item.has-subtext strong"));
//		System.out.println(destinationList.size());
//		for(int j=0;j<destinationList.size();j++) {
//			if(destinationList.get(j).getText().contains("Pearson")){
//				destinationList.get(j).click();
//				break;
//				
//			}
//			
//			
//		}
		
		source.location(driver,"Pearson");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"d1\"]/following-sibling::button[1]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	

}


