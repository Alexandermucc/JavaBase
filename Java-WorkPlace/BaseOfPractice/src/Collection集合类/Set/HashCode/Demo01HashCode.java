package Collection集合类.Set.HashCode;

public class Demo01HashCode {

    public static void main(String[] args) {

        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println(o.toString());
        System.out.println(o);

        String s = new String("abc");

        System.out.println(s.hashCode());

    }
}
