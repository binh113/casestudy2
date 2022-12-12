package Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhone {

    public boolean validate() {
        String text = "0812345167";
        Pattern pattern = Pattern.compile("^0[89]\\d{8}$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();

    }



}

