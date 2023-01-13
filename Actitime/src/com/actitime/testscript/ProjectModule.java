package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass {
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException {
		Reporter.log("createProject",true);
		HomePage h=new HomePage(driver);
		h.setTaskBtn();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewProjectOption().click();
		FileLib f=new FileLib();
		String projectName=f.getExcelData("CreateProject", 1, 2);
		String projectDesc=f.getExcelData("CreateProject", 1, 3);
		t.getPrjNameTbx().sendKeys(projectName);
		t.getCustDD().click();
		t.getOurCmpOp().click();
		t.getProjDesc().sendKeys(projectDesc);
		t.getTaskNameTbx().sendKeys("Advertize");
		t.getCreateProjectBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(t.getaProjName(),projectName));
		String aProjname=t.getaProjName().getText();
		Assert.assertEquals(aProjname,projectName);
	}

}
