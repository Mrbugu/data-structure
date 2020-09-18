package ���ݽṹ18Shell_Sort;

//����ʽ����λʽ
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ShellSort {
	public static void main(String[] args) {

//		int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
//		System.out.println("����ǰΪ��"+Arrays.toString(arr));
//		Sort2(arr);
//		System.out.println("�����Ϊ��"+Arrays.toString(arr));

		int[] arr = new int[80000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 8000000);
		}

		Date s1Date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1String = simpleDateFormat.format(s1Date);
		System.out.println("����ǰ��ʱ��Ϊ��" + s1String);
		Sort2(arr);
		Date s2Date = new Date();
		String s2String = simpleDateFormat.format(s2Date);
		System.out.println("������ʱ��Ϊ��" + s2String);

	}

	public static void Sort1(int[] arr) {
		int temp = 0;

		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i - gap; j >= 0; j -= gap) {
					if (arr[j] > arr[j + gap]) {
						temp = arr[j];
						arr[j] = arr[j + gap];
						arr[j + gap] = temp;
					}

				}
			}
		}

	}

	public static void Sort2(int[] arr) {
		
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j-gap]) {
					while(j-gap >=0 && temp < arr[j-gap]) {
						//�ƶ�
						arr[j] = arr[j-gap];
						j -= gap;
					}
					//���˳�whlieѭ��,�͸�temp�ҵ������λ��
					arr[j] = temp;
				}
			}
		}

	}
}
