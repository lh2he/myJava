package ZhangYuRpgGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("��ӭ������Ϸ��");
			System.out.println("����������ѡ��1-3��");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				m.menu();
				break;
			case 2:
				System.out.println("��Ϸ����:xxxxxxxxxxxx");
				break;
			default:
				System.exit(0);
			}
		}
	}
}