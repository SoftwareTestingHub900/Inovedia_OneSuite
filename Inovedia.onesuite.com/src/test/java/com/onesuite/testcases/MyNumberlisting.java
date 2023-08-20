package com.onesuite.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.onesuite.base.TestBase;

public class MyNumberlisting extends TestBase {

	/*
	 * @Test(priority = 1) public void MyNumbers() {
	 * driver.findElement(By.xpath(OR.getProperty("Username"))).sendKeys("Catherine"
	 * ); driver.findElement(By.xpath(OR.getProperty("LoginPassword"))).sendKeys(
	 * "Usman12345!@#");
	 * driver.findElement(By.xpath(OR.getProperty("Loginbtn"))).click(); }
	 */
	@Test(priority = 4)
	public void SetCallerId() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("MyOSnumbermenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("MyNumbersMenu"))).click();
		driver.findElement(By.xpath(OR.getProperty("SetCallIDbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("ConfirmCallerid"))).click();
		driver.findElement(By.xpath(OR.getProperty("SuccessSetCallerIDbtn"))).click();

	}

	@Test(priority = 5)
	public void SetCallforwarding() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("SetCallForwardingbtn"))).click();
		Select Country = new Select(driver.findElement(By.xpath(OR.getProperty("SelectCallForwardingCountry"))));
		Country.selectByValue("44_gb");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("CallforwardingNumber"))).sendKeys("445678893322");
		driver.findElement(By.xpath(OR.getProperty("CallforwardinSavebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("SuccessfullyEnabled"))).click();
	}

	@Test(priority = 6)
	public void AutoRenew() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("Autorenewbtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("NameofCardHolder"))).sendKeys("Marg");
		driver.findElement(By.xpath(OR.getProperty("CardCardNumber"))).sendKeys("4111111111111111");
		driver.findElement(By.xpath(OR.getProperty("CardExpiry"))).sendKeys("0922");
		driver.findElement(By.xpath(OR.getProperty("AutorenewbtnSecurityCode"))).sendKeys("900");
		// driver.findElement(By.xpath(OR.getProperty("FutureSavebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("Paybtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("SucessfullyAutoRenewed"))).click();

	}

	@Test(priority = 7)
	public void AddCLI() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNewNumber"))).click();
		Select Country = new Select(driver.findElement(By.xpath(OR.getProperty("SeccondaryNumberCountry"))));
		Country.selectByValue("92_pk");
		driver.findElement(By.xpath(OR.getProperty("SecondatoryNumber"))).sendKeys("03364213271");
		Select NumberType = new Select(driver.findElement(By.xpath(OR.getProperty("NumberType"))));
		NumberType.selectByValue("1");
		Select UsageType = new Select(driver.findElement(By.xpath(OR.getProperty("UsageType"))));
		UsageType.selectByValue("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("NumberExpiry"))).click();
		for (int i = 0; i <= 5; i++) {
			driver.findElement(By.xpath(OR.getProperty("CalNextbtn"))).click();

		}
		driver.findElement(By.xpath(OR.getProperty("Date"))).click();

	}

	@Test(priority = 8)
	public void AddName() throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("AddNametab"))).click();
		driver.findElement(By.xpath(OR.getProperty("AddNamebtn"))).click();
		driver.findElement(By.xpath(OR.getProperty("EnterName"))).sendKeys("Kalith");
		driver.findElement(By.xpath(OR.getProperty("Addbtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(OR.getProperty("NameAddedbtn"))).click();

	}
}