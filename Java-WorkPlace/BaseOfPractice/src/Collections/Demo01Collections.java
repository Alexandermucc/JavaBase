package Collections;

import java.util.*;

public class Demo01Collections {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("5");
        list.add("3");
        list.add("4");

        Collections.sort(list);

        System.out.println(list);

        Person p1 = new Person("123", 18);
        Person p2 = new Person("324", 15);
        Person p3 = new Person("664", 23);

        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(p1);
        list2.add(p2);
        list2.add(p3);
        System.out.println(list2);
        Collections.sort(list2, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list2);
    }

}

