package karolk;

import org.apache.commons.codec.binary.Base32InputStream;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    static protected RemoteWebDriver driver;

    @BeforeClass
    public static void setUpDriver() throws IOException {
        Properties props = new Properties();
        props.load(BaseTest.class.getResourceAsStream("/config.properties"));
        System.out.println(props.getProperty("driverPath"));
        System.setProperty(
                "webdriver.chrome.driver",
                props.getProperty("driverPath")
        );
        driver = new ChromeDriver();
    }
}