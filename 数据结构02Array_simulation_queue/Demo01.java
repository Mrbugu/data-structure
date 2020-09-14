package 数据结构02Array_simulation_queue;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {

		ArrayDuiLie arrayDuiLie = new ArrayDuiLie(3);
		char key = ' ';// 接收用户的收入
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("s(show):显示队列");
			System.out.println("e(exit):退出程序");
			System.out.println("a(add):添加数据");
			System.out.println("g(get):取出数据");
			System.out.println("h(head):查看头");
			key = scanner.next().charAt(0);// 先键盘输入，然后接收输入得第0个字符 并把它转成char返回
			switch (key) {
			case 's':// 显示
				arrayDuiLie.show();
				break;
			case 'a':// 添加
				System.out.println("请输入一个数");
				int value = scanner.nextInt();
				arrayDuiLie.isAdd(value);
				break;
			case 'g':// 取出
				try {
					int res = arrayDuiLie.isChu();
					System.out.printf("去除得数据是%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h':// 查看头
				try {
					int res = arrayDuiLie.tou();
					System.out.printf("队列头得数据是%d\n", res);
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
		System.out.println("程序退出");
	}

}
