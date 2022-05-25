import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class HeaderGlobalizationSection {

    private WebDriver driver;

    private final By sellOnMizu = new By.ByXPath("/html/body/div[2]/div[2]/div/ul/li[1]/div/span/a");
    private final By selectLanguage = new By.ByXPath("/html/body/div[2]/div[2]/div/ul/li[2]");
    private final By selectLangDe = new By.ByXPath("/html/body/div[2]/div[2]/div/ul/li[2]/div[2]/ul/li[3]");
    private final By selectLangEn = new By.ByXPath("/html/body/div[2]/div[2]/div/ul/li[2]/div[2]/ul/li[1]");

    public HeaderGlobalizationSection(WebDriver driver){
        this.driver = driver;

    }

    public short clickSellOnMizu() throws InterruptedException {
        driver.findElement(sellOnMizu).click();
        sleep(2000);
        System.out.println("sellOnMizu URL:");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

        return 0;
    }
    public enum selectLanguage {English , Deutsch}
    public void activeSelectLanguage(selectLanguage selectLang) throws InterruptedException {
        switch (selectLang) {
            case Deutsch:
                WebElement ae = driver.findElement(selectLanguage);
                WebElement b = driver.findElement(selectLangDe);
                driver.findElement(selectLanguage).click();
                Actions builderen = new Actions(driver);
                builderen.moveToElement(ae).click().perform();
                sleep(1000);
                builderen.moveToElement(b).click().perform();
                break;
            case English:
                WebElement as = driver.findElement(selectLanguage);
                WebElement c = driver.findElement(selectLangEn);
                driver.findElement(selectLanguage).click();
                Actions buildersp = new Actions(driver);
                buildersp.moveToElement(as).click().perform();
                sleep(1000);
                buildersp.moveToElement(c).click().perform();
                break;
        }
    }
}
