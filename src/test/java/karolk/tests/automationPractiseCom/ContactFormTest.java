package karolk.tests.automationPractiseCom;

import karolk.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

public class ContactFormTest extends BaseTest {
    @Test
    public void contactButton() {
      driver.get("http://automationpractice.com/index.php");
      driver.findElementById("contact-link").click();
        assertEquals("Contact",
                driver.findElementByClassName("navigation_page").getText()
                );
        driver.findElementById("id_contact").sendKeys("Customer Service");
        driver.findElementById("email").sendKeys("asdas@gmail.com");
        driver.findElementById("id_order").sendKeys("blebleble");
        driver.findElementById("message").sendKeys("aaaaaaaaaaaaaaa");
        driver.findElementById("submitMessage").click();
        assertEquals("CUSTOMER SERVICE - CONTACT US",
                driver.findElementByClassName("page-heading").getText()
                );
    }
    

}
