package repertoirObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectTestForgetPwd {
	
	WebDriver driver; 
	
	
	public ObjectTestForgetPwd(WebDriver driver)
	
	{
	
	this.driver=driver;
			
	}
	
	private By telephone=By.id("identify_email");
	public WebElement retourTelephone(){
		return(driver.findElement(telephone));
	}
	
	
	
	
}

