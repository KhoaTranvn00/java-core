package Ex;

class Ex2 {
//    public static void main(String[] args) {
//        System.out.println("he1");
//    }
    public static void main(String [] args) {
        String textBlock =
            """
            This is a long line that exceeds the 120-character limit. " +
            "So, we break it into multiple lines using concatenation and " +
            "line continuation. This helps maintain readability.";
            """;

        System.out.println(textBlock);
    }

    public static String myFunction() {
        return "new string";
    }

//    public static void print(String b, int... a) {
//        System.out.println(b);
//        System.out.println(a[0]);
//        for(Integer s: a) {
//            System.out.println(s);
//        }
//    }
}

class Ex3 {
    public static void main(String[] args) {
        System.out.println("he3");
    }
}


