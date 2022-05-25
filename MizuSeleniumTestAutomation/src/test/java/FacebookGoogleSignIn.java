import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class FacebookGoogleSignIn extends BaseTest{

    @Test
    public void clickFacebookButton(){
        mizuSigninPage.facebookGoogleSection().clickFacebookButton(FacebookGoogleSection.FacebookGoogle.Facebook);

    }

    @Test
    public void setFaceEmail(){
        mizuSigninPage.facebookGoogleSection().setFaceEmail("mizuburaksahintestcase@gmail.com");
        System.out.println("Set Facebook Email Test");
    }

    @Test
    public void setFacePassword(){
        mizuSigninPage.facebookGoogleSection().setFacePassword("Mizuburak123");
        System.out.println("Set Facebook Password Test");
        System.out.println("Click Login Button Test");
        System.out.println("Click Continue Button Test");
    }

}
