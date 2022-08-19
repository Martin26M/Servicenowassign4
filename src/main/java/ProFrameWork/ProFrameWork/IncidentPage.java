package ProFrameWork.ProFrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncidentPage extends BasePage {

	public IncidentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean filternavbox() {

		
		return filternav.isDisplayed();

	}

	public void sendincidentText() {
		filternav.click();
		JavascriptExecutor js =		(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('filter').value='Incident'");
	
		filternav.sendKeys(Keys.BACK_SPACE);
	}

	public void clickCreateNow() throws Exception {
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOf(CreateNow));

		if (CreateNow.isDisplayed()) {
			
			

			CreateNow.click();
			JavascriptExecutor js1 =(JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('concourse_module_14641d70c611228501114133b3cc88a1').click();");
			

		}

		else {

			throw new Exception("Not able to see CreateNow");
		}
	}

	public String giveincidentNumber() throws Exception {

		if (incidentnumber.getText().startsWith("INC", 2)) {

			return incidentnumber.getText();

		}

		else {

			throw new Exception("Not able to find INC  text");

		}
	}

	public boolean checkSearchField() {

		return searchField.isDisplayed();

	}

	public void sendtextinsearch() {

		searchField.sendKeys("Abel Tuter");

	}

	public void WebTable() {

		List<WebElement> weblist = driver.findElements(By.xpath("//tbody[@class='list2_body']/tr/td[2]"));
		for (WebElement list : weblist) {

			if (list.getText().equalsIgnoreCase("Abel Tuter")) {

				list.click();
			}

		}
	}

	public void descriptionText() {

		driver.findElement(By.xpath("//input[@name='incident.short_description']")).sendKeys("Some Random Text");

	}

	public void clickSubmit() {

		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
	}

}
