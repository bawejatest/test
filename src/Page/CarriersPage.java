package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarriersPage  
{
@FindBy(xpath="//input[@type='email']")
private WebElement useremail;
@FindBy(xpath="//input[@type='password']")
private WebElement Passwords;
@FindBy(xpath="//*[contains(text(),'SIGN IN')]")
private WebElement button;	
@FindBy(xpath="//*[contains(text(),'Carriers')]")
private WebElement carrier;
@FindBy(xpath="//*[contains(text(),'Accounts')]")
private WebElement Account;
@FindBy(xpath="//mat-icon[@mattooltip=\"Add Carrier Account\"]")
private WebElement BulkAccount;
@FindBy(xpath="//span[@class=\"mat-select-placeholder mat-select-min-line ng-tns-c167-21 ng-star-inserted\"]")
private WebElement selectclient;

public CarriersPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void email(String fn)
{
	useremail.clear();
	useremail.sendKeys(fn);
}

public void password(String pass)
{
	Passwords.clear();
	Passwords.sendKeys(pass);
}
public void siginbutton()
{
	button.click();
}
public void carrier()
{
carrier.click();
}
public void accounts()
{
	Account.click();	
}
public void Addaccount()
{
	BulkAccount.click();	
}
public void selectclients()
{
	selectclient.click();
}
}
