package Ex;

class Ex2 {
//    public static void main(String[] args) {
//        System.out.println("he1");
//    }
    public static void main(String [] args) {
        String b = "zys";
        String a = """
            asd123 `${b}` ${myFunction()}  asd""";
        System.out.println(a);
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


