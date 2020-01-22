package karolk.tests.automationPractiseCom;

import karolk.BaseTest;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class DressesTest extends BaseTest {


    public void goToDressesPage() {
        driver.get("http://automationpractice.com/index.php");
        List<WebElement> menuLinks = driver.findElementsByCssSelector(
                "#block_top_menu > ul > li > a"
        );

        if (menuLinks.size() < 2) {
            fail("main manu has not enough links");
        }
        if (menuLinks.size() > 3) {
            fail("main menu has to many links");
        }

        menuLinks.get(1).click();
    }

    @Test
    public void navigationPathShouldBePresent() {
        this.goToDressesPage();

        assertEquals(
                "return to home",
                driver.findElementByCssSelector(".breadcrumb a.home")
                .getAttribute("title")
                .toLowerCase()
        );
    }

    @Test
    @Ignore
    public void subcategoriesShouldBePresent() {
        // todo not yet written
        this.goToDressesPage();
    }

}
