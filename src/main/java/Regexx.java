import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidUserName {
    boolean validCheck(String namee);
}

public class Regexx {
    public static void main(String[] args) {

        ValidUserName validUserName = (name) -> {
            String regEx = "^[A-Z][A-Z a-z]\\w{1,10}$";
            if (name.matches(regEx))
                return true;
            else
                return false;
        };

        ValidUserName validLastName = (name) -> {
            String regEx = "^[A-Z][A-Z a-z]\\w{1,10}$";
            if (name.matches(regEx))
                return true;
            else
                return false;
        };

        ValidUserName validEmail = (email) -> {
            String regEx = "^[A-Z][A-Z a-z]\\w{1,10}$";
            if (email.matches(regEx))
                return true;
            else
                return false;
        };

        System.out.println("Nikhil is validates as " + validUserName.validCheck("Nikhil"));
        System.out.println("Musale is validates as " + validUserName.validCheck("Musale"));
        System.out.println("Nikhilmusale@gmail.com is validates as " + validUserName.validCheck("Nikhilmusale70@gmail.com"));

    }

}
