package Collection集合类.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();

        list.add("2");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        int i = list.indexOf("3");
        System.out.println(i);
        System.out.println(list);

        list.addFirst("wo");
        System.out.println(list);

        list.addLast("ni");
        System.out.println(list);
    }
}
