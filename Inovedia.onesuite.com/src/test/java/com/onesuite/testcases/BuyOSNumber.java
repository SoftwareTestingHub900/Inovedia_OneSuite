package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class BuyOSNumber extends TestBase {

	/*
	 * @Test(priority = 1) public void LoginSubs() {
	 * driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Catherine"
	 * ); driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys(
	 * "Usman12345!@#");
	 * driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click(); }
	 */

	@Test(priority = 3)
	public void BuyOSNumber() {
		driver.findElement(By.xpath(OR.getProperty("MyOSnumbermenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("BuyNumbers"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSNumberQuantity"))).clear();
		driver.findElement(By.xpath(OR.getProperty("OSNumberQuantity"))).sendKeys("5");
		driver.findElement(By.xpath(OR.getProperty("OSNumberSearchbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart1"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart2"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart3"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart4"))).click();
		driver.findElement(By.xpath(OR.getProperty("OSAddedtoCart5"))).click();
		driver.findElement(By.xpath(OR.getProperty("Checkoutbtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ValidateOSnumbers"))), "Valaidate OS Numbers");
		log.info("OS Numbers Validated");
		driver.findElement(By.xpath(OR.getProperty("OSbalancebtn"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("accountbalancepopup"))),"Are you sure you want to pay from your account balance?");
		log.info("Are you sure you want to pay from your account balance?");
		driver.findElement(By.xpath(OR.getProperty("Yesbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("okaybtn"))).click();

	}
}