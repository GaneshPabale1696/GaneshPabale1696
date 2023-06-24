package SeleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapGoogle {

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

		driver.get("https://mojoaxel.github.io/bootstrap-select-country/index.html");// enter url
		Thread.sleep(4000);

		// dropdownMenuButton
		driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select countrypicker f16']//button[@class='btn dropdown-toggle btn-default']//span//i[@class='glyphicon inline-flag flag af']")).click();

		// body/div/div/div[6]/div[1]/div[1]/button[1]/span[1]

		List<WebElement> list = driver.findElements(By.xpath("//h4[text()='With Flag']//following-sibling::div//ul[@class='dropdown-menu inner']//li/a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("India")) {
				list.get(i).click();
				break;
			}

		}

	}

}
