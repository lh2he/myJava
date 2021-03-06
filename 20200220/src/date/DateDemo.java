package date;

import java.util.Calendar;

import java.util.Date;
import java.text.SimpleDateFormat;

//import java.sql.Date;

public class DateDemo {

	
	public static void main(String[] args) {
//		util Thu Feb 20 20:02:32 CST 2020
//		Date date = new Date();
//		System.out.println(date);
		
//		sql  2020-02-20
//		 1970-01-01 00:00:00 - now 毫秒值
//		long currentTimeMillis = System.currentTimeMillis();
//		Date date2 = new Date(currentTimeMillis);
//		System.out.println(date2);
		
//		util文本格式化 2020/02/20 20:09:15
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();
//		String format = simpleDateFormat.format(date);
//		System.out.println(format);
		
//		在当前的时间+100天 之后是什么时间
//		创建了calendar对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);    //通过get方法获得当前年
        int month = c.get(Calendar.MONTH) + 1;    //月份0-11，需要加1
        int day = c.get(Calendar.DAY_OF_MONTH);    //日期
        int hour = c.get(Calendar.HOUR_OF_DAY);    //获取小时
        int minute = c.get(Calendar.MINUTE);    //获取分钟
        int second = c.get(Calendar.SECOND);    //获取秒数
        System.out.println("当前时间：" + year + "年" + month + "月" + day + "日" + "   " + hour + 
                ":" + minute + ":" + second);
		
        c.add(Calendar.SECOND, 120);
        int year2 = c.get(Calendar.YEAR);    //通过get方法获得当前年
        int month2 = c.get(Calendar.MONTH) + 1;    //月份0-11，需要加1
        int day2 = c.get(Calendar.DAY_OF_MONTH);    //日期
        int hour2 = c.get(Calendar.HOUR_OF_DAY);    //获取小时
        int minute2 = c.get(Calendar.MINUTE);    //获取分钟
        int second2 = c.get(Calendar.SECOND);    //获取秒数
        System.out.println("加完之后的时间：" + year2 + "年" + month2 + "月" + day2 + "日" + "   " + hour2 + 
                ":" + minute2 + ":" + second2);
		
	}
}
