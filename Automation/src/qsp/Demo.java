package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     Thread.sleep(10000);
     driver.get("https://www.facebook.com/");
     Thread.sleep(5000);
     driver.close();
     
	}

}
