package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage {
	public static WebElement cartTitle() {
		return $(By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/h2"));
	}
	public static WebElement placeOrderBtn() {
		return $(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
	}
	public static WebElement cartProductTable() {
		return $(By.id("tbodyid"));
	}
	public static WebElement deleteProduct() {
		return $(By.linkText("Delete"));
	}
	public static WebElement totalAmountLabel() {
		return $(By.id("totalp"));
	}	
}
