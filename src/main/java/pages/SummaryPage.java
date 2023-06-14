package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SummaryPage {
	public static WebElement cartTitle() {
		return $(By.id("orderModalLabel"));
	}
	public static WebElement totalAmount() {
		return $(By.id("totalm"));
	}
	public static WebElement nameSummary() {
		return $(By.id("name"));
	}
	public static WebElement countrySummary() {
		return $(By.id("country"));
	}
	public static WebElement citySummary() {
		return $(By.id("city"));
	}
	public static WebElement cardSummary() {
		return $(By.id("card"));
	}
	public static WebElement monthSummary() {
		return $(By.id("month"));
	}
	public static WebElement yearSummary() {
		return $(By.id("year"));
	}
	public static WebElement closeSummary() {
		return $(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]"));
	}
	public static WebElement purchaseSummary() {
		return $(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
	}
	
}
