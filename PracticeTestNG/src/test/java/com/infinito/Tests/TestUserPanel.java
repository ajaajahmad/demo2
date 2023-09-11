package com.infinito.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUserPanel {
	WebDriver driver;

	@Test
	public void A() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.goinfinito.com/auth/login");
	}

	@Test
	public void B() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("ajaaj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("User@1111");
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
	}

	@Test
	public void D() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='d-flex menu-event']//span[@class='menu-heading'][normalize-space()='SMS']")).click();
	}

	@Test
	public void E() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='collapseBasic1']//span[@class='menu-heading'][normalize-space()='Campaigns']")).click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void C() throws InterruptedException {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[normalize-space()='Blog']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
	}
	@Test
	public void F() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Campaign']")).click();
	}
	@Test
	public void G() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-3 ng-star-inserted']//span[@class='ellipsis-text custom-placement-ltr'][normalize-space()='Select']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//span[normalize-space()='AutoSMS']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@value='Personalised']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[normalize-space()='Import Contacts']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//div[contains(text(),'Lists')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='mat-checkbox-5-input']//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[@class='btn process-file btn-design']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//button[@class='btn btn-design']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("/")).click();
        
		
		
		
	
		Thread.sleep(5000);		
		
	}
}