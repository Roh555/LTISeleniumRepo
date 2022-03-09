 package com.uiElement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingmultiplewindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jobserve.com");
		//clicking on image which open page in new window
		driver.findElement(By.cssSelector("img.bannerimg_0")).click();
		Set<String> winIDs=driver.getWindowHandles();
		Iterator<String> itr=winIDs.iterator();
		String win1=itr.next();
		String win2=itr.next();
		//to switch to new window/tab which opens after clicking on the image
		driver.switchTo().window(win2);
		System.out.println("Title of job search window is  "+driver.getTitle());
		driver.findElement(By.id("JobSearch_Keywords")).sendKeys("QA");
		driver.findElement(By.className("fat")).click();
		Thread.sleep(2000);
		//Switching to main window again
		driver.switchTo().window(win1);
		System.out.println("Title of main window is "+driver.getTitle());
		Thread.sleep(2000);
		driver.quit();//to close window
				
	}

}
