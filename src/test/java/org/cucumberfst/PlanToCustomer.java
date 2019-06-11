package org.cucumberfst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;

public class PlanToCustomer {
	static WebDriver driver;
	@Given("the user is in add traiff plan to customer page")
	public void the_user_is_in_add_traiff_plan_to_customer_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiny\\eclipse-workspace\\org.cucumberfst\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan to Customer'][1]")).click();
	}

	@When("the user enters the customer id and selects the approverd traiff plan")
	public void the_user_enters_the_customer_id_and_selects_the_approverd_traiff_plan(String id) throws AWTException, InterruptedException {
		
		driver.findElement(By.id("customer_id")).sendKeys(id);
		driver.findElement(By.name("submit")).click();
		Robot r=new Robot();
		for(int i=1;i<=20;i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		}
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);	
	}

	@When("the user clicks add traiff plan to customer button")
	public void the_user_clicks_add_traiff_plan_to_customer_button() {
		
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

	@Then("the user should be assigned with the traiff plan")
	public void the_user_should_be_assigned_with_the_traiff_plan() {
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	}


}
