package studentManager;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Neuedu_yhl
 * @Date 2020/02/20 
 * ѧУ��
 */
public class School {

	static List<Student> students = new ArrayList<Student>();

	static List<Course> courses = new ArrayList<Course>();

	static {
		students.add(new Student(1, "����", '��', "ɽ��ʡ", null));
		students.add(new Student(2, "����", 'Ů', "����ʡ", null));
		students.add(new Student(3, "����", '��', "�ӱ�ʡ", null));
		students.add(new Student(4, "����", 'Ů', "����ʡ", null));
		students.add(new Student(5, "����", '��', "ɽ��ʡ", null));
		courses.add(new Course(50, "�������", null));
		courses.add(new Course(51, "����", null));
		courses.add(new Course(52, "��ľ", null));
		courses.add(new Course(53, "��ѧ", null));
		courses.add(new Course(54, "����", null));
	}
} 