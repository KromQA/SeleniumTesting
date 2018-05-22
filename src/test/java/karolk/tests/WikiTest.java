package karolk.tests;

import karolk.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class WikiTest extends BaseTest {


    @Test
    public void search() {
        driver.get("http://www.wikipedia.org");
        driver.findElementByCssSelector("hh");
    }
}
