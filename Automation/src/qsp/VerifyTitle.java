package qsp;                                                  

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class VerifyTitle {
	@Test
public void demo() throws IOException {
		FileInputStream fis=new FileInputStream("./common.properties");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
}
}
