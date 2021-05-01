package Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectoption {

	public static void main(String[] args){
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver.exe";
	
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/ANKIT/Desktop/code.html");

	driver.manage().window().maximize();
	
	WebElement drpbx = driver.findElement(By.name("Country"));
	
       Select sel = new Select(drpbx);	
       
       //   sel.selectByIndex(4);
       //  sel.selectByValue("5");
       sel.selectByVisibleText("Pakistan");
       
		

	}

}

