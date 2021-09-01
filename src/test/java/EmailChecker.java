import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailChecker {
    String email;
    Boolean result;
    UserRegistration reg;

    public EmailChecker(String email, boolean result){
        this.email = email;
        this.result= result;
    }

    @Before
    public void initialize(){
        reg = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection validateEmails(){
        return Arrays.asList(new Object[][]{
                {"abcdef@yahoo.com",true},
                {"abc-xyz@gmail.com",true},
                {"abc.xyz@gmail.com",true},
                {"abc12345@gmail.com",true},
                {"abc-989@gmail.com",true},
                {"abc.989@gmail.com",true},
                {"abc@xyz@gmail.com",false},
                {"abc.+989@gmail.com",false},
                {"abc",false},
                {".abc.com",false},
                {"abcdefg@12.com",false},
                {"abc.2334@com",false},
                {"abc@xyz.in.com",false},
                {"abc@xyz.com.1x",false},
        });
    }

    @Test
    public void givenEmailId_ShouldReturnProperResult() {
        System.out.println("Email " +email+ " is valid: " +result);
        Assert.assertEquals(result, reg.emailValidationWillReturnTrue(email));
    }
}
