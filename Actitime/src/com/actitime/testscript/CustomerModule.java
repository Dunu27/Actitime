package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	Reporter.log("createcustomer",true);
	HomePage h=new HomePage(driver);
	h.setTaskBtn();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustOption().click();
	FileLib f=new FileLib();
	String eCustName=f.getExcelData("CreateCustomer",1,2);
	String custDesc=f.getExcelData("CreateCustomer", 1, 3);
	t.getCustNameTbx().sendKeys(eCustName);
	t.getCustDescTbx().sendKeys(custDesc);
	t.getSelCustDD().click();
	t.getOurCmpOp().click();
	t.getCrtCustBtn().click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.textToBePresentInElement(t.getACustName(),eCustName));
	//Thread.sleep(5000);
	String aCustName=t.getACustName().getText();
}
@Test
public void testModifyCustomer() {
	Reporter.log("createcustomer",true);
	HomePage h=new HomePage(driver);
	h.setTaskBtn();
	TaskListPage t=new TaskListPage(driver);
	t.getEditBtn().click();
	t.getStatusBtn().click();
	
}
}
