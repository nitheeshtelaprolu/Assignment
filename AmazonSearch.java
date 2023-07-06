package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist Watches");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	}

}
