package System类;

import java.util.ArrayList;

import static java.lang.System.arraycopy;
import static java.lang.System.currentTimeMillis;

public class CurrentTimeMillsDemo01 {
    public static void main(String[] args) {

//        currentTimeMillis01();
        arraycopy01();

    }

    private static void arraycopy01() {

        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        for (int i = 0; i < dest.length; i++) {
            System.out.print(" " + dest[i]);
        }
        System.out.println();
        arraycopy(src,0,dest,0,2);
        System.out.println("复制后的结果为");
        for (int i = 0; i < dest.length; i++) {
            System.out.print(" " + dest[i]);
        }

    }

    private static void currentTimeMillis01() {

        long firstTime = currentTimeMillis();

        System.out.println(firstTime);
        for (long i = 0; i < 2000000000; i++) {

        }


        long endTime = currentTimeMillis();

        System.out.println(endTime);
        System.out.println("进行2000000000次循环共用时" + (long)(endTime - firstTime) + "毫秒");
    }
}
