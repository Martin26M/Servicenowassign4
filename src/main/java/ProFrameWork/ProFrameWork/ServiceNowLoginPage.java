package ProFrameWork.ProFrameWork;

import org.openqa.selenium.WebDriver;

public class ServiceNowLoginPage extends BasePage {

	public ServiceNowLoginPage(WebDriver driver) {
		super(driver);

	}

	public String verifyTitle() {

		return driver.getTitle();

	}

	public String checkname() {

		return userNAme.getText();
	}

	public String checkpassword() {

		return pname.getText();
	}

	public boolean elementpawddisplayed() {
		
	 boolean b =	fogpwd.isDisplayed();
	
	 return b;
	 
	
	}
	
	public boolean elementlogbttn() {
		
		boolean c = logbutton.isDisplayed();
		return c;
	}
	
	public void login() {
		userNAme.sendKeys("admin");
		pname.sendKeys("1NZy9HxlAMjj");
		logbutton.click();
		
		
	}
}
