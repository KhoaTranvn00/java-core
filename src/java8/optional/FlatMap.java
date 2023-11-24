package java8.optional;

import java.util.Optional;

public class FlatMap {
    public static void main(String[] args) {
        Person person = new Person("john");
        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper
            = personOptional.map(Person::getName);
        Optional<String> nameOptional
            = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
        String name1 = nameOptional.orElse("");
        System.out.println(name1); // expected 'join

        String name = personOptional
            .flatMap(Person::getName)
            .orElse("");
        System.out.println(name); // expected 'join
    }
}
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
