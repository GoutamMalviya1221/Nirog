package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nirog {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get("https://nirogstreet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(Priority = 0)
	public void register() throws InterruptedException {
		
		// Click on login 
		driver.findElement(By.xpath("//*[@class=\" text-sm min-h-[36px] py-0 px-3 w-[78px] button button-Primary buttonSize-small  \"]")).click();
		
		//Click on Register
		driver.findElement(By.xpath("//*[@class=\"text-primary1-500 font-bold\"]")).click();
		
		///Thread.sleep(1000);
//		WebElement dropdown = driver.findElement(By.xpath("//*[@class=\'select__input-container css-19bb58m\']"));
//		dropdown.click();
//		
//		Select s = new Select(dropdown);
//		s.selectByIndex(3);
		
		
		// Enter your name
		driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Goutam");
		
		//Enter Mobile Number
		driver.findElement(By.xpath("//*[@id=\"mobileNo\"]")).sendKeys("7909431009");
		
		// Enter Pincode
		driver.findElement(By.xpath("//*[@id=\"pinCode\"]")).sendKeys("450551");
	}
	@Test(Priority = 1)
	public void login() {
		
		// Click on Login 
		driver.findElement(By.xpath("//*[@class=\" text-sm min-h-[36px] py-0 px-3 w-[78px] button button-Primary buttonSize-small  \"]")).click();
		
		// Select DropDwon
		 WebElement dropdpwn = driver.findElement(By.xpath("//*[@class=\"select__input-container css-19bb58m\"]"));
		 Select s = new Select(dropdpwn);
		 s.selectByVisibleText("Individual/Patient");
		 
		 // Click on login btn
		 driver.findElement(By.xpath("//*[@class=\" w-200px button button-Primary buttonSize-medium  \"]")).click();
	}
	
	@Test(Priority = 2)
	public void homepage() {
		
//		WebElement drop = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div[2]"));
//		Select dp = new Select(drop);
//		dp.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@class=\"select__input-container css-19bb58m\"]"));
		
		
		
	}
	@Test(Priority = 3)
	public void search() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"doctorSearch\"]")).sendKeys("Liver");

		driver.findElement(By.xpath("(//*[@class=\"w-full block\"])[7]")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"doctorSearch\"]")).sendKeys("Liver");
//		
//		Thread.sleep(2000);
//		
//		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item"));
//		
//		for (WebElement opt : options) {
//			if(opt.getText().equals("Liver Cancer"));
//			
//			System.out.println(opt.getText());
//			
//			opt.click();
//
//		}
	}
	
	@Test(Priority = 4)
	public void navigate() {
		
		driver.findElement(By.xpath("//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-semibold font-Open-Sans text-primary1-500    textDefault bodyText  select-none   \"]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[1]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[2]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[3]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[4]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[5]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[6]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[7]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[8]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[9]")).click();
		driver.findElement(By.xpath("(//*[@class=\"text-center  mt-2 w-[105px] text-12-16 font-Open-Sans    textDefault bodyText  select-none   \"])[10]")).click();
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
	}

}
