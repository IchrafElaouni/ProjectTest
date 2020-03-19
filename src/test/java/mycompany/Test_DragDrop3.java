package mycompany;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

public class Test_DragDrop3 {
	@Test
	public void ddd() throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\formation _Selenium\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();	
		//il existe un objet iframe 
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		/*WebElement subMenu = driver.findElement(By.cssSelector("subLinklocator"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();*/

		WebElement From=driver.findElement(By.id("draggable"));	
	    
	    //Element on which need to drop.		
	    WebElement To=driver.findElement(By.id("droppable"));					
	    		
	    //Using Action class for drag and drop.		
	    Actions act=new Actions(driver);					

	//Dragged and dropped.		
	    act.dragAndDrop(From, To).build().perform();	
	    
	    // passer à la page principale 
	    driver.switchTo().defaultContent();
	    WebElement lienblog=driver.findElement(By.linkText("Blog"));
	    lienblog.click();
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
   	FileUtils.copyFile(src, new File("C:\\Users\\Public\\imp.png"));
	    
	    }

		
	}	
	

