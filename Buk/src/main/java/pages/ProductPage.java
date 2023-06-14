package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {
	// Product
			public static WebElement informationProductTable() {
				return $(By.id("tbodyid"));
			}
			public static WebElement titleProduct() {
				return $(By.xpath("//*[@id=\"tbodyid\"]/h2"));
			}
			public static WebElement addToCartBtn() {
				return $(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
			}
}
