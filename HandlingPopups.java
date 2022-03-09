 package com.uiElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alt=driver.switchTo().alert();
		String errorMsg=alt.getText();
		System.out.println("Error message displayed in popup is  "+errorMsg);
		Thread.sleep(3000);
		alt.accept();
		driver.switchTo().defaultContent();
	}
}
 