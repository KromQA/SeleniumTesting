package karolk.tests.automationPractiseCom;

import karolk.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

import static org.junit.Assert.*;

public class RegistrationFormTest extends BaseTest {
    @Test
    public void attemptToCreateNewAccount() {
        // open page
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByCssSelector(".login").click();
        // check if im on the right page
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        // fill email field
        driver.findElementById("email_create").sendKeys("deba@gmail.com");
        driver.findElementById("SubmitCreate").click();
        //wait for form to appear
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    By.id("account-creation_form")
                )
        );
        //checked if button is clicked
        driver.findElementById("id_gender2").click();

    }


    @Test
    public void attepmptToCreateNewAccountInvalidDetails() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByCssSelector(".login").click();
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        driver.findElementById("email_create").sendKeys("asda");
        driver.findElementById("SubmitCreate").click();
    }
}
