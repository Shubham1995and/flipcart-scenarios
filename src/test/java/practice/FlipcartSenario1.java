package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSenario1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\vtiger\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='X'")).click();
		driver.findElement(By.name("q")).sendKeys("winter heater");
		driver.findElement(By.xpath("div[text()='in Room Heaters']")).click();
		driver.findElement(By.partialLinkText("DARSHANAM WORLD 220v 500w Portable Electric Heater Mini...")).click();
		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();

	}

}
