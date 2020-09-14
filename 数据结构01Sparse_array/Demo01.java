package 数据结构01Sparse_array;

public class Demo01 {
	public static void main(String[] args) {
		//创建一个二维数组,6*6
		//0表示没有棋子，1表示黑棋，2表示白棋
		int a = 5;
		int b = 6;
		int[][] array1 = new int[a][b];
		array1[1][2] = 1;
		array1[2][3] = 2;
		array1[3][4] = 2;
		array1[3][5] = 2;
		array1[0][0] = 1;
		array1[3][2] = 1;
		//输出原有的二维数组
		System.out.println("原  始  的  棋  盘：6 * 6");
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
		//遍历二维数组,得到非0数据的个数
		int sum = 0;//非0数据的个数
		for(int i = 0;i < array1.length;i++) {
			for(int j = 0;j < array1[0].length;j++) {
				if(array1[i][j] !=0) {
					sum++;
				}
			}		
		}
		System.out.println("\n原  始  棋  盘  非  0 数  据  的  个  数  为："+sum+"个");
		System.out.println();
		//创建对应的稀疏数组
		int[][] array2 = new int[sum+1][3];
		//给稀疏数组赋初值
		array2[0][0] = a;
		array2[0][1] = b;
		array2[0][2] = sum;
		//遍历原始数组，给稀疏数组放初值
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
		//输出稀疏数组
		System.out.println("稀  疏  数  组  为：");
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
		//还原稀疏数组
		int[][] array3 = new int[array2[0][0]][array2[0][1]];
		
		for(int i = 1;i < array2.length;i++) {
			for(int j = 0;j < array2[0].length;j++) {
				if (array2[i][2] !=0) {
					array3[array2[i][0]][array2[i][1]] = array2[i][2];
				}
			}
		}
		//恢复后的棋盘
		System.out.println("\n恢复后的二维数组：");
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
