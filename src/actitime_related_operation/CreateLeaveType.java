package actitime_related_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class CreateLeaveType 
{
	public static void main(String[] args)
	{

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("login get heppen sucessfullly");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Leave Types']")).click();
		driver.findElement(By.xpath("//span[.='Create Leave Type']")).click(); 
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("foreign tours");
		driver.findElement(By.xpath("(//div[@class='arrowDiv'])[6]")).click();
		driver.findElement(By.xpath("(//img[@src='/img/default/leave_types/icons/leave_type_11_24bit.png?hash=1969773458'])[2]")).click();
		driver.findElement(By.id("leaveTypeLightBox_rateCoefficient")).sendKeys("24");
		driver.findElement(By.id("processLeaveTimeCheckbox_createPopup")).click();
		driver.findElement(By.id("asSickDaysRadioButton_createPopup")).click();
		driver.findElement(By.id("leaveTypeLightBox_cancelBtn")).click();
		Alert alr=driver.switchTo().alert();
		alr.dismiss();
		driver.findElement(By.xpath("(//span[contains(text(),'Create Leave Type')])[2]")).click();
		System.out.println("leave type created sucessfully");
	}

}
