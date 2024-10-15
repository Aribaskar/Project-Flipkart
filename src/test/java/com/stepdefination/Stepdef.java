package com.stepdefination;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Stepdef {
	public static WebDriver driver;
	
	@Given("I am on the Flipkart homepage")
	public void i_am_on_the_Flipkart_homepage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 WebElement searchBox = driver.findElement(By.name("q"));
		 searchBox.sendKeys("mobiles under 20000");
		 searchBox.submit();
		 
		 driver.quit();
	}
	
//	@When("I search for {string}")
//	public void i_search_for(String searchQuery) {
//		 WebElement searchBar = driver.findElement(By.xpath("//div[@class='_2SmNnR']//input[1]"));
//	        searchBar.sendKeys(searchQuery);
//		
//	    
//	}
//
//	@When("I filter the price to {string}")
//	public void i_filter_the_price_to(String string) {
//		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        searchButton.click();
//    }
//
//	@Then("I should see mobiles prices under {int}")
//	public void i_should_see_mobiles_prices_under(Integer int1) {
//		boolean isMobileFound = driver.getPageSource().contains("Under ₹20,000");
//        assertTrue("No mobiles found under 20000!", isMobileFound);
        
        
	}
