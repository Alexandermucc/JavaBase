package Date类;

import java.util.Date;

public class StructureMethod {


    public static void main(String[] args) {
        Date date = new Date(10000);
        System.out.println(System.currentTimeMillis());
        long time1 = System.currentTimeMillis();
        Date date1 = new Date();


        System.out.println(date);

        System.out.println(date1);

        System.out.println("经历的时间");

        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1 + "毫秒");



        /*
        Date成员方法
        Long getTime（） 获取日期的毫秒值
         */

        System.out.println("这个一个分界线------------------");

        Date date2 = new Date();

        long time = date2.getTime();

        System.out.println(time);

        Date date3 = new Date(time);
        System.out.println(date3);

        System.out.println("-----------");
        String s = date3.toString();
        System.out.println(s);

    }
}
