package Main;


import Person.Person;
import Person.Employee;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import comparetor.Comperator1;
import comparetor.Comperator2;
import comparetor.Comperator3;
import comparetor.Comperator4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by СЕВАК on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("Sevak", "Abrahamyan", 18));
        personArrayList.add(new Person("Abgar", "Abrahamyan", 20));
        personArrayList.add(new Person("Sevak", "Stepanyan", 22));
        personArrayList.add(new Person("Vazgen", "Kirakosyan", 19));
        personArrayList.add(new Person("Narek", "Kirakosyan", 17));

        personArrayList.add(new Employee("Xachik","Vardanyan",35,50000));
        personArrayList.add(new Employee("Martin","Antonyan",43,150000));
        personArrayList.add(new Employee("Vardan","Poxosyan",37,120000));
        personArrayList.add(new Employee("Petros","Petrosyan",50,160000));
        personArrayList.add(new Employee("Hakob","Hakobyan",29,75000));

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                Collections.sort(personArrayList, new  Comperator1());
                break;
            case 2:
                Collections.sort(personArrayList, new  Comperator2());
                break;
            case 3:
                Collections.sort(personArrayList, new  Comperator3());
                break;
            case 4:
                Collections.sort(personArrayList, new Comperator4());
                break;
        }

        for(Person p : personArrayList) {
            p.print();
        }
        System.out.println();
    }
}
