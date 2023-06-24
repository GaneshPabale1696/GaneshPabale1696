package SeleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBootStrapDropBoxes {
	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();

	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops); // launch chrome

	driver.manage().window().maximize(); // maximize window
	driver.manage().deleteAllCookies(); // delete all cookies

	// dynamic wait
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");// enter url
	Thread.sleep(4000);

	//dropdownMenuButton
	driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	
	List<WebElement> list= driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu') and @aria-labelledby='dropdownMenuButton']//a"));

	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("Another action")) {
			list.get(i).click();
			break;
		}
	}
	
	}
	
}
