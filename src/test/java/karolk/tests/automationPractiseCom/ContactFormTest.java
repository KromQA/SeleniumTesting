package karolk.tests.automationPractiseCom;

import karolk.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class ContactFormTest extends BaseTest {
    @Test
    public void contactButton() {
        //open webpage, find button and make sure that's right page
        driver.get("http://automationpractice.com/index.php");
        driver.findElementById("contact-link")
                .click();
        assertEquals(
                "Contact",
                driver.findElementByClassName("navigation_page")
                        .getText()
        );
        //find feilds and fill them up and submit it
        driver.findElementById("id_contact")
                .sendKeys("Customer Service");
        driver.findElementById("email")
                .sendKeys("asdas@gmail.com");
        driver.findElementById("id_order")
                .sendKeys("blebleble");
        driver.findElementById("message")
                .sendKeys("aaaaaaaaaaaaaaa");
        driver.findElementById("submitMessage")
                .click();
        //double check if it's right page
        assertEquals(
                "CUSTOMER SERVICE - CONTACT US",
                driver.findElementByClassName("page-heading")
                        .getText()

        );
    }

    @Test
    public void contactButtonInvalidDetails() {
        //open the webpage, find button, click it and double check if its right page
        driver.get("http://automationpractice.com/index.php");
        driver.findElementById("contact-link")
                .click();
        assertEquals(
                "Contact",
                driver.findElementByClassName("navigation_page")
                        .getText()
        );
        //find fields, fill them up and submit it
        driver.findElementById("id_contact")
                .sendKeys();
        driver.findElementById("email")
                .sendKeys("asdas");
        driver.findElementById("id_order")
                .sendKeys();
        driver.findElementById("message")
                .sendKeys();
        driver.findElementById("submitMessage")
                .click();
        //double check if errors show up
        assertEquals(
                "There is 1 error",
                driver.findElementByCssSelector("div.alert-danger p")
                        .getText()
        );
    }

}
