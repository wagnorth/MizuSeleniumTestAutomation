import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailPassword extends BaseTest{

   @Test
    public void setEmail(){
       mizuSigninPage.setEmail("mizuburaksahintestcase@gmail.com");
       Assertions.assertEquals("mizuburaksahintestcase@gmail.com",mizuSigninPage.getEmail(), "Email value is not correct!");
       System.out.println("Set Email&SignIn Test");
   }

    @Test
    public void setPassword(){
       mizuSigninPage.setPassword("Mizuburak123");
       Assertions.assertEquals("Mizuburak123",mizuSigninPage.getPassword(), "Password value is not correct!");
       System.out.println("Set Password Test");
    }

}
