package toString;


public class Test {
	public static void main(String[] args) {
		Student student = new Student("����",100,20,"ѧϰ");
		// ���һ���಻��ʽ�������̳еĸ���,��ô�����ĸ������object
		// Object ---�� �����������
		// java.lang.
		System.out.println(student.toString());
	}
}
