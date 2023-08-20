package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class AddressBook extends TestBase{
	/*
	 * @Test public void login() {
	 * driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("");
	 * driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys("");
	 * driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
	 * 
	 * }
	 */
	@Test (priority=13)
	public void SubscriberAddressBook() {
		driver.findElement(By.xpath(OR.getProperty("SubscriberAddressBook"))).click();
		driver.findElement(By.xpath(OR.getProperty(""))).clear();
		driver.findElement(By.xpath(OR.getProperty(""))).click();
		driver.findElement(By.xpath(OR.getProperty(""))).click();
		
	}
	
}
