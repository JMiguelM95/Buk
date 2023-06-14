

import static driver.DriverManager.DRIVER;
import static configuration.Config.CONFIG;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.codeborne.selenide.WebDriverRunner;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class BaseClass {
	
	// Variables to use in any test
	
	static WebDriverWait wait;
	public static String BaseUrl = "";
	public static String User = "";
	public static String Password = "";
	public static String SignUpMessageSuccess = "";
	public static String ExistingMessage = "";
	public static String FillUserAndPasswordMessage = "";
	public static String ProductAdded = "";
	public static String Name = "";
	public static String Country = "";
	public static String City = "";
	public static String Month = "";
	public static String CreditCard = "";
	public static String Year = "";

	public ExtentTest test;
    public ExtentReports reports;
    
    // Selecting and setting enviroment, driver, reports and etc
	 @BeforeClass(alwaysRun = true)
	 @Parameters(value = {"platform"} )
	    public void beforeTest(ITestContext context, String platform) {
		 	reports = new ExtentReports(System.getProperty("user.dir")+"/report/ExtentReportResults.html", false);
	        test = reports.startTest("QA Automation Reports");
	        
		 	CONFIG.setTestEnvironment();
		 	switch (platform)
	        {
	        case "Chrome":
	        	DRIVER.chromeDriverConnection();
	        	break;
	        case "Firefox":
	        	DRIVER.firefoxDriverConnection();
	        	break;
	        case "Edge":
	        	DRIVER.edgeDriverConnection();
	        	break;
	        default:
	        	DRIVER.chromeDriverConnection();
	        	break;
	        }
	        DRIVER.maximizeBrowser();
	        BaseUrl = System.getProperty("baseUrl");
	        User = System.getProperty("user");
	        Password = System.getProperty("password");
	        SignUpMessageSuccess = System.getProperty("signUpMessageSuccess");
	        ExistingMessage = System.getProperty("existingMessage");
	        FillUserAndPasswordMessage = System.getProperty("fillUserAndPasswordMessage");
	        ProductAdded = System.getProperty("productAdded");
	        Name = System.getProperty("name");
	        Country = System.getProperty("country");
	        City = System.getProperty("city");
	        CreditCard = System.getProperty("creditCard");
	        Month = System.getProperty("month");
	        Year = System.getProperty("year");
	        WebDriverRunner.setWebDriver(DRIVER.getURL(BaseUrl));
	 }

	// Closing all connections or drivers
	 @AfterClass(alwaysRun = true)
	    public void afterTest(final ITestContext testContext) {
		 reports.endTest(test);
         reports.flush();
	     DRIVER.closeDriver();
	    }

}
