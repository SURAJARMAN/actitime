package com.acttime.testscript;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.genric.BaseClass;
import com.actitime.genric.Filelib;
import com.actitime.pom.TaskListpage;
@Listeners(com.actitime.genric.ImplementedListner.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testClass() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("Customer module",true);
		Filelib f=new Filelib();
		String name = f.xlFile("CustomerModule",1, 1);
		String desc = f.xlFile("CustomerModule", 1, 2);
		//Assert.fail();
		TaskListpage t= new TaskListpage(driver);
		t.getbtn().click();
		t.getAddbtn().click();
		t.getNewcust().click();
		t.getCustname().sendKeys(name);
		t.getEntdescript().sendKeys(desc);
		t.getSelbtn().click();
		t.getOurbtn().click();
		t.getCrtnewcus().click();
		Thread.sleep(2000);
	}
}
