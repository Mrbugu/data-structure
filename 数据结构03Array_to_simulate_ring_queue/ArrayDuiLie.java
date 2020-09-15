package 数据结构03Array_to_simulate_ring_queue;

public class ArrayDuiLie {
	private int maxsize;// 最大容量
	private int front;// 队列头
	private int rear;// 队列尾
	private int[] arr;// 存放数据,模拟队列
	
	//构造函数传入队列得最大长度
	public ArrayDuiLie(int max) {
		maxsize = max;
		arr = new int[maxsize];
		front = 0;//指向队列头  arr[front] 就是队列得第一个元素
		rear = 0;//指向队列尾的下一个位置,
	}

	// 判断队列是否满
	public boolean isFull() {
		return (rear+1)%maxsize == front;
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
		arr[rear] = n;
		rear = (rear+1)%maxsize ;
	}

	// 出队列
	public int isChu() {
		if (isKong()) {
			throw new RuntimeException("队列为空不能取出数据!!!");
		}
		int value = arr[front];
		front = (front+1)%maxsize;
		return value;
	}

	// 显示队列
	public void show() {
		if (isKong()) {
			System.out.println("队列为空!!!");
			return;
		} 
		else {
			for (int i = front; i < front+size(); i++) {
				System.out.printf("arr[%d]=%d\n", i%maxsize, arr[i%maxsize]);
			}
		}
	}
	
	//当前队列得有效个数
	public int size() {
		return (rear-front+maxsize)%maxsize;
	}

	// 显示队列的头数据
	public int tou() {
		if (isKong()) {
			throw new RuntimeException("队列为空,没有数据");
		}
		return arr[front];
	}

}
