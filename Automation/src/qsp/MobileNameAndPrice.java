package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MobileNameAndPrice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://flipkart.com");
	driver.findElement(By.name("q")).sendKeys("iphone 15 pro max"+Keys.ENTER);
	List<WebElement> allMobileNames = 
driver.findElements(By.xpath(" //div[contains(text(),'Apple iPhone') and @class]"));
	List<WebElement> allPrices = driver.findElements(By.xpath
("//div[contains(text(),'Apple iPhone') and @class]/../../div[2]/div[1]/div[1]/div[1]"));
	int mobNameCount = allMobileNames.size();
	System.out.println(mobNameCount);
	for(int i=0;i<allMobileNames.size()&&i<allPrices.size();i++) {
		WebElement ele1 = allMobileNames.get(i);
		WebElement ele2 = allPrices.get(i);
		String name = ele1.getText();
		String price = ele2.getText();
		System.out.println(name+" ==> "+price);
	}
	
}
}
