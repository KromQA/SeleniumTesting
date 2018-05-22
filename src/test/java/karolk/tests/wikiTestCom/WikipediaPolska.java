package karolk.tests.wikiTestCom;

import karolk.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class WikipediaPolska extends BaseTest {
    @Test
    public void search() {
        driver.get("https://pl.wikipedia.org/wiki/Polska");
        WebElement firstHeading = driver.findElementByCssSelector("#firstHeading");
        Assert.assertEquals("Polska[edytuj]", firstHeading.getText());

    }

    @Test
    public void logo() {
        driver.get("https://pl.wikipedia.org/wiki/Polska");
        driver.findElementByCssSelector("a.mw-wiki-logo");
    }

    @Test
    public void links() {
        driver.get("https://pl.wikipedia.org/wiki/Polska");
        driver.findElementByCssSelector("#pt-anontalk");
        driver.findElementByCssSelector("#pt-anonuserpage");
        driver.findElementByCssSelector("#pt-anoncontribs");
        driver.findElementByCssSelector("#pt-createaccount");
        driver.findElementByCssSelector("#pt-login");
    }
}
