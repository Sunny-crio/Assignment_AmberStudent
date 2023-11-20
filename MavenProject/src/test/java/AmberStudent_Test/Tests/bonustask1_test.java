package AmberStudent_Test.Tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import AmberStudent_Test.pages.BonusTask1;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class bonustask1_test {
	
	static BonusTask1 bonustask;
	static WebDriver driver ;
	static String url = "https://amberstudent.com/";
	
	public  static void main(String[] args) {
        try {
            initializeWebDriver();
            navigateToURL();
            performTestSteps();
            pr();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
   
    private static void initializeWebDriver() {
        
    	        WebDriverManager.chromedriver().setup();
    	        ChromeOptions options = new ChromeOptions();
    	        options.addArguments("--disable-notifications");
    	        driver =  new ChromeDriver(options);
    	    
    }

    private static  void navigateToURL() {
        driver.get(url);
        driver.manage().window().maximize();
//        for(int i=0; i<3; i++){ 
//			driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
//        
//    }
    }
    private static  void performTestSteps() {
    	
    	bonustask= new BonusTask1(driver);
    	bonustask.clickSearchBar();
    	
    }
    private static void pr() {
        List<WebElement> countryTabs = bonustask.getCountryTabs();
        Set<String> allCities = new HashSet<>();

        for (WebElement countryTab : countryTabs) {
            String countryName = countryTab.getText();

            // Skip the "All" section
            if (countryName.equalsIgnoreCase("All")) {
                continue;
            }
            countryTab.click();

            // Get popular cities for the current country
            List<WebElement> cities = bonustask.getPopularCities();

            // Verify no city is repeated or mentioned in more than 1 country tab
            
            for (WebElement city : cities) {
                String cityName = city.getText();
                System.out.println(cityName + " ");
                // Using assertTrue for better error message
                assert !allCities.contains(cityName) : "City -'" + cityName + "' is repeated or mentioned in more than 1 country tab";

                allCities.add(cityName);
            }
        }
    
    }
}