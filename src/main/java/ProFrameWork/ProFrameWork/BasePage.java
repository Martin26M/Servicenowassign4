package ProFrameWork.ProFrameWork;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ObjectRepos.ObjectRepo;

public class BasePage extends ObjectRepo {
	
	public static 	Properties prop;
	public static 	FileInputStream fis;
 

protected WebDriver driver;

	public BasePage(WebDriver driver)   {
		
		
		this.driver = driver;

	   PageFactory.initElements(driver, this);
	   
		}
	
	


	}

