/**
 * In this class contains step definations of the feature file
 * Author:Basheer Ahamed
 *  Date:11/01/2021
 */
package stepDefinations;
import ApplicationPages.checkerToolUI_Page;
import ApplicationPages.resultPublish_Page;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webBrowser;
import java.io.IOException;


public class stepDefination extends webBrowser{

    webBrowser webBrowser= new webBrowser();
    checkerToolUI_Page checkerToolUI_Pages = new checkerToolUI_Page();
    resultPublish_Page resultPublishPage = new resultPublish_Page();


    @When("^I open NHS Service URL$")
    public void i_open_NHS_Service_URL() throws Throwable {
        String webdriver = System.getProperty("propertyName");
        System.out.println("====Application Lunch in Browser ==="+webdriver);
        webBrowser.createWebDriver(webdriver);

    }


    @Then("^I validate title and URL$")
    public void i_validate_title_and_URL() throws IOException, InterruptedException {
        checkerToolUI_Pages.verifyPagetitle("Check what help you could get to pay for NHS costs - NHSBSA");
        checkerToolUI_Pages.acceptCookies();
        checkerToolUI_Pages.click_next_btn();

    }

    @When("^Tescase\"([^\"]*)\" number and Testcase Description \"([^\"]*)\"$")
    public void tescase_number_and_Testcase_Description(String arg1, String arg2)  {
        System.out.println("======"+"TestCase Number:"+arg1+"======"+"TestCase Description:"+arg2+"=============");
    }

    @Given("^I am a person from Wales$")
    public void iAmAPersonFromWales() {
        checkerToolUI_Pages.select_Country();
        checkerToolUI_Pages.click_next_btn();
    }


    @When("^I put my circumstances into the Checker tool based on \"([^\"]*)\"$")
    public void i_put_my_circumstances_into_the_Checker_tool_based_on(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        checkerToolUI_Pages.enterDateOfBirth(arg1);
        checkerToolUI_Pages.submitAgebasedCircumstancesform(arg1);
    }


    @Then("^I should get a result of whether I will get help or not \"([^\"]*)\"$")
    public void iShouldGetAResultOfWhetherIWillGetHelpOrNot(String arg0) throws Throwable {
        resultPublishPage.verifyresultpublish(arg0);

    }

  @After
    public void teardown() {
      System.out.println("=========================================================================================");
        driver.quit();
    }


}
