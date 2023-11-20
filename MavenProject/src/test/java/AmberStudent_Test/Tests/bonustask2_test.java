package AmberStudent_Test.Tests;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import AmberStudent_Test.pages.BonusTask2;
import AmberStudent_Test.pages.Task;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class bonustask2_test {
	
	static BonusTask2 bonustask2;
//	static Task taskclass;
	static WebDriver driver ;
	static String url = "https://amberstudent.com/";
	
	public  static void main(String[] args) {
        try {
            initializeWebDriver();
            navigateToURL();
            performTestSteps();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
   
    private static void initializeWebDriver() {
        
//    ChromeOptions chromeOptions = new ChromeOptions();
//     
// driver =  new ChromeDriver(chromeOptions);
        
//        WebDriverManager.chromedriver().setup();
//        driver = (WebDriver) new ChromeDriver();
    	 
    	        WebDriverManager.chromedriver().setup();
    	        ChromeOptions options = new ChromeOptions();
    	        options.addArguments("--disable-notifications");
    	        driver =  new ChromeDriver(options);
    	    
    }

    private static  void navigateToURL() {
        driver.get(url);
        driver.manage().window().maximize();
        
        
    }

    private static  void performTestSteps() {
    	bonustask2 = new BonusTask2(driver);
    	bonustask2.loginpage();
    	
    	//taskclass= new Task(driver);
    	bonustask2.entered_Urlpage();
    	
    	bonustask2.performSearch();
    	
    	bonustask2.filtersearchresults();
    	
    	bonustask2.clickShowResults();
    	bonustask2.clicksecondsearchresult();
    	bonustask2.switchtosecondresultinfotab();
    	bonustask2.assertTitleAndLocation("Book IQ Magenta House Student Accommodation London | Amber","London");
        
    	bonustask2.clickonshortlist();
    	bonustask2.verifytheproperty();
    	bonustask2.booktheproperty();
    	
    	driver.close();
    	
    	

}}
