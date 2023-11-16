package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class display {
    public static char[] names() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Olivia", "Johnson", 23));
        personList.add(new Person("Ethan", "Smith", 34));
        personList.add(new Person("Ethan", "Smith", 34));
        personList.add(new Person("Ava", "Williams", 22));
        personList.add(new Person("Liam", "Davis", 31));
        personList.add(new Person("Sophia", "Martinez", 27));
        personList.add(new Person("Noah", "Anderson", 29));
        personList.add(new Person("Emma", "Jackson", 25));
        personList.add(new Person("Lucas", "Taylor", 30));
        personList.add(new Person("Mia", "Brown", 26));
        personList.add(new Person("Jackson", "Wilson", 33));
        return new char[0];
    }

}

