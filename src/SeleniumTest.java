import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//chinju//JavaWorkspace//drivers//chromedriver-2");
		
		//System.setProperty("webdriver.firefox.driver","//Users//chinju//JavaWorkspace//drivers//geckodriver");
		
		WebDriver wd= new ChromeDriver();
		//WebDriver wd1= new FirefoxDriver();

		/*System.out.println("Enter the browser: ");
		Scanner s = new Scanner(System.in);
		String w = s.nextLine();
		if(w.equals(wd)) {
			wd.get("https://www.amazon.com/");
		}else {
			wd1.get("https://www.amazon.com/");
		}
		*/
		wd.get("https://www.amazon.com/");
		//String pageSource;
		//pageSource = wd.getPageSource();
		//System.out.println(pageSource);
		String url;
		url=wd.getCurrentUrl();
		System.out.println("The URL is " +url);
		String title;
		title=wd.getTitle();
		System.out.println("The Title is "+title);
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(title.equals(expectedTitle)) {
			System.out.println("The title is right");
			
		}else {
			System.out.println("Not matching");
		}
		
		//wd.navigate().back();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		wd.quit();//closes all the tabs opened
		
		//wd.close();//closes the current browser
		
		
	}

}
