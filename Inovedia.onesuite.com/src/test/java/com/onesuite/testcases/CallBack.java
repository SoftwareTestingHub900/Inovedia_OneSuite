package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class CallBack extends TestBase {

	/*
	 * @Test(priority=1) public void Login() {
	 * driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Catherine"
	 * ); driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys(
	 * "Usman12345!@#");
	 * driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click();
	 * 
	 * }
	 */

	@Test(priority=10)
	public void Callback() {
		driver.findElement(By.xpath(OR.getProperty("CallbackMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("Callmebackat"))).sendKeys("12345678907");
		driver.findElement(By.xpath(OR.getProperty("NumbertoCall"))).sendKeys("12345678908");
		driver.findElement(By.xpath(OR.getProperty("CallNowbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("CallNowokbtn"))).click();

	}

}
