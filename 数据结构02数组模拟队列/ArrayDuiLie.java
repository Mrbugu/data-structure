package ���ݽṹ02����ģ�����;

public class ArrayDuiLie {
	private int maxsize;// �������
	private int front;// ����ͷ
	private int rear;// ����β
	private int[] arr;// �������,ģ�����
	
	//���캯��������е���󳤶�
	public ArrayDuiLie(int max) {
		maxsize = max;
		arr = new int[maxsize];
		front = -1;//ָ�����ͷ��ǰһ��λ��
		rear = -1;//ָ�����β,ָ�����β������(�������һ������)
	}

	// �ж϶����Ƿ���
	public boolean isFull() {
		return rear == maxsize - 1;
	}

	// �ж϶����Ƿ�Ϊ��
	public boolean isKong() {
		return rear == front;
	}

	// ������ݵ�����
	public void isAdd(int n) {
		if (isFull()) {
			System.out.println("�������������ܼ������ݣ�����");
			return;
		}
		rear++;
		arr[rear] = n;
	}

	// ������
	public int isChu() {
		if (isKong()) {
			throw new RuntimeException("����Ϊ�ղ���ȡ������!!!");
		}
		front++;
		return arr[front];
	}

	// ��ʾ����
	public void show() {
		if (isKong()) {
			System.out.println("����Ϊ��!!!");
			return;
		} 
		else {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("arr[%d]=%d\n", i, arr[i]);
			}
		}
	}

	// ��ʾ���е�ͷ����
	public int tou() {
		if (isKong()) {
			throw new RuntimeException("����Ϊ��,û������");
		}
		return arr[front + 1];
	}

}
