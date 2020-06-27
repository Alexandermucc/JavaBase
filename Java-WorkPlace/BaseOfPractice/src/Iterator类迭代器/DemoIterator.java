package Iterator类迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("姚明");
        collection.add("詹姆斯");
        collection.add("乔布斯");
        Iterator<String> it = collection.iterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }

        System.out.println();

        //增强for循环
        /*
        for(集合或数组的类型 变量名 ：集合名/数组名){
            函数
        }
         */


        System.out.println("=========================");
        System.out.println("重新回顾");
        Collection coll = new ArrayList();

        coll.add("String");
        coll.add("int");
        coll.add("int");
        coll.add("int");
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("============================");
        for (String i:collection
             ) {
            System.out.println(i);
        }

        System.out.println("========");
        for (Object i:coll
             ) {
            System.out.println(i.toString());
        }
        
    }
}
