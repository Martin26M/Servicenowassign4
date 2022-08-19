package ProFrameWork.ProFrameWork;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.TestUtil;





public class ServiceNowLoginTes extends BaseTest {
	ServiceNowLoginPage lp;

	@Test

	public void loginCheck(){
		
		
		lp =new ServiceNowLoginPage(driver);
		Assert.assertEquals("ServiceNow", lp.verifyTitle());
		Assert.assertEquals("User name", lp.checkname());
		Assert.assertEquals("Password", lp.checkpassword());
		Assert.assertTrue(lp.elementpawddisplayed());
		Assert.assertTrue(lp.elementlogbttn());


	
	}

}
