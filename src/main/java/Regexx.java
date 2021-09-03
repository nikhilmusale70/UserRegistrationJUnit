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

<<<<<<< HEAD
    public boolean phoneValidation(String phoneNumber){
        String regEx = "[0-9]{2}\\s[0-9]{10}";
        Pattern p = Pattern.compile(regEx);

        if (phoneNumber == null)
            return false;
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public boolean passwordValidation(String str){
        String reg="(?=.*[!@#$%^&*()_])(?=.*[0-9])(?=.*[A-Z]).{8,}";
        Pattern p=Pattern.compile(reg);
        return p.matcher(str).matches();
    }
=======
>>>>>>> uc13
}
