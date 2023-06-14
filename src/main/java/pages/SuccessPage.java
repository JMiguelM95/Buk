package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SuccessPage {
	public static WebElement successLabel() {
		return $(By.xpath("//div[10]/h2"));
	}
	public static WebElement descriptionMessage() {
		return $(By.xpath("//div[10]/p"));
	}
	public static WebElement okBtn() {
		return $(By.xpath("//div[10]/div[7]/div/button"));
	}
}
