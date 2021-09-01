import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexx {

    public boolean validUserName(String name){
        String regEx = "^[A-Z][A-Z a-z]\\w{1,10}$";
        Pattern p = Pattern.compile(regEx);

        if (name==null)
            return false;
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public boolean emailValidation(String email){

        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        if (email == null)
            return false;
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public boolean phoneValidation(String phoneNumber){
        String regEx = "[0-9]{2}\\s[0-9]{10}";
        Pattern p = Pattern.compile(regEx);

        if (phoneNumber == null)
            return false;
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public boolean passwordValidation(String str){
        String reg="(?=.*[0-9])(?=.*[A-Z]).{8,}";
        Pattern p=Pattern.compile(reg);
        return p.matcher(str).matches();
    }
}
