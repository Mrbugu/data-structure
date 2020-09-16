package 数据结构06Ring_list_and_Joseph;

public class Demo01 {
	public static void main(String[] args) {

		Boylist boylist = new Boylist();
		boylist.addBoy(5);
		boylist.showBoy();
		System.out.println("\n约瑟夫出圈：");
		boylist.yuesefuBoy(1, 2, 5);
		

	}

}

class Boylist {
	// fist节点
	private Boy first = null;

	// 添加小孩节点,构成单向环形链表
	public void addBoy(int nums) {
		if (nums < 1) {
			System.out.println("nums的值不正确");
			return;
		}
		Boy curBoy = null;// 辅助指针
		// for循环 创建环形链表
		for (int i = 1; i <= nums; i++) {
			// 根据编号,创建小孩节点
			Boy boy = new Boy(i);
			// 如果是第一个小孩
			if (i == 1) {
				first = boy;
				first.setNext(first);// 构成环
				curBoy = boy;// 让curBoy指向第一个小孩
			} else {
				curBoy.setNext(boy);
				boy.setNext(first);
				curBoy = boy;
			}

		}

	}

	/**
	 * 
	 * @param startNo  表示从第几个小孩开始数数
	 * @param countNum 表示数几下
	 * @param nums     表示最初有多少小孩在圈中
	 */
	public void yuesefuBoy(int startNo, int countNum, int nums) {
		if (first == null || startNo < 1 || startNo > nums) {
			System.out.println("参数输入有误");
			return;
		}
		Boy helper = first;
		// 需要一个辅助指针,事先指向环形链表最后的节点
		while (true) {
			if (helper.getNext() == first) {
				break;
			}
			helper = helper.getNext();
		}

		// 小孩报数前,先让 first和helper移动startNo-1
		for (int i = 0; i < startNo - 1; i++) {
			first = first.getNext();
			helper = helper.getNext();
		}

		while (true) {
			if (helper == first) {// 说明圈中只有一个节点
				break;
			}
			// 让 first和helper移动countNum-1
			for (int i = 0; i < countNum - 1; i++) {
				first = first.getNext();
				helper = helper.getNext();
			}
			// 这时候first指向的节点,就是要出圈的小孩节点
			System.out.println("小孩" + first.getNo() + "出圈");
			first = first.getNext();
			helper.setNext(first);
		}
		System.out.println("最后留在圈中的小孩编号为："+first.getNo());

	}

	// 遍历
	public void showBoy() {

		if (first == null) {
			System.out.println("链表为空,没有节点");
			return;
		}
		// first不能动,使用辅助指针
		Boy curBoy = first;
		while (true) {
			System.out.println("小孩的编号为：" + curBoy.getNo());
			if (curBoy.getNext() == first) {
				break;
			}
			curBoy = curBoy.getNext();
		}
	}

}

//Boy 节点
class Boy {
	private int no;
	private Boy next;

	public Boy(int no) {
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Boy getNext() {
		return next;
	}

	public void setNext(Boy next) {
		this.next = next;
	}

}
