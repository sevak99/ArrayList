package comparetor;

import Person.Person;

import java.util.Comparator;

/**
 * Created by СЕВАК on 01.04.2017.
 */
public class Comperator2 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
