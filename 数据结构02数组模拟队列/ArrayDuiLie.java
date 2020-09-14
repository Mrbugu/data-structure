package 数据结构02数组模拟队列;

public class ArrayDuiLie {
	private int maxsize;// 最大容量
	private int front;// 队列头
	private int rear;// 队列尾
	private int[] arr;// 存放数据,模拟队列
	
	//构造函数传入队列得最大长度
	public ArrayDuiLie(int max) {
		maxsize = max;
		arr = new int[maxsize];
		front = -1;//指向队列头得前一个位置
		rear = -1;//指向队列尾,指向队列尾的数据(队列最后一个数据)
	}

	// 判断队列是否满
	public boolean isFull() {
		return rear == maxsize - 1;
	}

	// 判断队列是否为空
	public boolean isKong() {
		return rear == front;
	}

	// 添加数据到队列
	public void isAdd(int n) {
		if (isFull()) {
			System.out.println("队列已满，不能加入数据！！！");
			return;
		}
		rear++;
		arr[rear] = n;
	}

	// 出队列
	public int isChu() {
		if (isKong()) {
			throw new RuntimeException("队列为空不能取出数据!!!");
		}
		front++;
		return arr[front];
	}

	// 显示队列
	public void show() {
		if (isKong()) {
			System.out.println("队列为空!!!");
			return;
		} 
		else {
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("arr[%d]=%d\n", i, arr[i]);
			}
		}
	}

	// 显示队列的头数据
	public int tou() {
		if (isKong()) {
			throw new RuntimeException("队列为空,没有数据");
		}
		return arr[front + 1];
	}

}
