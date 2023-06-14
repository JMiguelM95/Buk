package pages;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

	// Header
	public static WebElement logoImg() {
		return $(By.id("nava"));
	}
	public static WebElement homeBtn() {
		return $(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));
	}
	public static WebElement contactBtn() {
		return $(By.linkText("Contact"));
	}
	public static WebElement aboutBtn() {
		return $(By.linkText("About us"));
	}
	public static WebElement cartBtn() {
		return $(By.id("cartur"));
	}
	public static WebElement loginBtn() {
		return $(By.id("login2"));
	}
	public static WebElement signUp() throws InterruptedException {
		Thread.sleep(3000);
		return $(By.id("signin2"));
	}
	public static WebElement logOutBtn() {
		return $(By.id("logout2"));
	}
	public static WebElement nameUserLabel() {
		return $(By.id("nameofuser"));
	}
	
	// Carousel
	public static WebElement previousBtn() {
		return $(By.linkText("Previous"));
	}
	public static WebElement nextBtn() {
		return $(By.linkText("Next"));
	}
	public static WebElement carouselSlide() {
		return $(By.xpath("//img[contains(text(),'Slide')]"));
	}
	
	// Categories
	public static WebElement categoryTitle() {
		return $(By.id("cat"));
	}
	public static WebElement phoneCat() {
		return $(By.id("itemc"));
	}
	public static WebElement laptopCat() {
		return $(By.linkText("Laptops"));
	}
	public static WebElement monitorCat() {
		return $(By.linkText("Monitors"));
	}
	
	// Grid
	public static WebElement productTable() {
		return $(By.xpath("//div[@id='tbodyid']"));
	}
	public static WebElement firstProduct() {
		return $(By.xpath("//div[@id='tbodyid']/div"));
	}
	public static WebElement otherProduct(Integer number) {
		String formatXpath = "//div[@id='tbodyid']/div["+number+"]";
		if(number <=1)
		{
			formatXpath = "//div[@id='tbodyid']/div";
		}
		return $(By.xpath(formatXpath));
	}
	public static WebElement previousPage() {
		return $(By.id("prev2"));
	}
	public static WebElement nextPage() {
		return $(By.id("next2"));
	}
	
	// Footer
	public static WebElement aboutUsFooter() {
		return $(By.xpath("//div[@id='fotcont']/div/div/div"));
	}
	public static WebElement contactFooter() {
		return $(By.xpath("//div[@id='fotcont']/div[2]/div/div"));
	}
	public static WebElement logoFooter() {
		return $(By.xpath("//div[@id='fotcont']/div[3]/div/div/h4"));
	}
}
