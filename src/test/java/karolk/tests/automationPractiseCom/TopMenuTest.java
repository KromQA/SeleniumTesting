package karolk.tests.automationPractiseCom;

import karolk.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TopMenuTest extends BaseTest {
    @Test
    public void topMenuWomen() {
        // check if all links in women section exists and are displayed/visible when hover women link

        driver.get("http://automationpractice.com/index.php");
        Actions mouseAction = new Actions(driver);
        WebElement link = driver.findElementByCssSelector("div#block_top_menu a[title='Women']");
        mouseAction.moveToElement(link)
                .build()
                .perform();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("a.sf-with-ul[title='Tops']")
                )
        );
        driver.findElementByCssSelector("a.sf-with-ul[title='Tops']");
        Assert.assertTrue(
                driver.findElementByCssSelector("ul.submenu-container a[title='T-shirts']")
                        .isDisplayed()
        );
        Assert.assertTrue(
                driver.findElementByCssSelector("ul.submenu-container a[title='Blouses']")
                        .isDisplayed()
        );
        Assert.assertTrue(
                driver.findElementByCssSelector("ul.submenu-container a[title='Dresses']")
                        .isDisplayed()
        );
        Assert.assertTrue(
                driver.findElementByCssSelector("ul.submenu-container a[title='Casual Dresses']")
                        .isDisplayed()
        );
        Assert.assertTrue(
                driver.findElementByCssSelector("ul.submenu-container a[title='Evening Dresses']")
                        .isDisplayed()
        );
        Assert.assertTrue(
                driver.findElementByCssSelector("ul.submenu-container a[title='Summer Dresses']")
                        .isDisplayed()
        );


    }

    @Test
    public void topMenuWomenLinkActions() {
        // find all links in this menu section
        // click and go back on every link in this section
        driver.get("http://automationpractice.com/index.php");
        Actions mouseAction = new Actions(driver);
        WebElement link = driver.findElementByCssSelector("div#block_top_menu a[title='Women']");
        mouseAction.moveToElement(link)
                .build()
                .perform();
        //testing "TOPS" link
        //
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("a.sf-with-ul[title='Tops']")
                )
        );
        driver.findElementByCssSelector("a.sf-with-ul[title='Tops']")
                .click();
        Assert.assertEquals(
                "TOPS",
                driver.findElementByCssSelector("h2.title_block")
                        .getText()
        );
        driver.navigate()
                .back();
        //
        // testing "T-shirts" link
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("a.sf-with-ul[title='T-shirts']")
                )
        );
        driver.findElementByCssSelector("a.sf-with-ul[title='T-shirts']")
                .click();


    }
// TODO: 08/06/18
}
