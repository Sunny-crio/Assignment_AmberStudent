package AmberStudent_Test.Tests;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import AmberStudent_Test.pages.Task;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class task_test {
	
	static Task taskclass;
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
    	
    	taskclass= new Task(driver);
    	taskclass.entered_Urlpage();
    	taskclass.performSearch();
    	taskclass.filtersearchresults();
    	taskclass.clickShowResults();
    	taskclass.clicksecondsearchresult();
    	taskclass.switchtosecondresultinfotab();
    	taskclass.assertTitleAndLocation("Book IQ Magenta House Student Accommodation London | Amber","London");
    	driver.close();

}}
