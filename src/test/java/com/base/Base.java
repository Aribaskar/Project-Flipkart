package com.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public static void BrowserLaunch() {
		String browser = ("Browser");
		
		if(driver==null) {
			if(browser.equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
		}
	}
	public static void Loadurl(String url) {
		driver.get("https://www.flipkart.com/");
	}
	public static void enterText(WebElement key, String name) {
		key.sendKeys(name);
	}
	
	//ReadPropertiesfile
	public static String readPropertiesFile(String input) throws FileNotFoundException {
		
		FileReader reader = new FileReader("C:\\Users\\ariba\\eclipse-workspace\\Flipkart\\target\\config.properties");
	
	Properties proper=new Properties();
	
	try {
		proper.load(reader);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return proper.getProperty(input);

}
	
	

}
