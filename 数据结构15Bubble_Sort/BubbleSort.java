package ���ݽṹ15Bubble_Sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

//ʱ�临�Ӷ� O(n^2)
public class BubbleSort {
	public static void main(String[] args) {

		int arr[] = { 1, -10, 55, 66, 15, 45 };
		System.out.println("ԭ����Ϊ��"+Arrays.toString(arr));
		Sort(arr);
		System.out.println("�����Ϊ��"+Arrays.toString(arr));


		
		
//		int[] arr = new int[80000];
		//������Ļ�ȡ
//		Random s1Random = new Random();
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = s1Random.nextInt(8000000);
//		}

//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random()*8000000);
//		}
//
//		Date date1Date = new Date();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String date1String = simpleDateFormat.format(date1Date);
//		System.out.println("����ǰ��ʱ��Ϊ��" + date1String);
//		Sort(arr);
//		Date date2Date = new Date();
//		String date2String = simpleDateFormat.format(date2Date);
//		System.out.println("������ʱ��Ϊ��" + date2String);

//		System.out.println(Arrays.toString(arr));

	}

	public static void Sort(int[] arr) {
		int temp;
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
			if (!flag) {// ���û�н���һ��,֤���Ѿ��������,���˳�ѭ��
				break;
			} else {
				flag = false;
			}

		}

	}

}
