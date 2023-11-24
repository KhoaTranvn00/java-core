package java8.optional;

import java.util.Optional;

public class OrElseVsOrElseGet {
    public static void main(String[] args) {
        String text = "Text present";


        System.out.println("Using orElse:");
        String defaultText = Optional.ofNullable(text).orElse(GetValue.getMyDefault("orElse"));
        System.out.println("value: " + defaultText);
        System.out.println("Using orElseGet:");
        defaultText = Optional.ofNullable(text).orElseGet(() -> GetValue.getMyDefault("orElseGet"));
        System.out.println("value: " + defaultText);
    }
    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }
}

class GetValue {
    public static String getMyDefault(String text) {
        System.out.println("Getting Default Value run by: " + text);
        return "Default Value";
    }
}
