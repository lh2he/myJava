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
//		 1970-01-01 00:00:00 - now ����ֵ
//		long currentTimeMillis = System.currentTimeMillis();
//		Date date2 = new Date(currentTimeMillis);
//		System.out.println(date2);
		
//		util�ı���ʽ�� 2020/02/20 20:09:15
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();
//		String format = simpleDateFormat.format(date);
//		System.out.println(format);
		
//		�ڵ�ǰ��ʱ��+100�� ֮����ʲôʱ��
//		������calendar����
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);    //ͨ��get������õ�ǰ��
        int month = c.get(Calendar.MONTH) + 1;    //�·�0-11����Ҫ��1
        int day = c.get(Calendar.DAY_OF_MONTH);    //����
        int hour = c.get(Calendar.HOUR_OF_DAY);    //��ȡСʱ
        int minute = c.get(Calendar.MINUTE);    //��ȡ����
        int second = c.get(Calendar.SECOND);    //��ȡ����
        System.out.println("��ǰʱ�䣺" + year + "��" + month + "��" + day + "��" + "   " + hour + 
                ":" + minute + ":" + second);
		
        c.add(Calendar.SECOND, 120);
        int year2 = c.get(Calendar.YEAR);    //ͨ��get������õ�ǰ��
        int month2 = c.get(Calendar.MONTH) + 1;    //�·�0-11����Ҫ��1
        int day2 = c.get(Calendar.DAY_OF_MONTH);    //����
        int hour2 = c.get(Calendar.HOUR_OF_DAY);    //��ȡСʱ
        int minute2 = c.get(Calendar.MINUTE);    //��ȡ����
        int second2 = c.get(Calendar.SECOND);    //��ȡ����
        System.out.println("����֮���ʱ�䣺" + year2 + "��" + month2 + "��" + day2 + "��" + "   " + hour2 + 
                ":" + minute2 + ":" + second2);
		
	}
}
