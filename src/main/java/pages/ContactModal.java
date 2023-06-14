package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactModal {
	public static WebElement contactModalTitle() {
		return $(By.id("exampleModalLabel"));
	}
	public static WebElement emailContact() {
		return $(By.id("recipient-email"));
	}
	public static WebElement nameContact() {
		return $(By.id("recipient-name"));
	}
	public static WebElement messageContact() {
		return $(By.id("recipient-email"));
	}
	public static WebElement closeContactModal() {
		return $(By.id("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]"));
	}
	public static WebElement sendContactMessage() {
		return $(By.id("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));
	}
}
