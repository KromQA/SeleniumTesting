package karolk.tests.volleyballEnglandOrg;

import karolk.BaseTest;
import org.junit.Test;

public class VolleyballEngland extends BaseTest {
    @Test
    public void memberLinks (){
        driver.get("https://www.volleyballengland.org/club/BHA65580/cheltenham-&-gloucester-volleyball");
        driver.findElementByCssSelector(".member");
    }

    @Test
    public void menubuttons () {
        driver.get("https://www.volleyballengland.org/club/BHA65580/cheltenham-&-gloucester-volleyball");
        driver.findElementByCssSelector(".getintovolleyball.anchorclass");
        driver.findElementByCssSelector(".competitions.anchorclass");
        driver.findElementByCssSelector(".performance.anchorclass");
        driver.findElementByCssSelector(".about_us.anchorclass");
        driver.findElementByCssSelector(".membership.anchorclass");
        driver.findElementByCssSelector(".shop.anchorclass");
    }
    @Test
    public void formButton() {
        driver.get("https://www.volleyballengland.org/club/BHA65580/cheltenham-&-gloucester-volleyball");
        driver.findElementsByCssSelector(".txt");
    }
    @Test
    public void buttonsOfGetIntoVolleyball(){
        driver.get("https://www.volleyballengland.org/club/BHA65580/cheltenham-&-gloucester-volleyball");
        driver.findElementByLinkText("Play");

    }
}
