package ���ݽṹ04One_way_linked_list;

public class Demo01 {
	public static void main(String[] args) {

		// �ȴ����ڵ�
		HeroNode heroNode1 = new HeroNode(1, "�ν�", "��ʱ��");
		HeroNode heroNode2 = new HeroNode(2, "¬����", "������");
		HeroNode heroNode3 = new HeroNode(3, "����", "�Ƕ���");
		HeroNode heroNode4 = new HeroNode(4, "�ֳ�", "����ͷ");

		HeroNodelist heroNodelist = new HeroNodelist();
		// ��ͨ����
//		heroNodelist.add(heroNode1);
//		heroNodelist.add(heroNode2);
//		heroNodelist.add(heroNode4);
//		heroNodelist.add(heroNode3);
		//�������
		heroNodelist.add2(heroNode3);
		heroNodelist.add2(heroNode1);
		heroNodelist.add2(heroNode4);
		heroNodelist.add2(heroNode2);
//		heroNodelist.add2(heroNode2);
		// ��ʾ
		heroNodelist.show();
		
		heroNodelist.getHead();
//		//�޸�
//		HeroNode xiugaiHeroNode = new HeroNode(2,"С¬","������~~");
//		heroNodelist.xiugai(xiugaiHeroNode);
//		System.out.println("�޸ĺ����ϢΪ��");
//		heroNodelist.show();
//		
		//ɾ��
		heroNodelist.shanchu(3);
		heroNodelist.shanchu(2);
//		heroNodelist.shanchu(1);
//		heroNodelist.shanchu(4);
		System.out.println("ɾ�������ϢΪ��");
		heroNodelist.show();

	}

}

//����HeroNodelist�������ǵ�Ӣ��
class HeroNodelist {

	// �ȳ�ʼ��ͷ�ڵ�,ͷ�ڵ㲻Ҫ��,����ž���ľ�
	private HeroNode head = new HeroNode(0, "", "");
	
	//����ͷ�ڵ�
	public HeroNode getHead() {
		return head;
	}

	//��ͨ����
	// ��ӽڵ㵽�������� ˼·���������Ǳ��˳���ʱ�� 1.�ҵ���ǰ��������ڵ� 2.���������ڵ��nextָ���µĽڵ�
	public void add(HeroNode heroNode) {
		// ��Ϊhead�ڵ㲻�ܶ������������Ҫһ����������temp
		HeroNode temp = head;
		// ���������ҵ����
		while (true) {
			// �ҵ���������
			if (temp.next == null) {
				break;
			}
			// ���û���ҵ����temp����
			temp = temp.next;
		}
		// ���Ƴ�whileѭ��ʱ��temp��ָ������������
		// �����ڵ��nextָ���µĽڵ�
		temp.next = heroNode;
	}
	//����������Ӣ����ӵ�ָ��λ��
	public void add2(HeroNode heroNode) {
		HeroNode temp = head;//��������,��Ϊͷ�ڵ㲻�ܶ� 
		boolean flag = false;//��־��ӵı���Ƿ����,Ĭ��Ϊfalse
		while (true) {
			if (temp.next == null) {//˵��temp�Ѿ��������
				break;
			}
			if (temp.next.no > heroNode.no) {//λ���ҵ��ˣ�����temp�ĺ������
				break;
			}else if (temp.next.no == heroNode.no) {//ϣ����ӵı���Ѿ�����
				flag = true;//˵������Ѿ�����
				break;
			}
			temp = temp.next;
			
		}
		//�ж�flag��ֵ
		if (flag) {//�������
			System.out.printf("Ӣ�۱��%d�Ѿ����ڣ��������\n",heroNode.no);
		}else {//�嵽�ڵ���,temp����
			heroNode.next = temp.next;
			temp.next = heroNode;
		}

	}
	
	//ɾ��       �ҵ��Ĵ�ɾ���ڵ��ǰһ���ڵ�temp
	public void shanchu(int no) {
		HeroNode temp = head;
		boolean flag = false;//��־�Ƿ��ҵ���ɾ���Ľڵ�
		while(true) {
			if (temp.next == null) {//�Ѿ�����������
				break;
			}
			if (temp.next.no == no) {
				//�ҵ��Ĵ�ɾ���ڵ��ǰһ���ڵ�temp
				flag = true;
				break;
			}
			temp = temp.next;//temp����,����
		}
		//�ж�flag
		if (flag) {//�ҵ�
			//����ɾ��
			temp.next = temp.next.next;
		}else {
			System.out.printf("Ҫɾ����%d�ڵ㲻����\n",no);
		}
	}
	
	//�޸���Ϣ
	public void xiugai(HeroNode xiugaiHeroNode) {
		HeroNode temp = head.next;
		boolean flag = false;
		while(true) {
			//û�ҵ�
			if (temp == null) {
				break;
			}
			//�ҵ���
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
			System.out.printf("û���ҵ����Ϊ%d�Ľڵ㣬�����޸�\n",xiugaiHeroNode.no);
		}
	}

	// ��ʾ����������
	public void show() {
		if (head.next == null) {
			System.out.println("����Ϊ��");
			return;
		}
		// ��Ϊͷ�ڵ㲻�ܶ�,�����ø�������������
		HeroNode temp = head.next;
		while (true) {
			// �ж������Ƿ����
			if (temp == null) {
				break;
			}
			// ����ڵ����Ϣ
			System.out.println(temp);
			temp = temp.next;
		}
	}
}

//����HeroNdoe,ÿһ��HeroNode  �������һ���ڵ�
class HeroNode {
	public int no;
	public String name;
	public String waihaoname;
	public HeroNode next;// ָ����һ���ڵ�

	public HeroNode(int no, String name, String waihaoname) {
		this.no = no;
		this.name = name;
		this.waihaoname = waihaoname;
	}

	// Ϊ����ʾ����,��дtoString����
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", waihaoname=" + waihaoname + "]";
	}

}
