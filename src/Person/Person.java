package Person;

/**
 * Created by СЕВАК on 01.04.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstName).append(" ").append(lastName)
                .append(", age: ").append(age)
                .append(", salary: ").append(getSalary());
        System.out.println(stringBuilder);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return 0;
    }

    //
//    @Override
//    public int compareTo(Person o) {
//        if(firstName.equals(o.firstName)) {
//            if(lastName.equals(o.lastName)) {
//                return age - o.age;
//            }
//            return lastName.compareTo(o.lastName);
//        }
//        return firstName.compareTo(o.firstName);
//    }
}