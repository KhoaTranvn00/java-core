package dataType.primitive;

public class String1 {
    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        String c = new String("ab");
        boolean ab =  a==b;
        boolean ac =  a==c;

        System.out.println("a=b  is, " + ab);               // true because it just gets from String pool
        System.out.println("a=c  is, " + ac);               // false because c was created by other way. not in String pool
        System.out.println("a.equal(b) is " + a.equals(c)); // We need use equals method for this case
        System.out.println("a.equal(b) is " + a.equals(b));
    }
}
