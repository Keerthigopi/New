package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class project1 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("keerthi");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
	}


}
