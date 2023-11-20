package AmberStudent_Test.pages;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BonusTask1 {
	private WebDriver driver;
	
	
	@FindBy(xpath = "//i[@class='icon-search-button']")
	WebElement searchicon;
	
// @FindBy(xpath = "//div[@role='tablist']/button")
	@FindBy(xpath = "//div[@role='tablist']/button")
    private List<WebElement> countryTabs;

    @FindBy(xpath = "//div[@class='amber-1z0x9lj']/div")
    private List<WebElement> popularCities;

	    public BonusTask1(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	   
	    public void clickSearchBar() {
	        searchicon.click();
	    }

	    public List<WebElement> getCountryTabs() {
	        return countryTabs;
	    }

	    public List<WebElement> getPopularCities() {
	        return popularCities;
	        
	        
	    }
	    
	    
	}
	
	
	


