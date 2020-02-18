package rgbGame;

import java.util.Random;

public class GameCharacter {

	public GameCharacter() {

	}
	public GameCharacter(String name,char sex,String race,String occupy) {
		Random random = new Random();
		this.name = name;
		this.sex = sex;
		this.race = race;
		this.occupy = occupy;
		this.strength  = random.nextInt(9999);
		this.agile = random.nextInt(9999);
	}

	//����
	String name;

	//�Ա�
	char sex;

	//����
	String race;

	//ְҵ
	String occupy;

	//����
	int strength;

	//����
	int agile;

	// �ȼ�
	int level;

	// ���
	int money;

	@Override
	public String toString() {
		return "GameCharacter [name=" + name + ", sex=" + sex + ", race=" + race + ", occupy=" + occupy + ", strength="
				+ strength + ", agile=" + agile + ", level=" + level + ", money=" + money + "]";
	}


}