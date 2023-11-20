package AmberStudent_Test.pages;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class BonusTask2 extends Task {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	 
	
	 

	 
	 @FindBy(xpath="(//i[@class='icon-shortlist amber-1jq04mc '])[2]")
	 WebElement shortlistbutton;
	 
	 @FindBy(xpath="//span[contains(text(),'Shortlist')]")
	 WebElement shortlisttheproperty;
	 
	 @FindBy(xpath = "//h2[text()='iQ Magenta House, London']")
	 WebElement shortlistedpropertytext;
	 
	 @FindBy(xpath = "//span[text()='View']")
	 WebElement viewbutton;
	 
//	 @FindBy(xpath="(//span[text()='Book'])[1]")
//	 WebElement bookbutton;
	 
	 @FindBy(xpath="(//a[text()='Contact us'])[1]")
	 WebElement contactus;
	 
	 @FindBy(xpath = "//input[@placeholder='Enter your mobile number']")
	 WebElement mobilenumber;
	 
	 @FindBy(xpath="//span[text()='Enquire']")
	 WebElement Enquirebuttton;
	 
	 @FindBy(xpath="//span[text()='Continue Booking']")
	 WebElement continueBooking;
	 
	 @FindBy(xpath="//*[@id='mantine-u4g3bfinl']")
	 WebElement sendnoofweeks;
	 
	 @FindBy(xpath="//*[text()='24']")
	 WebElement selectdate;
	 
	 @FindBy(xpath="//img[@class='inventory-image']")
	 WebElement backtoproperty;
	 
	 @FindBy(xpath="(//i[@class='icon-menu'])[2]")
	 WebElement menubutton;
	 @FindBy(xpath="//*[text()='Logout']")
	 WebElement logoutbutton;
	 
	 @FindBy(xpath ="//span[text()='Login']")
	 WebElement loginElement;
	 
	 @FindBy(xpath="//*[@placeholder='Enter your email address']")
	 WebElement email;
	 
	 @FindBy(xpath="//*[text()='Continue']")
	 WebElement continuebutton;
	 
	 @FindBy(xpath="//span[text()='Continue']")
	 WebElement secondcontinuebutton;
	 
	 
	 
	 public BonusTask2(WebDriver driver)
	 {
		 super(driver);
		 this.driver =driver;
		 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	
	public void loginpage()
	{
		loginElement.click();
		email.sendKeys("sunnyhith.avadootha4@gmail.com");
		continuebutton.click();
		try {
			Thread.sleep(14000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		secondcontinuebutton.click();
		
		
	}
	
		public void clickonshortlist() {
			
			shortlistbutton.click();
		}
	
		public void verifytheproperty() {
			shortlisttheproperty.click();
			if(shortlistedpropertytext.isDisplayed()) {
				System.out.println(shortlistedpropertytext+" :Property is shortlised");
			}
			else System.out.println(" Property is not shortlisted");
						
		}
		
		public void booktheproperty()
		{
			viewbutton.click();
			
			
			 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		      jsExecutor.executeScript("arguments[0].scrollIntoView(true);", contactus);
		      contactus.click();
		      mobilenumber.clear();
		      mobilenumber.sendKeys("88889883223");
		      
		      Enquirebuttton.click();
		      	
		      continueBooking.click();
		      	
		     sendnoofweeks.sendKeys("1");
		     selectdate.click();
		     backtoproperty.click();
		     
		     menubutton.click();
		     logoutbutton.click();
		     
		     
		     
		      
		      
		      
		      
		}
}
