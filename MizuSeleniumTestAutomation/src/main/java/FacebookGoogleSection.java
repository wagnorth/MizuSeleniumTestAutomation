import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FacebookGoogleSection {

    private WebDriver driver;
    private final By clickFacebookButton = new By.ByCssSelector("a[class='login__facebook btn btn-info btn-xlg full-width']");
    private final By clickGoogleButton = new By.ByCssSelector("a[class='login__google btn btn-xlg full-width js-google-login']");
    private final By facebookEmail = By.id("email");
    private final By facebookPassword = By.id("pass");
    private final By facebookLogin = By.id("loginbutton");
    private final By facebookContinue = new By.ByXPath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div");


    public enum FacebookGoogle {Facebook , Google}
    public FacebookGoogleSection(WebDriver driver){
        this.driver = driver;

    }

    public void clickFacebookButton(FacebookGoogle facebookGoogle) {
        switch (facebookGoogle) {
            case Facebook:
                driver.findElement(clickFacebookButton).click();
                System.out.println("Opened Facebook OAuth Window");
                String winHandleBefore = driver.getWindowHandle();
                for(String winHandle : driver.getWindowHandles()){
                    driver.switchTo().window(winHandle);
                }
                break;
            case Google:
                driver.findElement(clickGoogleButton).click();
                System.out.println("Opened Google OAuth2 Window");
                break;
        }
    }
    public void setFaceEmail(String emailAsString){
        WebElement emailSpace = driver.findElement(facebookEmail);
        emailSpace.click();
        emailSpace.sendKeys(emailAsString);

    }

    public void setFacePassword(String passAsString){
        WebElement passwordSpace = driver.findElement(facebookPassword);
        passwordSpace.click();
        passwordSpace.sendKeys(passAsString);
        driver.findElement(facebookLogin).click();
        driver.findElement(facebookContinue).click();
    }

}
