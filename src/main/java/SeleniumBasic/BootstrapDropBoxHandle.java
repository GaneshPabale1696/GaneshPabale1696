package SeleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropBoxHandle {

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

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");// enter url
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));

		System.out.println(list.size());

		/*
		 * for (int i=0;i<list.size();i++) { if(list.get(i).isSelected()) {
		 * System.out.println(list.get(i).getText());
		 * 
		 * }else if(!list.get(i).isSelected()){
		 * 
		 * list.get(i).click();
		 * 
		 * }
		 * 
		 * 
		 * }
		 */	
		
		 //Selecting angular option  
		for (int i = 0; i < list.size(); i++) { 
		  System.out.println(list.get(i).getText());
		  if (list.get(i).getText().contains("Angular")) { 
			  list.get(i).click();
		  }
		  break; 
		  } 
		}
		 
	}

