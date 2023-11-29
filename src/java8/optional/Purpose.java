package java8.optional;

import java.util.Optional;

public class Purpose {
    public static void main(String[] args) {

        String strCanEmpty = valueCanEmpty();

        // Normal way
        if (strCanEmpty != null) {
            useString(strCanEmpty);
        }

        // Use Optional
        Optional<String> optionalOfString = Optional.ofNullable(valueCanEmpty());
        if(optionalOfString.isPresent()) {
            useString(optionalOfString.get());
        }
    }

    public static String valueCanEmpty() {
//        return "";
        return null;
    }
    public static void useString(String str) {
        System.out.println(str.length());
    }
}
