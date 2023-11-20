package AmberStudent_Test.pages;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

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


public class Task {
	
	private WebDriver driver;
	
	 
	 @FindBy(id ="main-search")
	 WebElement searchbox;
	 
	 
	 @FindBy(xpath = "(//i[@class='icon-arrow-down'])[6]")
	 WebElement morefiltersicon;
	 //(//div[@data-testid='search-filters']//button)[6]
	 
	 @FindBy(xpath="//input[@value='private_room']")
	 WebElement privateroom;
	
	 @FindBy(xpath="//input[@value='private_bathroom']")
	 WebElement privatebathroom;
	 
	 @FindBy(xpath="//*[contains(text(), 'Show ')]")
	 WebElement showresults;
	
	 @FindBy(xpath="(//div[@class='search-list-inner-container']//div[@class='amber-12sbrde'])[2]")
	 WebElement secondsearchresult;
	 
	 @FindBy(xpath="//nav[@class='breadcrumb']/ul/li[3]/a")
	 WebElement ActualLocation;
	 public Task(WebDriver driver)
	 {
		 this.driver =driver;
			 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	
	
	public boolean entered_Urlpage()
	    {
	    	 boolean userentered_thepage=true;
	         if(driver.getCurrentUrl().equals("")){

	           return userentered_thepage;
	        
	          
	         }
	         else {
	             return !userentered_thepage;
	         }
	    }
	 
	 public void performSearch() {
		 
		// searchbox.click();
		 
	      try {
	    	  
	    	  searchbox.sendKeys("London");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     searchbox.sendKeys(Keys.ENTER);
	 }
	 public void filtersearchresults() {
	        
	       morefiltersicon.click();
	       privateroom.click();
	        privatebathroom.click();
	       
	    }
	 public void clickShowResults() {
		 
		 showresults.click();
	 }
		
	 
	 public void clicksecondsearchresult() {
		 secondsearchresult.click();
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public void switchtosecondresultinfotab() {
		 
		 String Parentwindow = driver.getWindowHandle();
		 System.out.println(Parentwindow);
		 Set<String> handles = driver.getWindowHandles();
		 for (String handle : handles)
		 {
		 if (!handle.equals(Parentwindow))
		 {
			 
		
		driver.switchTo().window(handle);
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		
		 
		 }
		 }
	 }
		 public void assertTitleAndLocation(String expectedTitle, String expectedLocation) {
		     
			
		     
		        String actualTitle = driver.getTitle();
		        System.out.println(actualTitle);
		       
		        String actualLocation = ActualLocation.getText();
		        System.out.println(actualLocation);
		        
		        assertEquals( expectedTitle, actualTitle);
		        
		        
		        try {
		        	
		            assertEquals(expectedLocation, actualLocation);
		            assertEquals( expectedTitle, actualTitle);
		            System.out.println("ExpectedLocation: "+expectedLocation+", ActualLocation:"+actualLocation);
		            System.out.println("Location assertion passed");
		            System.out.println("ExpectedTitle: "+expectedTitle+", ActualTitle:"+actualTitle);
		            System.out.println("Title assertion passed");     
		        } catch (AssertionError e) {
		            System.err.println("Location assertion failed: " + e.getMessage());
		        }
		       
		        

	 }
	

}
