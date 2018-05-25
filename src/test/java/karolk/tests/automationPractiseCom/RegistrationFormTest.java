package karolk.tests.automationPractiseCom;

import javafx.scene.control.RadioButton;
import karolk.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.image.ByteInterleavedRaster;

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
        driver.findElementById("email_create").sendKeys("debasssss@gmail.com");
        driver.findElementById("SubmitCreate").click();
        //wait for form to appear
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("account-creation_form")
                )
        );
        //checked if button is clicked
        driver.findElementById("id_gender1").click();

        //filling up form about Your Personal Details
        driver.findElementByName("customer_firstname").sendKeys("lala");
        driver.findElementByName("customer_lastname").sendKeys("kaka");
        driver.findElementById("passwd").sendKeys("12345");
        driver.findElementById("days").sendKeys("1");
        driver.findElementById("months").sendKeys("January");
        driver.findElementById("years").sendKeys("2010");
        driver.findElementById("newsletter").click();
        driver.findElementById("optin").click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("customer_firstname")
                )
        );
        //filling up form about Adress Details
        assertEquals("lala",
                driver.findElementById("firstname").getAttribute("value"));
        assertEquals("kaka",
                driver.findElementById("lastname").getAttribute("value"));
        driver.findElementById("company").sendKeys("bla");
        driver.findElementById("address1").sendKeys("devon avenue");
        driver.findElementById("address2");
        driver.findElementById("city").sendKeys("Norwich");
        driver.findElementById("postcode").sendKeys("00000");
        driver.findElementById("id_state").sendKeys("Alabama");
        driver.findElementById("other").sendKeys("wrrr");
        driver.findElementById("phone").sendKeys("12345565");
        driver.findElementById("phone_mobile").sendKeys("223345511");
        driver.findElementById("submitAccount").click();
        assertEquals("My account",
                driver.findElementByClassName("navigation_page").getText());


    }


    @Test
    public void attemptToCreateNewAccountInvalidDewithtails() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByCssSelector(".login").click();
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        driver.findElementById("email_create").sendKeys("lalalala@gmail.com");
        driver.findElementById("SubmitCreate").click();
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("submitAccount")
                )
        );
        driver.findElementById("submitAccount").click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("alert-danger")
                )
        );
        assertEquals("There are 8 errors",
                driver.findElementByCssSelector("div.alert-danger p").getText()
        );


    }


    @Test
    public void attemptToLogIn() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByClassName("login").click();
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
    driver.findElementById("email").sendKeys("debasssss@gmail.com");
    driver.findElementById("passwd").sendKeys("12345");
    driver.findElementById("SubmitLogin").click();
    }

    @Test
    public void attemptToLogInWithInvalidPassword(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByClassName("login").click();
        assertEquals("Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        driver.findElementById("email").sendKeys("aa@gmail.com");
        driver.findElementById("passwd").sendKeys("bb");
        driver.findElementById("SubmitLogin").click();
        assertEquals("There is 1 error",
                driver.findElementByCssSelector("div.alert-danger p").getText()
        );
    }
}
