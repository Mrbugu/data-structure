package ���ݽṹ03Array_to_simulate_ring_queue;

public class ArrayDuiLie {
	private int maxsize;// �������
	private int front;// ����ͷ
	private int rear;// ����β
	private int[] arr;// �������,ģ�����
	
	//���캯��������е���󳤶�
	public ArrayDuiLie(int max) {
		maxsize = max;
		arr = new int[maxsize];
		front = 0;//ָ�����ͷ  arr[front] ���Ƕ��еõ�һ��Ԫ��
		rear = 0;//ָ�����β����һ��λ��,
	}

	// �ж϶����Ƿ���
	public boolean isFull() {
		return (rear+1)%maxsize == front;
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
		arr[rear] = n;
		rear = (rear+1)%maxsize ;
	}

	// ������
	public int isChu() {
		if (isKong()) {
			throw new RuntimeException("����Ϊ�ղ���ȡ������!!!");
		}
		int value = arr[front];
		front = (front+1)%maxsize;
		return value;
	}

	// ��ʾ����
	public void show() {
		if (isKong()) {
			System.out.println("����Ϊ��!!!");
			return;
		} 
		else {
			for (int i = front; i < front+size(); i++) {
				System.out.printf("arr[%d]=%d\n", i%maxsize, arr[i%maxsize]);
			}
		}
	}
	
	//��ǰ���е���Ч����
	public int size() {
		return (rear-front+maxsize)%maxsize;
	}

	// ��ʾ���е�ͷ����
	public int tou() {
		if (isKong()) {
			throw new RuntimeException("����Ϊ��,û������");
		}
		return arr[front];
	}

}
