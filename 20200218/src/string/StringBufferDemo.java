package string;
import toString.*;
import java.util.ArrayList;

public class StringBufferDemo {


	public static void main(String[] args) {
		// String = final char[]   ������������
		// StringBuffer ---> char[]������������
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("hello").append("word").append("nihao");
		System.out.println(stringBuffer);
		//ɾ��
		StringBuffer delete = stringBuffer.delete(1, 8);
		System.out.println(delete);
		//����
		StringBuffer insert = stringBuffer.insert(0, "today");
		System.out.println(insert);
		//��ָ�������滻Ϊ������
		StringBuffer replace = stringBuffer.replace(1, 5, "friday");
		System.out.println(replace);
		//��תstringBuffer������
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println(reverse);
		System.out.println(stringBuffer.reverse());

		// stringBuilder�÷���stringBuffer 99%
		// synchronized��stringBufferЧ�ʸ���
		StringBuilder stringBuilder = new StringBuilder();

		// ����
		// List
		// ����
		//���
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student student = new Student("���¸�", 500, 50, "������");
		arrayList.add(new Student("����", 500, 50, "�Ⱦ�"));
		arrayList.add(student);
		arrayList.add(new Student("��ǫ", 500, 50, "��ͷ"));
		arrayList.add(new Student("�Ϻ���", 500, 50, "�������"));
		arrayList.add(new Student("�ձ�", 500, 50, "���ձ�"));
		System.out.println(arrayList);
		//ɾ��
		arrayList.remove(student);
		System.out.println(arrayList);
		//�޸�
		arrayList.set(0, new Student("����", 500, 50, "�Ⱦ�"));
		System.out.println(arrayList);
	}
}