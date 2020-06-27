package Collection集合类;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {

    public static void main(String[] args) {

        //add方法
        Collection<String> coll = new ArrayList<>();

        boolean s = coll.add("s");
        System.out.println(s);

        System.out.println(coll);

        boolean s1 = coll.remove("s");
        System.out.println("删除？" + s1);

        System.out.println(coll);

        System.out.println(coll.isEmpty());

        coll.add("张三");
        coll.add("李四");
        coll.add("王大武");

        System.out.println("是否有李四" + coll.contains("李四"));

        System.out.println("数组的长度为" + coll.size());

        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        coll.clear();
        System.out.println(coll);

    }
}
