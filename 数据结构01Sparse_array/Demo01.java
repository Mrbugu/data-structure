package ���ݽṹ01Sparse_array;

public class Demo01 {
	public static void main(String[] args) {
		//����һ����ά����,6*6
		//0��ʾû�����ӣ�1��ʾ���壬2��ʾ����
		int a = 5;
		int b = 6;
		int[][] array1 = new int[a][b];
		array1[1][2] = 1;
		array1[2][3] = 2;
		array1[3][4] = 2;
		array1[3][5] = 2;
		array1[0][0] = 1;
		array1[3][2] = 1;
		//���ԭ�еĶ�ά����
		System.out.println("ԭ  ʼ  ��  ��  �̣�6 * 6");
		for(int i = 0;i < array1.length;i++) {
			for(int j = 0;j < array1[0].length;j++) {
				if (j ==array1[0].length -1) {
					System.out.print(array1[i][j]+"\t");
					System.out.println();
				}else {
					System.out.print(array1[i][j]+"\t");
				}
			}
		}
		//������ά����,�õ���0���ݵĸ���
		int sum = 0;//��0���ݵĸ���
		for(int i = 0;i < array1.length;i++) {
			for(int j = 0;j < array1[0].length;j++) {
				if(array1[i][j] !=0) {
					sum++;
				}
			}		
		}
		System.out.println("\nԭ  ʼ  ��  ��  ��  0 ��  ��  ��  ��  ��  Ϊ��"+sum+"��");
		System.out.println();
		//������Ӧ��ϡ������
		int[][] array2 = new int[sum+1][3];
		//��ϡ�����鸳��ֵ
		array2[0][0] = a;
		array2[0][1] = b;
		array2[0][2] = sum;
		//����ԭʼ���飬��ϡ������ų�ֵ
		int count = 0;
		for(int i = 0;i < array1.length;i++) {
			for(int j = 0;j < array1[0].length;j++) {
				if(array1[i][j] !=0) {
					count++;
					array2[count][0] = i;
					array2[count][1] = j;
					array2[count][2] = array1[i][j];
				}
			}		
		}
		//���ϡ������
		System.out.println("ϡ  ��  ��  ��  Ϊ��");
		for(int i = 0;i < array2.length;i++) {
			for(int j = 0;j < array2[0].length;j++) {
				if (j ==array2[0].length -1) {
					System.out.print(array2[i][j]+"\t");
					System.out.println();
				}else {
					System.out.print(array2[i][j]+"\t");
				}
			}
		}
		//��ԭϡ������
		int[][] array3 = new int[array2[0][0]][array2[0][1]];
		
		for(int i = 1;i < array2.length;i++) {
			for(int j = 0;j < array2[0].length;j++) {
				if (array2[i][2] !=0) {
					array3[array2[i][0]][array2[i][1]] = array2[i][2];
				}
			}
		}
		//�ָ��������
		System.out.println("\n�ָ���Ķ�ά���飺");
		for(int i = 0;i < array3.length;i++) {
			for(int j = 0;j < array3[0].length;j++) {
				if (j ==array3[0].length -1) {
					System.out.print(array3[i][j]+"\t");
					System.out.println();
				}else {
					System.out.print(array3[i][j]+"\t");
				}
			}
		}
		
		

	}

}
