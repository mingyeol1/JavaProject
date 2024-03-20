package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quiz_240320 {

	public static void main(String[] args) {
//		  [[[1. 집합 문제.... ]]] 
//	                다음의 리스트를 생성한 요구한 내용을 작성하세요
//	    ArrayList1 : [1,2,3,4,5,6]
//	    ArrayList2 : [4,5,6,7,8,9]
//
//		List ArrayList1 = new ArrayList();
//		List ArrayList2 = new ArrayList();
//		ArrayList1.add(1);
//		ArrayList1.add(2);
//		ArrayList1.add(3);
//		ArrayList1.add(4);
//		ArrayList1.add(5);
//		ArrayList1.add(6);
//		
//		ArrayList2.add(4);
//		ArrayList2.add(5);
//		ArrayList2.add(6);
//		ArrayList2.add(7);
//		ArrayList2.add(8);
//		ArrayList2.add(9);
//		//ArrayList1.addAll(ArrayList2);
//		//ArrayList2.removeAll(ArrayList1);
//		//ArrayList1.removeAll(ArrayList2);
//		ArrayList2.retainAll(ArrayList1);
//		System.out.println("교집합"+ArrayList2);
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
//		List list1 = Arrays.asList(arr1);
//		List list2 = Arrays.asList(arr2);
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for(int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
			list1.add(arr2[i]);
		}
		System.out.println("ArrayList1"+list1);
		System.out.println("ArrayList2"+list2);
//	    두 리스트의 합집합, 교집합, 차집합을 구해서 출력해 보세요. 
//	    합집합 : [1,2,3,4,5,6,7,8,9]
//	    교집합 : [4,5,6]
//	    차집합 : [1,2,3],[7,8,9]
		
			
		}
		
		
		
//
//	   [[[2. 로또 번호 생성하기]]]
//	    TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
//	     1. TreeSet을 생성하세요
//	     2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요. 
//	     3. 발생한 난수를 추가합니다. 
//	     4. 크기가 6이되면 무한 루프를 빠져 나옵니다.
		
			
		
	}


