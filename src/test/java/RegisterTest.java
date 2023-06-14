import static driver.DriverManager.DRIVER;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.HomePage;
import pages.RegisterPage;
import util.ScreenUtils;

public class RegisterTest extends BaseClass{
	@Test
	  public void RegisterSuccess() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating register flow with correct credentials");
		HomePage.signUp().click();
		RegisterPage.usernameSignUp().sendKeys(ScreenUtils.formatUser(User));
		RegisterPage.passwordSignUp().sendKeys(Password);
		RegisterPage.registerBtnModal().click();
		Thread.sleep(2000);		String alert = DRIVER.getDriver().switchTo().alert().getText();		System.out.println("Alert = "+alert);
		Assert.assertEquals(SignUpMessageSuccess, alert);		DRIVER.getDriver().switchTo().alert().dismiss();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Register flow with correct credentials finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Register flow with correct ended with failures " + e);
        System.out.println("Error " + e);
    }
	  }
	
	@Test(priority = 2)
	  public void ExistingUser() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating register flow with existing credentials");
		HomePage.signUp().click();
		RegisterPage.usernameSignUp().clear();
		RegisterPage.usernameSignUp().sendKeys(User);
		RegisterPage.passwordSignUp().clear();
		RegisterPage.passwordSignUp().sendKeys(Password);
		RegisterPage.registerBtnModal().click();
		Thread.sleep(2000);
		String alert = DRIVER.getDriver().switchTo().alert().getText();
		System.out.println("Alert = "+alert);
		Assert.assertEquals(ExistingMessage, alert);
		DRIVER.getDriver().switchTo().alert().dismiss();
		RegisterPage.closeBtnModal().click();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Register flow with correct credentials finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Register flow with existing credentials ended with failures " + e);
        System.out.println("Error " + e);
    }
	  }
	
	@Test(priority = 3)
	  public void FillOutUserAndPassword() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating register flow with empty credentials");
		HomePage.signUp().click();
		RegisterPage.usernameSignUp().clear();
		RegisterPage.usernameSignUp().sendKeys(User);
		RegisterPage.passwordSignUp().clear();
		RegisterPage.registerBtnModal().click();
		Thread.sleep(2000);
		String alert = DRIVER.getDriver().switchTo().alert().getText();
		System.out.println("Alert = "+alert);
		Assert.assertEquals(FillUserAndPasswordMessage, alert);
		DRIVER.getDriver().switchTo().alert().dismiss();
		RegisterPage.closeBtnModal().click();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Register flow with empty credentials finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Register flow with empty credentials ended with failures " + e);
        System.out.println("Error " + e);
    }
	  }
}
