package karolk.tests;

import karolk.BaseTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class GitLab extends BaseTest {

    @Test
    public void navigationBar() {
        driver.get("https://about.gitlab.com/");
        driver.findElementByCssSelector("#main-gl-nav a[href='/features']").click();
        assertEquals(
                "Features",
                driver.findElementByCssSelector("#main-gl-nav li.active").getText()
        );
        driver.navigate().back();


        driver.get("https://about.gitlab.com/");
        driver.findElementByCssSelector("#main-gl-nav a[href='/pricing']").click();
        assertEquals(
                "Pricing",
                driver.findElementByCssSelector("#main-gl-nav li.active").getText()
        );
        driver.navigate().back();


        driver.get("https://about.gitlab.com/");
        driver.findElementByCssSelector("#main-gl-nav a[href='/installation']").click();
        assertEquals(
                "Install",
                driver.findElementByCssSelector("#main-gl-nav li.active").getText()
        );
        driver.navigate().back();


    }

    @Test
    public void buttonTryGitLabForFree() {
        driver.get("https://about.gitlab.com/");
        driver.findElementByCssSelector(".page-subtitle .btn.cta-btn.accent");
    }

    @Test
    public void lefMenuButtons() {
        driver.get("https://about.gitlab.com/");
        driver.findElementByCssSelector(".plan.is-active");
        driver.findElementByCssSelector(".create");
        driver.findElementByCssSelector(".verify");
        driver.findElementByCssSelector(".package");
        driver.findElementByCssSelector(".release");
        driver.findElementByCssSelector(".configure");
        driver.findElementByCssSelector(".monitor");
    }

    @Test
    public void ButtonLearnMoreInMainArticle() {
        driver.get("https://about.gitlab.com/");
        driver.findElementByCssSelector(".lifecycle-diagram-phase.plan,.more-link");
    }
}

