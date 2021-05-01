package Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Totaloptions {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ANKIT/Desktop/code.html");

		driver.manage().window().maximize();
		
		WebElement drpdwn = driver.findElement(By.name("Country"));
		
		Select sel = new Select(drpdwn);
		List<WebElement> alloptions = sel.getOptions();
		
		System.out.println(alloptions.getClass().getSimpleName());
		
		int count = alloptions.size();
		System.out.println("Total counts:"+count);
		
		for (int i = 0; i < count ; i++) 
		{
			String optionstext = alloptions.get(i).getText();
			System.out.println(optionstext);
		}
		
		for (int i = 0; i < count; i++) 
		{
		    sel.selectByIndex(i);	
		}
		for (int j = count-1; j >=0; j--)
		{
			//sel.deselectAll();
			// sel.deselectByIndex(j);
		}
		
	}

}
