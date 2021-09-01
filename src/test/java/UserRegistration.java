import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

    @Test
    public void firstNameValidationWillReturnTrue() {
        Regexx reg = new Regexx();
        boolean result = reg.validUserName("Nikhil");
        Assert.assertEquals(true,result);
    }
}
