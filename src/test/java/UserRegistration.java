import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

    @Test
    public void firstNameValidationWillReturnTrue() {
        Regexx reg = new Regexx();
        boolean result = reg.validUserName("Nikhil");
        Assert.assertEquals(true,result);
    }

    @Test
    public void lastNameValidationWillReturnTrue() {
        Regexx reg = new Regexx();
        boolean result = reg.validUserName("Musale");
        Assert.assertEquals(true,result);
    }

    @Test
    public void emailValidationWillReturnTrue(){
        Regexx reg = new Regexx();
        boolean result = reg.emailValidation("Nikhilmusale@gmail.com");
        Assert.assertEquals(true,result);
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


}
