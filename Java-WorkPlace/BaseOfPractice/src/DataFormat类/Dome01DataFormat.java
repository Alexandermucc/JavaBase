package DataFormat类;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 成员方法的作用
 *  format（） 日期-》文本
 *  parse（） 文本-》日期
 */
public class Dome01DataFormat {
    public static void main(String[] args) throws ParseException {
        demo01();

        demo02();



    }

    /**
     * parse() 把文本转换为日期
     */
    private static void demo02() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        Date date = sdf.parse("2020年6月14日 19时24分15秒");

        System.out.println(date);

    }

    /**
     *把日期格式化为文本
     */
    private static void demo01() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();

        String s = sdf.format(date);

        System.out.println(date);
        System.out.println(s);


    }
}
