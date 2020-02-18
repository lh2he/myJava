package rgbGame;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Client {

	// ���������Ϸ��ɫ������
	GameCharacter[] gc = {};

	public static void main(String[] args) {
		new Client().initFrame();
	}

	/**
	 * �����Ϸ��ɫ
	 */
	public void addGamePlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ӷ�Ӧ�Ľ�ɫ��Ϣ");
		System.out.println("��������Ϸ��ɫ��:");
		String name = scanner.next();
		System.out.println("��������Ϸ�Ա�:");
		String sex = scanner.next();
		System.out.println("��������Ϸ����:���� ����  ���� ���� Ԫ��)");
		String race = scanner.next();
		System.out.println("��������Ϸְҵ:");
		String occupy = scanner.next();
		// ������Ϸ��ɫ����
		GameCharacter gameCharacter = new GameCharacter(name, sex.charAt(0), race, occupy);
		gc = Arrays.copyOf(gc, gc.length+1);
		gc[gc.length-1] = gameCharacter;
		if(gc.length!=0) {
			System.out.println("��ӳɹ�");
		}
		initFrame();
	}

	public void gameRules() {
		System.out.println("���������~");
		initFrame();
	}

	// ��ѯ���н�ɫ
	public void queryAllChar() {
		System.out.println("*****************��Ϸ��ɫ������Ϣ********************");
		for (int i = 0; i < gc.length; i++) {
			System.out.println(gc[i]);
		}
		System.out.println("*****************��Ϸ��ɫ������Ϣ********************");
		initFrame();
	}
	public void deleteChar() {
		System.out.println("ɾ�����ܴ�����...");
		initFrame();
	}

	public void endGame() {
		System.out.println("��ӭ����~~~");
		System.exit(0);
	}

	public void nowTime() {
		System.out.println("��ǰʱ��");
		System.out.println(new Date());
		initFrame();
	}

	// ��ʼ�����ڴ�ӡ��ӭ��Ϣ
	public void initFrame() {
		System.out.println("*****************����һ��RPG��Ϸ********************");
		System.out.println("******1.��Ϸ����******");
		System.out.println("******2.������Ϸ******");
		System.out.println("******3.�����Ϸ��ɫ******");
		System.out.println("******4.��ѯ���н�ɫ******");
		System.out.println("******5.ɾ����Ϸ��ɫ******");
		System.out.println("******6.�鿴��ǰʱ��******");
		System.out.println("****************************************************");
	    Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ�����Ĺ���");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			gameRules();
			break;
		case 2:
			endGame();
			break;
		case 3:
			addGamePlayer();
			break;
		case 4:
			queryAllChar();
			break;
		case 5:
			deleteChar();
			break;
		case 6:
			nowTime();
			break;
		default:
			System.out.println("��������,��������");
			initFrame();
			break;
		}
	}
}