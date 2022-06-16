package org.test.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MOHANRAJ K\\eclipse-workspace\\JavaProjectSelenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[@type='text']"));
		txtUsername.sendKeys("somasundaram@gamil.com");
		String text = txtUsername.getAttribute("value");
		System.out.println(text);
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("123456789!");
		String text2 = txtPassword.getAttribute("value");
		System.out.println(text2);
	}
}
