package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificOption {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the option");
	String dish = s.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select select=new Select(mtr);
	boolean res=false;
	List<WebElement> allOptions = select.getOptions();
	for(WebElement ele:allOptions) {
		String text = ele.getText();
		if(text.equalsIgnoreCase(dish)) {
			res=true;
			break;		}	}
	if(res==true) {
		System.out.println(dish +" is present in the dropdown");
	}else {
		System.out.println(dish+" is not present in the dropdown");
	}
	driver.quit();
}
}
