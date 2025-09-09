public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

        Person person2 = new Person("Suresh", "suresh@em", "7894561230", 41);

        person.displayPerson();

        //updating
        person.name = "Ramesh Singh";
        person.email = "ramesh@example.com";
        person.mobile = "9876543210";
        person.age = 45;

        person.displayPerson();
        System.out.println();
        person2.displayPerson();
        person2.age = 42;
        person2.displayPerson();

    }
}
