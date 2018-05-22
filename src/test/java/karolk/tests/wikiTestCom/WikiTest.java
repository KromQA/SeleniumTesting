package karolk.tests.wikiTestCom;

import karolk.BaseTest;
import org.junit.Test;

public class WikiTest extends BaseTest {


    @Test
    public void search() {
        driver.get("http://www.wikipedia.org");
        driver.findElementByCssSelector("hh");
    }
}
