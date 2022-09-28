package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSenario2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\vtiger\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='X'")).click();
		driver.findElement(By.name("q")).sendKeys("redmi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> REDMI = driver.findElements(By.xpath("//li[@class='rgWa7D'and (text()='4GB RAM|64GB ROM | Expandable Upto 1TB')]"));
        for(WebElement st : REDMI)
        {
        	System.out.println(st.getText());
        }
	}

}
