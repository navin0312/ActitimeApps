package actitime_related_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeaveType
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
		driver.findElement(By.xpath("(//div[@class='leaveTypeNameText'])[6]")).click();
		driver.findElement(By.id("inputDiv")).clear();
		driver.findElement(By.id("inputDiv")).sendKeys("honymoon");
		driver.findElement(By.xpath("(//div[@class='applyButton'])[2]")).click();
		System.out.println("edition get done sucessfully");
	}

}
