package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\WebDriverDemoProject\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.quit();		
		
	}

}
