package com.uiElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffcreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Rohit Adate");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Rohitishere");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("Rohit555");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("Rohit555");
		driver.findElement(By.id("mobno")).sendKeys("7776919607");
		
		WebElement testDropDown = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"));
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByIndex(26);
		 
		WebElement testDropDown2 = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]"));
		Select dropdown2 = new Select(testDropDown2);  
		dropdown2.selectByVisibleText("OCT"); 


	/*	WebElement testDropDown3 = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]"));
		Select dropdown3 = new Select(testDropDown3);  
		dropdown3.selectByVisibleText("1999"); */
		
		Select dropdown3 = new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]")));
		dropdown3.selectByValue("1999");
		
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[1]")).click();
		
		WebElement city = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[28]/td/div/table/tbody/tr[1]/td[3]/select"));
		Select ct = new Select(city);  
		ct.selectByVisibleText("Pune"); 
		
		driver.findElement(By.id("Register")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();						
	}
}

