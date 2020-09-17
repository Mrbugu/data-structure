package 数据结构16Select_Sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {
	public static void main(String[] args) {

		int[] arr = { 33,20,-12,44,18 };
		System.out.println("排序前：" + Arrays.toString(arr));
		Sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));

//		int[] arr = new int[80000];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 8000000);
//		}
//
//		Date date1Date = new Date();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String date1String = simpleDateFormat.format(date1Date);
//		System.out.println("排序前的时间为：" + date1String);
//		Sort(arr);
//		Date date2Date = new Date();
//		String date2String = simpleDateFormat.format(date2Date);
//		System.out.println("排序后的时间为：" + date2String);


	}

	public static void Sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			int min = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					minIndex = j;
					min = arr[j];
				}
			}
			// 交换值
			arr[minIndex] = arr[i];
			arr[i] = min;
		}

	}

}
