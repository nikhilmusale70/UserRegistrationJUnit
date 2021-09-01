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


}
