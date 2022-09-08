package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genric.BaseClass;

public class TaskListpage extends BaseClass {
@FindBy(id="container_tasks")
private WebElement ctsbtn;
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewbtn;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newcust;
@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
private WebElement custname;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement entdescript;
@FindBy(xpath="//div[text()='- Select Customer -'and@class='emptySelection']")
private WebElement selbtn;
@FindBy(xpath="//div[text()='Our company'and@class='itemRow cpItemRow ']")
private WebElement ourbtn;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement crtnewcus;
public TaskListpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getbtn() {
	return ctsbtn;
}
public WebElement getAddbtn() {
	return addnewbtn;
}
public WebElement getNewcust() {
	return newcust;
}

public WebElement getCustname() {
	return custname;
}
public WebElement getEntdescript() {
	return entdescript;
}
public WebElement getSelbtn() {
	return selbtn;
}
public WebElement getOurbtn() {
	return ourbtn;
}
public WebElement getCrtnewcus() {
	return crtnewcus;
}


}
