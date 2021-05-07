import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTry2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver driver= new ChromeDriver();
		WebElement wb;
		driver.get("https://www.spicejet.com/");
		wb=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		wb.click();
		WebElement parent;
		parent=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		parent.click();
		parent.findElement(By.xpath("//a[@value='BLR']")).click();
		//WebElement parent1;
		wb=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		wb.click();
		wb.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div/table/tbody/tr[2]/td[2]/div[3]/div/div/ul[3]/li[3]/a")).click();
		
		wb=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dropSelect=new Select(wb);
		dropSelect.selectByIndex(4);
		
		
		//wb=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		//wb.click();
		//Select dropDepCity= new Select(wb);
		//dropDepCity.selectByValue("Kochi (COK)");
		//wb=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1_CTXT"));
		//Select dropArrCity= new Select(wb);
		//dropArrCity.selectByVisibleText("Delhi (DEL)");
		
		//wb=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_txt_Fromdate']"));
		//wb.click();
		//wb=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/a[1]"));
		//wb.click();
		
		//Thread.sleep(2000);
		//wb=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_txt_Todate']"));
		//wb.click();
		//wb=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[6]/a[1]"));
		//wb.click();
		//dropSelect.selectByValue("USD");
		
		wb=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']"));
		//wb.click();
		if(!wb.isSelected()) {
			wb.click();
		}
		
		Thread.sleep(2000);
		if(wb.isSelected()) {
			System.out.println("Checkboxx selected");
			wb.click();
			Thread.sleep(2000);
		}
		//driver.quit();
		
	}
}
