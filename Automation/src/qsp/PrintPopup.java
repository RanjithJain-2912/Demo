package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);Thread.sleep(3000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);Thread.sleep(2000);
	for(int i=0;i<4;i++) {
		r.keyPress(KeyEvent.VK_DOWN);Thread.sleep(2000);
	}
	r.keyPress(KeyEvent.VK_1);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_MINUS);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_2);Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
}
}
