package org.cucumberfst;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class PayBillSteps {
	static WebDriver driver;
	@Given("the user is in pay bill page")
	public void the_user_is_in_pay_bill_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\org.cucumberfst\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Pay Billing'][1]")).click();
	}

	@When("the user fills the valid customer id")
	public void the_user_fills_the_valid_customer_id(String CustId) {
		driver.findElement(By.id("customer_id")).sendKeys(CustId);
	}

	@When("the user clicks the submit buttion in bill pay page")
	public void the_user_clicks_the_submit_buttion_in_bill_pay_page() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("the user should view his bill")
	public void the_user_should_view_his_bill() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
