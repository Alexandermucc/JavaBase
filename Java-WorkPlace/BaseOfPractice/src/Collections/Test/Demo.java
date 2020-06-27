package Collections.Test;

import java.util.ArrayList;

import java.util.Collections;


public class Demo {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("rose",18));
        list.add(new Student("jack",16));
        list.add(new Student("abc",16));
        list.add(new Student("ace",17));
        list.add(new Student("mark",16));

        Collections.sort(list);

        System.out.println("第一种打印方式");
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("第二种打印方式");
        System.out.println(list.toString());

        System.out.println("第三种打印方式");
        for (Student value : list) {
            System.out.println(value);
        }

        System.out.println("第二种排序方式");
        list.sort((o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println("第一种打印方式");
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("第二种打印方式");
        System.out.println(list.toString());

        System.out.println("第三种打印方式");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
