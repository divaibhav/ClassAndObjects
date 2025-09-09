public class Person {
    String name;
    String email;
    String mobile;
    int age;

    void displayPerson(){
        System.out.println("----------------------------------------");
        System.out.println("Name:\t" + name);
        System.out.println("Email:\t" + email);
        System.out.println("Mobile:\t" + mobile);
        System.out.println("Age:\t" + age);
        System.out.println("----------------------------------------");
    }

    public Person(String name, String email, String mobile, int age) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
    }
    public Person(){
        name = null;
        email = null;
        mobile = null;
        age = 0;
    }
}
