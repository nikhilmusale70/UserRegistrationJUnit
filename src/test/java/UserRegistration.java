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
        boolean result = reg.passwordValidation("xkkK0xksss");
        Assert.assertEquals(true,result);
    }


}
