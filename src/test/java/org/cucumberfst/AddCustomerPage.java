package org.cucumberfst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

public class AddCustomerPage {
	static WebDriver driver;
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\org.cucumberfst\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	}

	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
	   List<String> detailList = customerDetails.asList(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(detailList.get(0));
	   driver.findElement(By.id("lname")).sendKeys(detailList.get(1));
	   driver.findElement(By.id("email")).sendKeys(detailList.get(2));
	   driver.findElement(By.name("addr")).sendKeys(detailList.get(3));
	   driver.findElement(By.name("telephoneno")).sendKeys(detailList.get(4));
		}

	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
