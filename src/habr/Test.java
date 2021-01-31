package habr;

public class Test {
    public static void main(String[] args) {
        Person p = new Person.Builder()
                .setNestedCity("Almaty")
                .setNestedLastName("Slamkul")
                .build();

        String name = p.getFirstName();

        System.out.println(name);
    }
}
