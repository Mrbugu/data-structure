package ���ݽṹ06Ring_list_and_Joseph;

public class Demo01 {
	public static void main(String[] args) {

		Boylist boylist = new Boylist();
		boylist.addBoy(5);
		boylist.showBoy();
		System.out.println("\nԼɪ���Ȧ��");
		boylist.yuesefuBoy(1, 2, 5);
		

	}

}

class Boylist {
	// fist�ڵ�
	private Boy first = null;

	// ���С���ڵ�,���ɵ���������
	public void addBoy(int nums) {
		if (nums < 1) {
			System.out.println("nums��ֵ����ȷ");
			return;
		}
		Boy curBoy = null;// ����ָ��
		// forѭ�� ������������
		for (int i = 1; i <= nums; i++) {
			// ���ݱ��,����С���ڵ�
			Boy boy = new Boy(i);
			// ����ǵ�һ��С��
			if (i == 1) {
				first = boy;
				first.setNext(first);// ���ɻ�
				curBoy = boy;// ��curBoyָ���һ��С��
			} else {
				curBoy.setNext(boy);
				boy.setNext(first);
				curBoy = boy;
			}

		}

	}

	/**
	 * 
	 * @param startNo  ��ʾ�ӵڼ���С����ʼ����
	 * @param countNum ��ʾ������
	 * @param nums     ��ʾ����ж���С����Ȧ��
	 */
	public void yuesefuBoy(int startNo, int countNum, int nums) {
		if (first == null || startNo < 1 || startNo > nums) {
			System.out.println("������������");
			return;
		}
		Boy helper = first;
		// ��Ҫһ������ָ��,����ָ�����������Ľڵ�
		while (true) {
			if (helper.getNext() == first) {
				break;
			}
			helper = helper.getNext();
		}

		// С������ǰ,���� first��helper�ƶ�startNo-1
		for (int i = 0; i < startNo - 1; i++) {
			first = first.getNext();
			helper = helper.getNext();
		}

		while (true) {
			if (helper == first) {// ˵��Ȧ��ֻ��һ���ڵ�
				break;
			}
			// �� first��helper�ƶ�countNum-1
			for (int i = 0; i < countNum - 1; i++) {
				first = first.getNext();
				helper = helper.getNext();
			}
			// ��ʱ��firstָ��Ľڵ�,����Ҫ��Ȧ��С���ڵ�
			System.out.println("С��" + first.getNo() + "��Ȧ");
			first = first.getNext();
			helper.setNext(first);
		}
		System.out.println("�������Ȧ�е�С�����Ϊ��"+first.getNo());

	}

	// ����
	public void showBoy() {

		if (first == null) {
			System.out.println("����Ϊ��,û�нڵ�");
			return;
		}
		// first���ܶ�,ʹ�ø���ָ��
		Boy curBoy = first;
		while (true) {
			System.out.println("С���ı��Ϊ��" + curBoy.getNo());
			if (curBoy.getNext() == first) {
				break;
			}
			curBoy = curBoy.getNext();
		}
	}

}

//Boy �ڵ�
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
