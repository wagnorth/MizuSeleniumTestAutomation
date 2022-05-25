import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;

public class HeaderGlobalization extends BaseTest{


    @Test
    public void clickSellOnMizu() throws InterruptedException {
        mizuSigninPage.headerGlobalizationSection().clickSellOnMizu();
        System.out.println("Go to Sell on Mizu Page");
        System.out.println("Back to SignIn Page");

    }

    @Test
    public void activeSelectLanguage() throws InterruptedException {
        mizuSigninPage.headerGlobalizationSection().activeSelectLanguage(HeaderGlobalizationSection.selectLanguage.Deutsch);
        System.out.println("Change Language: Deutsch");
        mizuSigninPage.headerGlobalizationSection().activeSelectLanguage(HeaderGlobalizationSection.selectLanguage.English);
        System.out.println("Change Language: English");

    }

}
