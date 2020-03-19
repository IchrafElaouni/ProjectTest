package repertoirObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectTestDragDROP{
	
	WebDriver driver;
	
	public ObjectTestDragDROP(WebDriver driver)
	
	{
	
	this.driver=driver;
			
	}
	private By email=By.xpath("//INPUT[@id='email']");
	private By pwd=By.id("pass");
	private By linkForgetPwd=By.linkText("Informations de compte oubliées ?");
	
	public WebElement retourEmail(){
		return(driver.findElement(email));
	}
	
	public WebElement retourPwd(){
		return(driver.findElement(pwd));
	}
	   
	public WebElement retourlinkForgetPwd(){
		return(driver.findElement(linkForgetPwd));
	}
	
	
	

}
