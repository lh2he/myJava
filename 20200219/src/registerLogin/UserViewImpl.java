package registerLogin;

import java.util.Scanner;

public class UserViewImpl implements UserView{




	@Override
	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭ��¼");
		System.out.println("�������û���:");
		String userName = scanner.next();
		System.out.println("����������:");
		String psw = scanner.next();
		UserBizImpl userBizImpl = new UserBizImpl();
		userBizImpl.login(userName, psw);
	}

	@Override
	public void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭע��");
		System.out.println("�������û���:");
		String userName = scanner.next();
		System.out.println("����������:");
		String psw = scanner.next();
		System.out.println("���ٴ���������:");
		String psw2 = scanner.next();
		System.out.println("��������ʵ����:");
		String name = scanner.next();
		System.out.println("����������:");
		String email = scanner.next();
		UserBizImpl userBizImpl = new UserBizImpl();
		userBizImpl.register(userName, psw, psw2, name, email);
	}
}
