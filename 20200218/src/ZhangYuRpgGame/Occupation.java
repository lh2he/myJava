package ZhangYuRpgGame;

import java.util.Random;

public class Occupation {                //��������������Եĺ���
    private int strength,agile,health,talen,wisdom;
    public void shuxing(Character m) {    //����character����  ��occupy���ַ���ƥ��
        Random r=new Random();
        if (m.occupy.equals("սʿ")) {
            strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("������")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("�̿�")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("��ʿ")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("��ʦ")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("�ٻ�ʦ")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        System.out.println("����:         "+strength);
        System.out.println("����:         "+agile);
        System.out.println("����:         "+health);
        System.out.println("����:         "+talen);
        System.out.println("�ǻ�:         "+wisdom);
    }

}