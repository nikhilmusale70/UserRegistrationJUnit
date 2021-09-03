import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< HEAD
    @Test
    public void lastNameValidationWillReturnTrue() {
        Regexx reg = new Regexx();
        boolean result = reg.validUserName("Musale");
        Assert.assertEquals(true,result);
    }

    @Test
    public boolean emailValidationWillReturnTrue(String email){
        Regexx reg = new Regexx();
        boolean result = reg.emailValidation("Nikhilmusale@gmail.com");
        if (result)
            return true;
        else
            return false;
//        Assert.assertEquals(true,result);
    }

    @Test
    public void phoneNumberValidationWillReturnTrue() {
        Regexx reg = new Regexx();
        boolean result = reg.phoneValidation("91 1234567891");
        Assert.assertEquals(true,result);
    }

    @Test
    public void passwordValidationWillReturnTrue() {
        Regexx reg = new Regexx();
        boolean result = reg.passwordValidation("xkkK@0xksss");
        Assert.assertEquals(true,result);
        boolean result2 = reg.passwordValidation("abc@yahoo.com");
        Assert.assertEquals(true,result);
        boolean result3 = reg.passwordValidation("abc-100@yahoo.com");
        Assert.assertEquals(true,result);
        boolean result4 = reg.passwordValidation("abc.100@yahoo.com");
        Assert.assertEquals(true,result);
        boolean result5 = reg.passwordValidation("abc111@abc.com");
        Assert.assertEquals(true,result);
        boolean result6 = reg.passwordValidation("abc-100@abc.net");
        Assert.assertEquals(true,result);

    }
=======
public class UserRegistration {
>>>>>>> uc13
}


