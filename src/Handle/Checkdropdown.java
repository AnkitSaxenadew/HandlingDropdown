package Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkdropdown {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ANKIT/Desktop/code.html");

		driver.manage().window().maximize();
		
		WebElement drpdwn1 = driver.findElement(By.name("Country"));
		
		

	}

}
