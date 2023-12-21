package Ex;

public class ExBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(7));      //111
        System.out.println(Integer.toBinaryString(7>>2));   //1
        System.out.println(Integer.toBinaryString(-7));     //111
        System.out.println(Integer.toBinaryString(-7>>2));  //11111111111111111111111111111110
    }
}
