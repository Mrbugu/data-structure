package ���ݽṹ02Array_simulation_queue;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {

		ArrayDuiLie arrayDuiLie = new ArrayDuiLie(3);
		char key = ' ';// �����û�������
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("s(show):��ʾ����");
			System.out.println("e(exit):�˳�����");
			System.out.println("a(add):�������");
			System.out.println("g(get):ȡ������");
			System.out.println("h(head):�鿴ͷ");
			key = scanner.next().charAt(0);// �ȼ������룬Ȼ���������õ�0���ַ� ������ת��char����
			switch (key) {
			case 's':// ��ʾ
				arrayDuiLie.show();
				break;
			case 'a':// ���
				System.out.println("������һ����");
				int value = scanner.nextInt();
				arrayDuiLie.isAdd(value);
				break;
			case 'g':// ȡ��
				try {
					int res = arrayDuiLie.isChu();
					System.out.printf("ȥ����������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h':// �鿴ͷ
				try {
					int res = arrayDuiLie.tou();
					System.out.printf("����ͷ��������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'e':
				scanner.close();
				loop = false;
				break;

			default:
				break;
			}
		}
		System.out.println("�����˳�");
	}

}
