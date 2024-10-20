package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceElements.InterfaceLoginElements;
import com.ReusableMethods.Base_Class;

public class OpenMrsLoginPage extends Base_Class implements InterfaceLoginElements {
	
	@FindBy(id= userName_id)
	private WebElement username;
	
	@FindBy(id= password_id)
    private WebElement password;
	
	@FindBy(id= Location_id)
	private WebElement location;
	
	@FindBy(id= login_id)
	private WebElement login;


 public OpenMrsLoginPage(WebDriver driver){
	
	PageFactory.initElements(driver, this);
}
public void LoginPage() throws Throwable {
	FileReaderManangerMRS data = new FileReaderManangerMRS();
    launchUrl(data.getDataProperty("url"));
    inputValues(username,"loginusername");
    inputValues(password,"loginpassword");
    clickElement(location);
    clickElement(login);
    }
}