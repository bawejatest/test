package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Page.Loginpage;

public class LoginTest{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","E:\\rajatnarang_qa\\test123\\chromedriver.exe");
	}

	@Test(priority=1)
	public void open_the_LoginPage_Url() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://dev.iic.idrivelogistics.com/login?redirect=%2Fhome");
	Thread.sleep(10000);
	}

	@Test(priority=2)
	public void enter_valid_username_and_invalid_password() throws InterruptedException
	{
   Loginpage login=new Loginpage(driver);
   login.email("dilbagsingh@cssoftsolutions.com");
   login.password("test");
   login.siginbutton();
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void enter_invalid_username_and_valid_password() throws InterruptedException
	{
    Loginpage login=new Loginpage(driver);
    login.email("dilbagsingh@cssoftsol");
    login.password("CSsoft!2021");
    login.siginbutton();
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void enter_invalid_username_and_invalid_password() throws InterruptedException
	{
    Loginpage login=new Loginpage(driver);
    login.email("dilbagsingh");
    login.password("abc");
    login.siginbutton();
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	}
	
	@Test(priority=5)
	public void enter_valid_username() throws InterruptedException
	{
    Loginpage login=new Loginpage(driver);
    login.email("dilbagsingh@cssoftsolutions.com");
    login.siginbutton();
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	}
	
	@Test(priority=6)
	public void enter_valid_password() throws InterruptedException
	{
    Loginpage login=new Loginpage(driver);
    login.email("dilbagsingh@cssoftsolutions.com");
    login.siginbutton();
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	}
	
	@Test(priority=7)
	public void enter_valid_username_and_valid_password() throws InterruptedException
	{
    Loginpage login=new Loginpage(driver);
    login.email("dilbagsingh@cssoftsolutions.com");
    login.password("CSsoft!2021");
    login.siginbutton();
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	}
		
}
