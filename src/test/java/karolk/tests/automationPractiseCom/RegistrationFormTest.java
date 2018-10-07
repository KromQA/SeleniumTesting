package karolk.tests.automationPractiseCom;


import karolk.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.*;

public class RegistrationFormTest extends BaseTest {
    @Test
    public void attemptToCreateNewAccount() {
        // open page
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByCssSelector(".login")
                .click();
        // check if im on the right page
        assertEquals(
                "Authentication",
                driver.findElementByCssSelector(".navigation_page")
                        .getText()
        );
        // fill email field
        driver.findElementById("email_create")
                .sendKeys("debssssss@gmail.com");
        driver.findElementById("SubmitCreate")
                .click();
        //wait for form to appear
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("account-creation_form")
                )
        );
        //checked if button is clicked
        driver.findElementById("id_gender1")
                .click();

        //filling up form about Your Personal Details
        driver.findElementByName("customer_firstname")
                .sendKeys("lala");
        driver.findElementByName("customer_lastname")
                .sendKeys("kaka");
        driver.findElementById("passwd")
                .sendKeys("12345");
        driver.findElementById("days")
                .sendKeys("1");
        driver.findElementById("months")
                .sendKeys("January");
        driver.findElementById("years")
                .sendKeys("2010");
        driver.findElementById("newsletter")
                .click();
        driver.findElementById("optin")
                .click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("customer_firstname")
                )
        );
        //filling up form about Adress Details
        assertEquals(
                "lala",
                driver.findElementById("firstname")
                        .getAttribute("value")
        );
        assertEquals(
                "kaka",
                driver.findElementById("lastname")
                        .getAttribute("value")
        );
        driver.findElementById("company")
                .sendKeys("bla");
        driver.findElementById("address1")
                .sendKeys("devon avenue");
        driver.findElementById("address2");
        driver.findElementById("city")
                .sendKeys("Norwich");
        driver.findElementById("postcode")
                .sendKeys("00000");
        driver.findElementById("id_state")
                .sendKeys("Alabama");
        driver.findElementById("other")
                .sendKeys("wrrr");
        driver.findElementById("phone")
                .sendKeys("12345565");
        driver.findElementById("phone_mobile")
                .sendKeys("223345511");
        driver.findElementById("submitAccount")
                .click();
        assertEquals(
                "My account",
                driver.findElementByClassName("navigation_page")
                        .getText()
        );


    }


    @Test
    public void attemptToCreateNewAccountInvalidDewithtails() {
        //open the webpage
        driver.get("http://automationpractice.com/index.php");
        //find the button and click it
        driver.findElementByCssSelector(".login")
                .click();
        //make sure that's right page
        assertEquals(
                "Authentication",
                driver.findElementByCssSelector(".navigation_page")
                        .getText()
        );
        //find and fill up fields and submit it
        driver.findElementById("email_create")
                .sendKeys("lalalala@gmail.com");
        driver.findElementById("SubmitCreate")
                .click();
        //make sure that's right page
        assertEquals(
                "Authentication",
                driver.findElementByCssSelector(".navigation_page")
                        .getText()
        );
        //waiting until element is visible and click it
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("submitAccount")
                )
        );
        driver.findElementById("submitAccount")
                .click();
        //waiting until element is visible and making sure errors will appear
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("alert-danger")
                )
        );
        assertEquals(
                "There are 8 errors",
                driver.findElementByCssSelector("div.alert-danger p")
                        .getText()
        );


    }


    @Test
    public void attemptToLogIn() {
        //open the webpage
        driver.get("http://automationpractice.com/index.php");
        //find login and click it
        driver.findElementByClassName("login")
                .click();
        //make sure that's right page
        assertEquals(
                "Authentication",
                driver.findElementByCssSelector(".navigation_page")
                        .getText()
        );
        //filling up feilds and submit
        driver.findElementById("email")
                .sendKeys("debasssss@gmail.com");
        driver.findElementById("passwd")
                .sendKeys("12345");
        driver.findElementById("SubmitLogin")
                .click();
    }

    @Test
    public void attemptToLogInWithInvalidPassword() {
        //get to directed webpage
        driver.get("http://automationpractice.com/index.php");
        //finding right button to log in
        driver.findElementByClassName("login")
                .click();
        //making sure it's right webpage
        assertEquals(
                "Authentication",
                driver.findElementByCssSelector(".navigation_page")
                        .getText()
        );
        //find fields, fill them up and submit it
        driver.findElementById("email")
                .sendKeys("aa@gmail.com");
        driver.findElementById("passwd")
                .sendKeys("bb");
        driver.findElementById("SubmitLogin")
                .click();
        //making sure the error will appear
        assertEquals(
                "There is 1 error",
                driver.findElementByCssSelector("div.alert-danger p")
                        .getText()
        );
    }


}
