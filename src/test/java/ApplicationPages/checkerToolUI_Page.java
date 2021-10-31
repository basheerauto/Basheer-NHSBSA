/**
 * In this class contains NHS Pagewise business methods of checktool
 * Author:Basheer Ahamed
 * Date:11/01/2021
 */

package ApplicationPages;

import framework.utility;
import framework.webBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static framework.utility.waitForElement;
import static org.junit.Assert.assertEquals;

public class checkerToolUI_Page extends webBrowser {

    private static final String Cookies = "nhsuk-cookie-banner__link_accept_analytics";
    private static final String nextBtn ="//input[@id='next-button']";
    private static final String countrySelect="//label[@id='label-wales']";
    private static final  String enterday="//input[@id='dob-day']";
    private static final  String entermonth="//input[@id='dob-month']";
    private static final  String enteryear="//input[@id='dob-year']";
    private static final  String UCentry="//label[normalize-space()='Yes, we receive Universal Credit payments']";



    //Verify webpage Title
    public void verifyPagetitle(String Title) throws IOException, InterruptedException {
        try {
            Thread.sleep(1000);
            String j = driver.getTitle();
            System.out.println("Your page title Is : " + j);
            assertEquals(Title, driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong verify title");
            Thread.sleep(2000);
            utility.CaptureScreenshot("Failed:TitleFailed" + "_");
            driver.quit();
        }
    }

    //Click accept cookies button
    public void acceptCookies() throws InterruptedException, IOException {
        try {
            driver.findElement(By.id(Cookies)).click();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong click cookies button title");
            Thread.sleep(2000);
            utility.CaptureScreenshot("Failed:Cookies button click" + "_");
            driver.quit();
        }
    }


    public void click_next_btn(){
       WebElement element= driver.findElement(By.xpath(nextBtn));
       waitForElement(element);
       element.click();

    }

    public void select_yes_options(){
        WebElement element= driver.findElement(By.id("label-yes"));
        waitForElement(element);
        element.click();

    }

    public void selectoptionsfromtext(String locators){
        WebElement element= driver.findElement(By.xpath(locators));
        waitForElement(element);
        element.click();

    }

    public void select_Country(){
        WebElement element= driver.findElement(By.xpath(countrySelect));
        waitForElement(element);
        element.click();

    }

    public void enterDateOfBirth(int Age){
        WebElement element= driver.findElement(By.xpath(enterday));
        waitForElement(element);
        element.sendKeys("10");
        WebElement element1= driver.findElement(By.xpath(entermonth));
        waitForElement(element);
        element1.sendKeys("10");
        WebElement element3= driver.findElement(By.xpath(enteryear));
        waitForElement(element);
        int currentyear=utility.getYearFromDate();
        int enteryear=currentyear-Age;
        String entyear=Integer.toString(enteryear);
        element3.sendKeys(entyear);
    }

    public void submitAgebasedCircumstancesform(int Age)
    {
        if (Age <= 15) {
            click_next_btn();
        }

        if(Age == 17 || Age == 18)
        {
            click_next_btn();
            select_yes_options();
            click_next_btn();
        }

        if(Age >= 19)
        {
            click_next_btn();
            select_yes_options();
            click_next_btn();
            select_yes_options();
            click_next_btn();
            selectoptionsfromtext(UCentry);
            click_next_btn();
            select_yes_options();
            click_next_btn();
            select_yes_options();
            click_next_btn();
        }
    }





}
