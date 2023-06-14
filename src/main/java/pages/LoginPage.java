package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	// Login Modal
	public static WebElement loginModal() {
		return $(By.id("logInModal"));
	}
	public static WebElement loginTitleModal() {
		return $(By.id("logInModalLabel"));
	}
	public static WebElement closeLoginModal() {
		return $(By.xpath("//div[@id='logInModal']/div/div/div/button/span"));
	}
	public static WebElement usernameLogin() {
		return $(By.id("loginusername"));
	}
	public static WebElement passwordLogin() {
		return $(By.id("loginpassword"));
	}
	public static WebElement errorMessage() {
		return $(By.id("errorl"));
	}
	public static WebElement closeBtnModal() {
		return $(By.xpath("//div[@id='logInModal']/div/div/div[3]/button"));
	}
	public static WebElement loginBtnModal() {
		return $(By.xpath("//div[@id='logInModal']/div/div/div[3]/button[2]"));
	}
}
