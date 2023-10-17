package com.sunbeam;

public class ArrayMinimum {

	static <T extends Number> T findMin(T[] arr) {
		T small = arr[0];
		for (T ele : arr)
			if (small.doubleValue() > ele.doubleValue()) {
				small = ele;
			}

		return small;

	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println(min1);
		System.out.println(min2);
	}

}
