package comparetor;

import Person.Person;
import Person.Employee;

import java.util.Comparator;

/**
 * Created by СЕВАК on 01.04.2017.
 */
public class Comperator4 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return salary(o2) - salary(o1);
    }

    private int salary(Person person) {
        if(person instanceof Employee) return ((Employee) person).getSalary();
        return 0;
    }
}
