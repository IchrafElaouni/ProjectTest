package mycompany;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class Test_DragDrop2 {
	@Test
	public void ddd() {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\formation _Selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		
		//localisateur par different attribut (name,id class)
		driver.findElement(By.id("email")).sendKeys("el.ichraf@gmail.com");
//	    TakesScreenshot scrShot =((TakesScreenshot)driver);
//	    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  
//	    	FileUtils.copyFile(src, new File("C:\\Users\\Public\\imp.png"));
	    
	    }

		
	}	
	

