package karolk.tests.automationPractiseCom;

import karolk.BaseTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;


public class AuthenticationTest extends BaseTest{
    @Test
    public void login(){
        driver.get("http://automationpractice.com/index.php");
        driver.findElementByCssSelector(".login").click();
        assertEquals(
                "Authentication",
                driver.findElementByCssSelector(".navigation_page").getText()
        );
        driver.findElementById("email").sendKeys("asdas@gmail.com");
        driver.findElementById("passwd").sendKeys("asdasda");
        driver.findElementById("SubmitLogin").click();


    }

}
