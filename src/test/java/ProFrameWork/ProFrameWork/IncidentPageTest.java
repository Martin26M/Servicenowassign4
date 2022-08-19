package ProFrameWork.ProFrameWork;

import org.testng.annotations.Test;

import ObjectRepos.ObjectRepo;
import Utils.TestUtil;
import junit.framework.Assert;

public class IncidentPageTest extends BaseTest {
	protected IncidentPage ip;
	protected ServiceNowLoginPage lp;
	protected ObjectRepo objrep;

	@Test

	public void incidentCheck() throws Exception {

		ip = new IncidentPage(driver);
		lp = new ServiceNowLoginPage(driver);
		objrep = new ObjectRepo();
		driver.switchTo().frame("gsft_main");

		lp.login();
	

		Assert.assertTrue(ip.filternavbox());
		
		ip.sendincidentText();
		driver.switchTo().defaultContent();
		ip.clickCreateNow();

//		ip.checkSearchField();
//		ip.sendtextinsearch();
//		TestUtil.switchToChildWindow();

	}

}
