package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import Page.CarriersPage;
import Page.Loginpage;

public class CarriersTest  
{
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
public void login() throws InterruptedException
{
Loginpage login=new Loginpage(driver);
login.email("dilbagsingh@cssoftsolutions.com");
login.password("CSsoft!2021");
login.siginbutton();
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(1000);
}

@Test(priority=3)
public void carriersitmes() throws InterruptedException
{
	CarriersPage carriers=new CarriersPage(driver);
	carriers.carrier();
	Thread.sleep(2000);
}

@Test(priority=4)
public void Accountspage() throws InterruptedException
{
CarriersPage carriers=new CarriersPage(driver);
carriers.accounts();
Thread.sleep(10000);
}
@Test(priority=5)
public void Bulkpage() throws InterruptedException
{
	CarriersPage carriers=new CarriersPage(driver);
	carriers.Addaccount();
	Thread.sleep(10000);
}
//test
@Test(priority=6)
public void searchclient() throws InterruptedException
{
	CarriersPage carriers=new CarriersPage(driver);
	carriers.selectclients();
	Thread.sleep(10000);
}
}
