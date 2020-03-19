package mycompany;


import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import repertoirObjet.ObjectTestDragDROP;
import repertoirObjet.ObjectTestForgetPwd;

import org.openqa.selenium.TakesScreenshot;

public class Test_DragDrop {
	
	public static Logger log=LogManager.getLogger(Test_DragDrop.class.getName());

	@Test
	public void ddd() {
		// TODO Auto-generated method stub
		
		// ouvrire FB_ ecrire mot de passe _clicker sur mot de passe _cliker sur 
		System.setProperty("webdriver.chrome.driver", "C:\\formation _Selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		ObjectTestDragDROP objetPageAcceuil = new ObjectTestDragDROP(driver);
		objetPageAcceuil.retourEmail().sendKeys("el.ichraf@gmail.com");
		log.info("userId saisi");
		objetPageAcceuil.retourPwd().sendKeys("filsdepute2"); 
		log.info("PWD saisi");
		objetPageAcceuil.retourlinkForgetPwd().click();
		log.info("click sur linkForge");
		ObjectTestForgetPwd objetPageForgetPassword= new ObjectTestForgetPwd(driver);
		String titrePageForgetPassword=driver.getTitle();
		Assert.assertEquals(titrePageForgetPassword, "gkdksgkfj");
		/*if( titrePageForgetPassword.contains("Mot de passe oublié | Connexion impossible | Facebook"))
		{
			log.info("PageForgetPassword ");
		}
		
		else
		{
			
			log.error("j'ai pas pu acceder a la page ");
		}
		*/
		

		objetPageForgetPassword.retourTelephone().sendKeys("20390008");
		
		   
		   
	}	
	}	
	

