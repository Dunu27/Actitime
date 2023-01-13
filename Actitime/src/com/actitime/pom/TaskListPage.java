package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOption;
	@FindBy(xpath="//div[@class='customerNameDiv']/input")
	private WebElement custNameTbx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescTbx;
	@FindBy(xpath="//div[@class='comboboxButton']")
	private WebElement selCustDD;
	@FindBy(xpath="//div[@class='searchItemList']/div[text()='Our company']")
	private WebElement ourCmpOp;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crtCustBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement aCustName;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='editButton']")
	private WebElement editBtn;
	@FindBy(xpath="//div[@class='customerStatusButton editable active']/div[@class='active']")
	private WebElement statusBtn;
	
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectOption;
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement prjNameTbx;
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement custDD;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projDesc;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskNameTbx;
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='title']")
	private WebElement aProjName;
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskOption;
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustOption() {
		return newCustOption;
	}
	public WebElement getCustNameTbx() {
		return custNameTbx;
	}
	public WebElement getCustDescTbx() {
		return custDescTbx;
	}
	public WebElement getSelCustDD() {
		return selCustDD;
	}
	public WebElement getOurCmpOp() {
		return ourCmpOp;
	}
	public WebElement getCrtCustBtn() {
		return crtCustBtn;
	}
	public WebElement getACustName() {
		return aCustName;
	}
	public WebElement getaCustName() {
		return aCustName;
	}
	public WebElement getEditBtn() {
		return editBtn;
	}
	public WebElement getStatusBtn() {
		return statusBtn;
	}
	
	public WebElement getNewProjectOption() {
		return newProjectOption;
	}
	public WebElement getPrjNameTbx() {
		return prjNameTbx;
	}
	public WebElement getCustDD() {
		return custDD;
	}
	
	public WebElement getProjDesc() {
		return projDesc;
	}
	public WebElement getTaskNameTbx() {
		return taskNameTbx;
	}
	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}
	public WebElement getaProjName() {
		return aProjName;
	}
	

	
}
