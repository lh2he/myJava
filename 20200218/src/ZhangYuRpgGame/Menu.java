package ZhangYuRpgGame;

import java.util.Scanner;

public class Menu {
	public static void menu() {
        int[] human;
        int[] elf;
        int[] orcs;
        int[] dwarf;
        int[] element;
        human=new int[]{1,1,1,1,1,1};  //սʿ  ������  �̿�  ��ʿ  ��ʦ   �ٻ�ʦ
        elf=new int[]{0,0,1,1,1,1};
        orcs=new int[]{1,0,0,1,1,0};
        dwarf=new int[]{1,1,0,0,1,0};
        element=new int[]{0,0,0,0,1,1};
        String[] occupation ;          //�ַ���������ְҵ   ����ͨ��������ѡ����
        occupation=new String[]{"սʿ","������","�̿�","��ʿ","��ʦ","�ٻ�ʦ"};
        Character me=new Character();
        System.out.println("�������ɫ����");
        Scanner name = new Scanner(System.in);
        me.name = name.next();
        System.out.println("��ѡ���Ա�");
        System.out.println("1.����            2.Ů��");
        Scanner sex = new Scanner(System.in);
        int ch1=sex.nextInt();
        switch (ch1){
            case 1: me.sex="����"; break;
            case 2: me.sex="Ů��"; break;
        }
        System.out.println("����ѡ��");
        System.out.println("1.����   2.����   3.����   4.����    5.Ԫ��");
        System.out.print("��ѡ������");
        Scanner race = new Scanner(System.in);
        int ch2=race.nextInt();
        switch (ch2){            //swtich��ѡ������ʱ����ʾ��ѡ���ְҵ
            case 1:{
                me.race="����";
                System.out.println("��ѡ����"+me.race);
                System.out.print("�������ѡְҵΪ");
                for(int i=0;i<6;i++)   //��forѭ���ҳ� ֮ǰ�趨�õ� ����Ϊ1�����
                {
                    if(human[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);  //�������ڲ�Ϊ1ʱ�����ǰ���е�ְҵ����
                    }
                }

                System.out.print("��ѡ�����ְҵ��");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 2:{
                me.race="����";
                System.out.println("��ѡ����"+me.race);
                System.out.println("�������ѡְҵΪ");
                for(int i=0;i<6;i++)
                {
                    if(elf[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("��ѡ�����ְҵ��");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 3:{
                me.race="����";
                System.out.println("��ѡ����"+me.race);
                System.out.println("�������ѡְҵΪ");
                for(int i=0;i<6;i++)
                {
                    if(orcs[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("��ѡ�����ְҵ��");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 4:{
                me.race="����";
                System.out.println("��ѡ����"+me.race);
                System.out.println("�������ѡְҵΪ");
                for(int i=0;i<6;i++)
                {
                    if(dwarf[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("��ѡ�����ְҵ��");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 5:{
                me.race="Ԫ��";
                System.out.println("��ѡ����"+me.race);
                System.out.println("�������ѡְҵΪ");
                for(int i=0;i<6;i++)
                {
                    if(element[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("��ѡ�����ְҵ��");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
        }
        System.out.println("������Ľ�ɫ");
        System.out.println("============================");
        System.out.println("���ƣ�        "+me.name);
        System.out.println("�Ա�        "+me.sex);
        System.out.println("���壺        "+me.race);
        System.out.println("ְҵ��        "+me.occupy);
        Occupation m=new Occupation();
        m.shuxing(me);
    }
}
