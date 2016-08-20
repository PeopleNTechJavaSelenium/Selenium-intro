package hello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\rrt\\Documents\\selenium-browser-driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("http://amazon.com");
		driver.manage().window().maximize();
	}

}
