package DataFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 计算年龄 {

    public static void main(String[] args) throws ParseException {

        System.out.println("请输入您的出生日期（格式为yyyy-MM-dd）");
        Scanner sc = new Scanner(System.in);
        String brith = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(brith);
        long time1 = date1.getTime();
        Date date = new Date();
        long time2 = date.getTime();

        long age = (time2 - time1) /365/3600/1000/24;
        System.out.println("您的年龄为" + age + "岁");
    }
}
