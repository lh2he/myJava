package string;

public class StringDemo {

	/**
	 * String = final char[];
	 * String str = "hello";
	 * str = "helloworld";
	 */
	/**
	 * equals�Ƚ�����
	 */
	String str = " hel lo ";
	public void word() {
		// �����±�ȡ�ַ�
		char charAt = str.charAt(1);
		System.out.println(charAt);
		// length() 
		int length = str.length();
		System.out.println(length);
		// trim();ȥ��ǰ��Ŀո�
		String trim = str.trim();
		System.out.println(trim);
		//תΪ��д�ַ�
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		// indexOf()
		int indexOf = str.indexOf("e");
		System.out.println(indexOf);
		// endsWith()
		boolean endsWith = str.endsWith(" ");
		System.out.println(endsWith);
		// substring();ȡ��ָ��λ�õ��ַ������ұգ�
		String substring = str.substring(1,4);
		System.out.println(substring);
		// toCharArray();�ַ���ת��Ϊ�ַ�����
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		// char[]�ַ�����ת��Ϊ�ַ���
		char[] c = {'a','b','c'};
		String string = new String(c);
		System.out.println(string);
		//�ַ������ֵ��ŵ��ַ�����
		String valueOf = String.valueOf(c);
		System.out.println(valueOf);
		//
		String valueOf2 = String.valueOf(5);
		System.out.println(valueOf2);
	}

	public static void main(String[] args) {
		new StringDemo().word();
	}
} 