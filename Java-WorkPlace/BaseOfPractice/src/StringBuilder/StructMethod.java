package StringBuilder;

/*
    该类有一个默认长度为16位，但是超过这个长度后可以自动增加，效率更高
 */
public class StructMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder sb2 = new StringBuilder("abc");
        StringBuilder bu1 = sb2.append("你好");

        System.out.println(sb2);

        //链式编程
        bu1.append(1).append(2).append("5").append(false);
        System.out.println(bu1);


        /**
         * StringBuilder与String的转换
         */
        bu1.toString();
        System.out.println(bu1);
        //String -> StringBuilder
        StringBuilder sb3 = new StringBuilder(new String("123"));
        //StringBuilder -> String
        sb3.toString();




    }
}
