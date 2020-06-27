package 包装类.Integer;

public class 拆箱与装箱Integer {

    public static void main(String[] args) {

        Integer in6 = new Integer(1);

        Integer in7 = Integer.valueOf(1);
        float v = in7.floatValue();

        /**
         * 构造方法
         */
        Integer in1 = new Integer(12); //方法有横线，说明方法过时了

        Integer in2 = new Integer("1");


        /**
         * 静态方法
         */

        Integer in3 = Integer.valueOf(1);
        Integer in4 = Integer.valueOf("1");

        /**
         * 拆箱
         */

        int i = in1.intValue();

        Character c = Character.valueOf('c');
        char c1 = c.charValue();
        System.out.println(c1);
        System.out.println(c);


        /**
         * 自动装箱
         */
        Integer in9 = 1; // Integer in5 = new Integer(1);


        in9 = in9 + 2; //in5 + 2 相当于 in5.intvalue(1) + 2 ;  in5 = in5 + 2相当于 in5 = new Integer(3)

        in9 = new Integer(in9.intValue() + 2);

    }
}
