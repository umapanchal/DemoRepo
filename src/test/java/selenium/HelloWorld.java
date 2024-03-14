package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://amazon.com");

	}
}
