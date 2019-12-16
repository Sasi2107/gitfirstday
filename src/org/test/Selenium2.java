package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
public static void main(String[] args) throws InterruptedException { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sasi\\eclipse-workspace\\Selenium\\lib\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.toolsqa.com/automation-practice-table/");     
    driver.findElement(By.tagname("tr"));
    
	
}
}
