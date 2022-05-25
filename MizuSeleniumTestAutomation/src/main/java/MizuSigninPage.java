import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MizuSigninPage {

    private WebDriver driver;
    private final By EmailLogin = By.id("EmailLogin");
    private final By Password = By.id("Password");
    private final By forgotPassword = new By.ByXPath("/html/body/main/div/div[1]/div/form[1]/div[6]/a");
    private final By signIn = new By.ByXPath("/html/body/main/div/div[1]/div/form[1]/div[6]/button");
    private FacebookGoogleSection facebookGoogleSection;
    private HeaderGlobalizationSection headerGlobalizationSection;

    public MizuSigninPage(WebDriver driver){
        this.driver = driver;
        facebookGoogleSection = new FacebookGoogleSection(driver);
        headerGlobalizationSection = new HeaderGlobalizationSection(driver);
    }

    public FacebookGoogleSection facebookGoogleSection(){
        return this.facebookGoogleSection;
    }

    public HeaderGlobalizationSection headerGlobalizationSection(){
        return this.headerGlobalizationSection;
    }
    public void setEmail(String emailAsString){
        driver.findElement(forgotPassword).click();
        WebElement emailSpace = driver.findElement(EmailLogin);
        emailSpace.click();
        emailSpace.sendKeys(emailAsString);
        driver.findElement(signIn).click();
    }

    public void setPassword(String passwordAsString){
        WebElement passwordSpace = driver.findElement(Password);
        passwordSpace.click();
        passwordSpace.sendKeys(passwordAsString);
    }

    public String getEmail(){
        WebElement emailSpace = driver.findElement(EmailLogin);
        return emailSpace.getAttribute("value");
    }

    public String getPassword(){
        WebElement passwordSpace = driver.findElement(Password);
        return passwordSpace.getAttribute("value");
    }

}
