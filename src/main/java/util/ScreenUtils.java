package util;

import static driver.DriverManager.DRIVER;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public interface ScreenUtils {

	// Method to reuse in all tests


	public static final long WAIT = 60;

	static void waitForVisibility(WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(DRIVER.getDriver(), ScreenUtils.WAIT);
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	static void waitForInvisibility(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(DRIVER.getDriver(), ScreenUtils.WAIT);
		wait.until(ExpectedConditions.invisibilityOf(webElement));

	}
	
	static String formatUser(String user) {
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss	");
		 Date date = new Date();
		 String date1= dateFormat.format(date);
		 return user+date1;

	}
	public static String getFormatedDate(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File(System.getProperty("user.dir")+"/report/"+getFormatedDate(new Date(), "ddMMyyyyHHmmss")+".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
        } 

}
