package 数据结构17Insert_Sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class InsertSort {
	public static void main(String[] args) {

//		int[] arr = { 100, 22, 5, 55, 100, -11, 8888, 12 };
//		Sort(arr);
//		System.out.println(Arrays.toString(arr));

		int[] arr = new int[80000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 8000000);
		}

		Date s1Date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1String = simpleDateFormat.format(s1Date);
		System.out.println("排序前的时间为：" + s1String);
		Sort(arr);
		Date s2Date = new Date();
		String s2String = simpleDateFormat.format(s2Date);
		System.out.println("排序后的时间为：" + s2String);

	}

	public static void Sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int insertVal = arr[i];
			int insertIndex = i - 1;
			while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			if (insertIndex+1 != i) {
				arr[insertIndex + 1] = insertVal;
			}

		}

	}
}
