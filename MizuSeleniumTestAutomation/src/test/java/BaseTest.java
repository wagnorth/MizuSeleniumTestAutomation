import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import static java.lang.Thread.sleep;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    MizuSigninPage mizuSigninPage ;

    @BeforeAll
    public void setUp(){
        System.out.println("Test Initiated");
        System.setProperty("webdriver.opera.driver","drivers/operadriver.exe");
        driver = new OperaDriver();
        driver.get("https://www.mizu.com/en-mx/login");
        mizuSigninPage = new MizuSigninPage(driver);

    }

    @AfterAll
    public void tearDown() throws InterruptedException {
        sleep(2000);
        driver.quit();
        System.out.println("Test Finished");
    }

}
