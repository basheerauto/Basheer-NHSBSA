/**
 * In this class contains NHS result page methods of checkertool
 * Author:Basheer Ahamed
 * Date:11/01/2021
 */

package ApplicationPages;
import framework.utility;
import framework.webBrowser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;



public class resultPublish_Page extends webBrowser {

    private static final String result_TXT = "//*[@id='content']//span[@class='heading-secondary']/parent::h2";

    public void verifyresultpublish(String TcNumber) throws IOException, InterruptedException {
        try {
            WebElement resultText=driver.findElement(By.xpath(result_TXT));
            String finaltext = resultText.getText();
            Assert.assertTrue(finaltext.contains("You get help with NHS costs"));
            Thread.sleep(2000);
           WebElement desc=  driver.findElement(By.xpath("//h2[normalize-space()='You get free:']"));
           desc.click();
            utility.CaptureScreenshot(TcNumber +"_Pass"+"_");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while verifying  result text");
            Thread.sleep(2000);
            utility.CaptureScreenshot(TcNumber +"_Fail"+"_");
            driver.quit();
        }
    }
}
