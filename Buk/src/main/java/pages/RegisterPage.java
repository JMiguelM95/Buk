package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage {
		// Register Modal
		public static WebElement signUpModal() {
			return $(By.id("signInModal"));
		}
		public static WebElement signUpTitleModal() {
			return $(By.id("signInModalLabel"));
		}
		public static WebElement closeSignUpModal() {
			return $(By.xpath("//*[@id='signInModal']/div/div/div[1]/button/span"));
		}
		public static WebElement usernameSignUp() {
			return $(By.id("sign-username"));
		}
		public static WebElement passwordSignUp() {
			return $(By.id("sign-password"));
		}
		public static WebElement errorMessage() {
			return $(By.id("errorl"));
		}
		public static WebElement closeBtnModal() {
			return $(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[1]"));
		}
		public static WebElement registerBtnModal() {
			return $(By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]"));
		}
	
}
