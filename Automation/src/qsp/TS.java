package qsp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TS {
public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.royalchallengers.com/");
TakesScreenshot ts=(TakesScreenshot) driver;
File temporary = ts.getScreenshotAs(OutputType.FILE);
File permanent=new File("./screenshots/rcb.png");
FileUtils.copyFile(temporary, permanent);
driver.quit();
}
}
