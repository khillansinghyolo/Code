package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {
	
	WebDriver driver ;
	
public	WebDriverDemo()
{
	getDriver();
	LoginPage();
}
	public void getDriver()
	{
		System.setProperty("webdriver.gecko.driver","D:\\JAVA\\SELENIUM\\driver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Chrome Browser launch successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://182.156.251.238/wiz7qc/Default.aspx");
		System.out.println("Wizdow browser is open successfully ");
	}
	public String LoginPage()
	{
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//div[@id='divCaptchImage']/following::a[1]")).click();
		return "HomePage";
	}

}
