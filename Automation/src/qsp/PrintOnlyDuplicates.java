package qsp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<WebElement> allOptions = s.getOptions();
	Set<String> optInText=new TreeSet<String>();//Print in sorted order without duplicates
//	Set<String> optInText=new HashSet<String>();//Print without duplicates
//	List<String> optInText=new ArrayList<String>();//Print in sorted order with duplicates
	for(int i=0;i<allOptions.size();i++) {
		WebElement ele = allOptions.get(i);
		String text = ele.getText();
		optInText.add(text);
//		if(!optInText.add(text)) {//Print only duplicates
//			System.out.println(text);
//		}
	}
//	Collections.sort(optInText);
	for (String string : optInText) {
		System.out.println(string);
	}
	driver.quit();
	}
}