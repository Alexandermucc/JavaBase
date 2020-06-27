package Map类;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap类 extends Object{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("黄晓明", 44);
        Integer 黄晓明 = map.put("黄晓明", 44);
        map.put("AngelaBaby",35);
        map.put("张飞",101);
        map.put("张三丰",200);
        System.out.println(map);
        map.put("黄晓明", 42);


        System.out.println(map.toString());

        Integer i = map.remove("张飞");
        int i1 = i.intValue();
        Integer integer = i1;
        System.out.println(i);

        Integer i2 = map.get("黄晓明");
        System.out.println(i2);

        System.out.println(map.containsKey("黄晓明"));

        System.out.println("删除黄晓明后");
        Integer 黄晓明1 = map.remove("黄晓明");
        System.out.println(黄晓明1);

        System.out.println(黄晓明);

        // Map的第一种遍历方式
        Set<String> set = map.keySet();
        for (String key: set
             ) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value );
        }

        // Map遍历的改写
        for (String key:map.keySet()
             ) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }


        // Map集合遍历的第二种方式  使用entrySet
        Set<Map.Entry<String, Integer>> ent = map.entrySet();

        for (Map.Entry<String, Integer> set1 : ent) {
            String key = set1.getKey();
            Integer value = set1.getValue();
            System.out.println(key + " = " + value);
        }


    }
}
