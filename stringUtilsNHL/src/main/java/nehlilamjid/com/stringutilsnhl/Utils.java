package nehlilamjid.com.stringutilsnhl;

/**
 * Created by mac on 31/05/2018.
 */

public class Utils {

    public static String checkNotNull(String string) {

        return string != null ? string : "";
    }

    public static boolean checkEditTextEmpty(String value) {

        if (value == null)
            return false;

        return value.matches("");
    }

}
