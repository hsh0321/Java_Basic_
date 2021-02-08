package Technic;

import java.util.*;

public class _Sort_Basic {
	public static void main(String[] args) {
		Integer[] arr = {1, 26, 17, 25, 99, 44, 303};

		Arrays.sort(arr); // 오름차순
		System.out.println("Sorted arr[] : " + Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder()); // 내림차순
		System.out.println("Sorted arr[] : " + Arrays.toString(arr));
	
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(7);
		arrList.add(1);
		arrList.add(4);
		// 리스트를 정렬합니다.
		Collections.sort(arrList);
		System.out.println("Sorted arr[] : " + arrList);
		Collections.sort(arrList,Collections.reverseOrder());
		System.out.println("Sorted arr[] : " + arrList);
		
	}
}
