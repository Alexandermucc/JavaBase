package Map类;

import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<String,Integer> linkedHashMap = new java.util.LinkedHashMap<>();

        linkedHashMap.put("aaa",15);
        linkedHashMap.put("ccc",15);
        linkedHashMap.put("bbb",15);
        System.out.println(linkedHashMap);
        linkedHashMap.put("aaa",16);
        System.out.println(linkedHashMap);

        Set<Map.Entry<String, Integer>> set = linkedHashMap.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        Set<String> set1 = linkedHashMap.keySet();
        for (String s : set1) {
            System.out.println(s + linkedHashMap.get(s));

        }

    }
}
