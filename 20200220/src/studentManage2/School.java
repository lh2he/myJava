package studentManage2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Neuedu_yhl
 * @Date 2020/02/20 
 * ѧУ��
 */
public class School {

	// ����ֻ��һ��

	static List<Student> students = new ArrayList<Student>();

	static List<Course> courses = new ArrayList<Course>();


	static {
		students.add(new Student(1, "����", '��', "ɽ��ʡ", new ArrayList<Integer>()));
		students.add(new Student(2, "����", 'Ů', "����ʡ", new ArrayList<Integer>()));
		students.add(new Student(3, "����", '��', "�ӱ�ʡ", new ArrayList<Integer>()));
		students.add(new Student(4, "����", 'Ů', "����ʡ", new ArrayList<Integer>()));
		students.add(new Student(5, "����", '��', "ɽ��ʡ", new ArrayList<Integer>()));
		courses.add(new Course(50, "�������", new ArrayList<Integer>()));
		courses.add(new Course(51, "����", new ArrayList<Integer>()));
		courses.add(new Course(52, "��ľ", new ArrayList<Integer>()));
		courses.add(new Course(53, "��ѧ", new ArrayList<Integer>()));
		courses.add(new Course(54, "����", new ArrayList<Integer>()));
	}
} 