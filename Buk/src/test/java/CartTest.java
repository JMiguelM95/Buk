import static driver.DriverManager.DRIVER;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SuccessPage;
import pages.SummaryPage;
import util.ScreenUtils;

public class CartTest extends BaseClass {
	@Test
	  public void FillCartAndDeleteProductTest() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating cart flow and deleting product");
		HomePage.loginBtn().click();
		ScreenUtils.waitForVisibility(LoginPage.usernameLogin());
		LoginPage.usernameLogin().sendKeys(User);
		LoginPage.passwordLogin().sendKeys(Password);
		LoginPage.loginBtnModal().click();
		ScreenUtils.waitForVisibility(HomePage.nameUserLabel());
		Thread.sleep(2000);
		HomePage.otherProduct(2).click();
		ScreenUtils.waitForVisibility(ProductPage.informationProductTable());
		ProductPage.addToCartBtn().click();
		Thread.sleep(2000);
		String alert = DRIVER.getDriver().switchTo().alert().getText();
		System.out.println("Alert = "+alert);
		Assert.assertEquals(ProductAdded, alert);
		DRIVER.getDriver().switchTo().alert().accept();
		HomePage.cartBtn().click();
		ScreenUtils.waitForVisibility(CartPage.totalAmountLabel());
		CartPage.placeOrderBtn().click();
		Thread.sleep(2000);
		SummaryPage.closeSummary().click();
		Thread.sleep(2000);
		CartPage.deleteProduct().click();
		HomePage.homeBtn().click();
		HomePage.logOutBtn().click();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Cart flow and deleting product finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Cart flow and deleting product ended with failures " + e);
        System.out.println("Error " + e);
	  }
	  }
	
	@Test(priority = 2)
	  public void FillCartWithProductOfOtherCategory() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating cart flow with category change");
		HomePage.loginBtn().click();
		ScreenUtils.waitForVisibility(LoginPage.usernameLogin());
		LoginPage.usernameLogin().sendKeys(User);
		LoginPage.passwordLogin().sendKeys(Password);
		LoginPage.loginBtnModal().click();
		ScreenUtils.waitForVisibility(HomePage.nameUserLabel());
		Thread.sleep(2000);
		HomePage.monitorCat().click();
		Thread.sleep(2000);
		HomePage.otherProduct(1).click();
		ScreenUtils.waitForVisibility(ProductPage.informationProductTable());
		ProductPage.addToCartBtn().click();
		Thread.sleep(2000);
		String alert = DRIVER.getDriver().switchTo().alert().getText();
		System.out.println("Alert = "+alert);
		Assert.assertEquals(ProductAdded, alert);
		DRIVER.getDriver().switchTo().alert().accept();
		HomePage.cartBtn().click();
		ScreenUtils.waitForVisibility(CartPage.totalAmountLabel());
		CartPage.placeOrderBtn().click();
		Thread.sleep(2000);
		SummaryPage.closeSummary().click();
		Thread.sleep(2000);
		CartPage.deleteProduct().click();
		HomePage.homeBtn().click();
		HomePage.logOutBtn().click();
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Cart flow with category change finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Cart flow with category change ended with failures " + e);
        System.out.println("Error " + e);
	  }
	  }
	
	@Test(priority = 3)
	  public void FillCartAndBuy() throws InterruptedException, IOException {
		try {
		test.log(LogStatus.INFO,"Validating cart flow with purchase");
		HomePage.loginBtn().click();
		ScreenUtils.waitForVisibility(LoginPage.usernameLogin());
		LoginPage.usernameLogin().sendKeys(User);
		LoginPage.passwordLogin().sendKeys(Password);
		LoginPage.loginBtnModal().click();
		ScreenUtils.waitForVisibility(HomePage.nameUserLabel());
		Thread.sleep(2000);
		HomePage.otherProduct(2).click();
		ScreenUtils.waitForVisibility(ProductPage.informationProductTable());
		ProductPage.addToCartBtn().click();
		Thread.sleep(2000);
		String alert = DRIVER.getDriver().switchTo().alert().getText();
		System.out.println("Alert = "+alert);
		Assert.assertEquals(ProductAdded, alert);
		DRIVER.getDriver().switchTo().alert().accept();
		HomePage.cartBtn().click();
		ScreenUtils.waitForVisibility(CartPage.totalAmountLabel());
		CartPage.placeOrderBtn().click();
		Thread.sleep(2000);
		SummaryPage.nameSummary().sendKeys(Name);
		SummaryPage.countrySummary().sendKeys(Country);
		SummaryPage.citySummary().sendKeys(City);
		SummaryPage.cardSummary().sendKeys(CreditCard);
		SummaryPage.monthSummary().sendKeys(Month);
		SummaryPage.yearSummary().sendKeys(Year);
		SummaryPage.purchaseSummary().click();
		ScreenUtils.waitForVisibility(SuccessPage.successLabel());
		test.log(LogStatus.PASS, 
                test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Cart flow with purchase finished successfully");
    } catch (Exception e) {
        assertTrue(false);
        test.log(LogStatus.FAIL, test.addScreenCapture(ScreenUtils.capture(DRIVER.getDriver()))
                + "Cart flow with purchase ended with failures " + e);
        System.out.println("Error " + e);
	  }
	  }
}
