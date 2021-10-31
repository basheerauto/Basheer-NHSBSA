/**
 * In this class contains webBrowser related methods in framework level
 *  1)Driver()---Intiate chromedriver.
 *  2)isElementPresentOnScreen(By locator)--verify if elements present in the page. *
 * Author:Basheer Ahamed
 *  Date:11/01/2021
 */

package framework;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class webBrowser {


    public static WebDriver driver=null ;

    public static WebDriver createWebDriver(String webdriver) {

        switch(webdriver) {
            case "firefox":
                File driverPath = new File("./Drivers/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", driverPath.getAbsolutePath());
                driver= new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
                return driver;

            default:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
                return driver;
        }
    }


    //Verify isElementPresentOnScreen
    public boolean isElementPresentOnScreen(By locator) throws IOException, InterruptedException {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Something went wrong while finding webelement");
            Thread.sleep(2000);
            utility.CaptureScreenshot("Failed_finding_webelement" + "_");
            driver.quit();
            return false;
        }
    }



}



