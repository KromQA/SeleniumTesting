package karolk.tests.automationPractiseCom;

import karolk.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrationFormTest extends BaseTest {
    @Test
    public void attemptToCreateNewAccount() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByCssSelector(".login").click();
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        driver.findElementById("email_create").sendKeys("deba@gmail.com");
        driver.findElementById("SubmitCreate").click();
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
