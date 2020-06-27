package Map类;

import java.util.*;
import java.util.LinkedHashMap;

/**
 * 统计字符出现的次数
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("请输入一段字符串");
        //首先输入一段字符串
        String line = new Scanner(System.in).nextLine();
        //根据字符串转换为字符数组进行统计
        char[] chars = line.toCharArray();
        countChar1(chars);
        countChar2(line);

        JDK9();

    }

    private static void JDK9() {
        List<String> a = List.of("a", "b", "c");

    }

    private static void countChar2(String line) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c,1);
            }else{
                Integer count = hashMap.get(c);
                hashMap.put(c, ++count);
            }

        }
        System.out.println(hashMap);
    }

    private static void countChar1(char[] chars) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            //如果字符是第一次出现
            if (!hashMap1.containsKey(chars[i])) {
                hashMap1.put(chars[i], 1);
            } else {
                Integer count = hashMap1.get(chars[i]);
                hashMap1.put(chars[i], ++count);
            }
        }
        System.out.println(hashMap1);
    }
}
