

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.LoginPage;
import util.ScreenUtils;
import static driver.DriverManager.DRIVER;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseClass{
	
	@Test
	  public void LoginSuccess() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating login flow with correct credentials");
		HomePage.loginBtn().click();
		LoginPage.usernameLogin().sendKeys(User);
		LoginPage.passwordLogin().sendKeys(Password);
		LoginPage.loginBtnModal().click();
		ScreenUtils.waitForVisibility(HomePage.nameUserLabel());
		HomePage.logOutBtn().click();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Flow with correct credentials finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Flow with correct credentials ended with failures " + e);
        System.out.println("Error " + e);
    }
	  }
	@Test(priority = 2)
	  public void LoginFailure() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating login flow with incorrect credentials");
		HomePage.loginBtn().click();
		LoginPage.usernameLogin().sendKeys(User);
		LoginPage.passwordLogin().sendKeys(Password+"sakdsadsadsasadsasdas");
		LoginPage.loginBtnModal().click();
		Thread.sleep(2000);
		String alert = DRIVER.getDriver().switchTo().alert().getText();
		System.out.println("Alert = "+alert);
		DRIVER.getDriver().switchTo().alert().dismiss();
		LoginPage.closeBtnModal().click();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Flow with incorrect credentials finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Flow with incorrect credentials ended with failures " + e);
        System.out.println("Error " + e);
	  }
	}
}
