package 数据结构04One_way_linked_list;

public class Demo01 {
	public static void main(String[] args) {

		// 先创建节点
		HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
		HeroNode heroNode2 = new HeroNode(2, "卢俊义", "玉麒麟");
		HeroNode heroNode3 = new HeroNode(3, "吴用", "智多星");
		HeroNode heroNode4 = new HeroNode(4, "林冲", "豹子头");

		HeroNodelist heroNodelist = new HeroNodelist();
		// 普通加入
//		heroNodelist.add(heroNode1);
//		heroNodelist.add(heroNode2);
//		heroNodelist.add(heroNode4);
//		heroNodelist.add(heroNode3);
		//排序加入
		heroNodelist.add2(heroNode3);
		heroNodelist.add2(heroNode1);
		heroNodelist.add2(heroNode4);
		heroNodelist.add2(heroNode2);
//		heroNodelist.add2(heroNode2);
		// 显示
		heroNodelist.show();
		
		heroNodelist.getHead();
//		//修改
//		HeroNode xiugaiHeroNode = new HeroNode(2,"小卢","玉麒麟~~");
//		heroNodelist.xiugai(xiugaiHeroNode);
//		System.out.println("修改后的信息为：");
//		heroNodelist.show();
//		
		//删除
		heroNodelist.shanchu(3);
		heroNodelist.shanchu(2);
//		heroNodelist.shanchu(1);
//		heroNodelist.shanchu(4);
		System.out.println("删除后的信息为：");
		heroNodelist.show();

	}

}

//定义HeroNodelist管理我们得英雄
class HeroNodelist {

	// 先初始化头节点,头节点不要动,不存放具体的据
	private HeroNode head = new HeroNode(0, "", "");
	
	//返回头节点
	public HeroNode getHead() {
		return head;
	}

	//普通加入
	// 添加节点到单向链表 思路：当不考虑编号顺序的时候 1.找到当前链表的最后节点 2.将最后这个节点的next指向新的节点
	public void add(HeroNode heroNode) {
		// 因为head节点不能动，因此我们需要一个辅助变量temp
		HeroNode temp = head;
		// 遍历链表找到最后
		while (true) {
			// 找到链表的最后
			if (temp.next == null) {
				break;
			}
			// 如果没有找到最后将temp后移
			temp = temp.next;
		}
		// 当推出while循环时，temp就指向了链表的最后
		// 将最后节点的next指向新的节点
		temp.next = heroNode;
	}
	//根据排名将英雄添加到指定位置
	public void add2(HeroNode heroNode) {
		HeroNode temp = head;//辅助变量,因为头节点不能动 
		boolean flag = false;//标志添加的编号是否存在,默认为false
		while (true) {
			if (temp.next == null) {//说明temp已经在最后了
				break;
			}
			if (temp.next.no > heroNode.no) {//位置找到了，就在temp的后面插入
				break;
			}else if (temp.next.no == heroNode.no) {//希望添加的标号已经存在
				flag = true;//说明编号已经存在
				break;
			}
			temp = temp.next;
			
		}
		//判断flag的值
		if (flag) {//不能添加
			System.out.printf("英雄编号%d已经存在，不能添加\n",heroNode.no);
		}else {//插到节点中,temp后面
			heroNode.next = temp.next;
			temp.next = heroNode;
		}

	}
	
	//删除       找到的待删除节点的前一个节点temp
	public void shanchu(int no) {
		HeroNode temp = head;
		boolean flag = false;//标志是否找到待删除的节点
		while(true) {
			if (temp.next == null) {//已经到链表的最后
				break;
			}
			if (temp.next.no == no) {
				//找到的待删除节点的前一个节点temp
				flag = true;
				break;
			}
			temp = temp.next;//temp后移,遍历
		}
		//判断flag
		if (flag) {//找到
			//可以删除
			temp.next = temp.next.next;
		}else {
			System.out.printf("要删除的%d节点不存在\n",no);
		}
	}
	
	//修改信息
	public void xiugai(HeroNode xiugaiHeroNode) {
		HeroNode temp = head.next;
		boolean flag = false;
		while(true) {
			//没找到
			if (temp == null) {
				break;
			}
			//找到了
			if (temp.no == xiugaiHeroNode.no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		
		if (flag) {
			temp.name = xiugaiHeroNode.name;
			temp.waihaoname = xiugaiHeroNode.waihaoname;
		}else {
			System.out.printf("没有找到编号为%d的节点，不能修改\n",xiugaiHeroNode.no);
		}
	}

	// 显示链表（遍历）
	public void show() {
		if (head.next == null) {
			System.out.println("链表为空");
			return;
		}
		// 因为头节点不能动,所以用辅助变量来遍历
		HeroNode temp = head.next;
		while (true) {
			// 判断链表是否到最后
			if (temp == null) {
				break;
			}
			// 输出节点的信息
			System.out.println(temp);
			temp = temp.next;
		}
	}
}

//定义HeroNdoe,每一个HeroNode  对象就是一个节点
class HeroNode {
	public int no;
	public String name;
	public String waihaoname;
	public HeroNode next;// 指向下一个节点

	public HeroNode(int no, String name, String waihaoname) {
		this.no = no;
		this.name = name;
		this.waihaoname = waihaoname;
	}

	// 为了显示方法,重写toString方法
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", waihaoname=" + waihaoname + "]";
	}

}
