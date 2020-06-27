package Collection集合类.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet类 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("王老五");
        set.add(new String("abc"));
        set.add("abc" );
        set.add("abc");
        set.add("cba");

        System.out.println(set.toString());
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (String i :set
             ) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        Person p1 = new Person("小龙女",18);
        Person p2 = new Person("小龙女",18);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p1);


        int add = add(1, 2, 3, 4, 5);
        System.out.println(add);
        System.out.println(add(1,2,3,4,5,6));


    }

    //  可变参数
    public static int add(int...add){

        int sum = 0;

        for (int a: add
             ) {
            sum += a;
        }

        return sum;
    }
}
