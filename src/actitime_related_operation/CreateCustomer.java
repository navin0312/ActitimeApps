package actitime_related_operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomer
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Mister. Navin");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("hi mister navin");
		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();
		driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[1]")).click();
		/*WebElement ele=driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]"));
		Select sel=new Select(ele);
		ele.click();
		sel.selectByIndex(1);*/
		
	 /*  WebElement ele= driver.findElement(By.xpath("(//div[contains(text(),'Big Bang Company')])[5]"));
	    WebDriverWait  wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();*/
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		System.out.println("new customer with name of mister navin got created sucessfully");
		
		

	}

}
