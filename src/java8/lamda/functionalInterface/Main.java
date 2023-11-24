package java8.lamda.functionalInterface;

public class Main {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface Creature {
    String spoken();

}

@FunctionalInterface
interface Animal extends Creature {
    String eat();

    default String spoken() {
        return "asd";
    }
}
