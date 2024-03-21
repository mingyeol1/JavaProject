//소스파일 Dog.java

import java.util.TreeSet;

import compare.DogComparator;
import obj.Dog;

public class E09_objectCompareEx {

	public static void main(String[] args) {
		// 비교 객체 확인.
		//객체간 동등비교가 잘 되는지
		Dog d1 = new Dog("진돗개", "뽀삐",15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐",15);
	
		//Dog d3와 d1의 비교
		System.out.println(d1 == d3);	//주소값(메모리 위치)이 달라 false (똑같은 d1원이여야 true)
		System.out.println(d1.equals(d3));	//객체비교는 equals로 하기. //동일한 값. //해쉬코드와 이콜즈 수정.
		System.out.println(d1);
		System.out.println(d3);
		//객체 동등 비교를 위한 Dog 클래스. .//Comparable 인터페이스를 구현한 경우
		TreeSet<Dog> treeTest = new TreeSet<>();
		System.out.println(treeTest.add(d1));
		System.out.println(treeTest.add(d2));
		for(Dog dog : treeTest) {
			System.out.println(dog);
		}
		//Comparator를 이용한 경우.
		System.out.println("================================");
		TreeSet<Dog> treeTest2 = new TreeSet<Dog>(new DogComparator());
		System.out.println(treeTest2.add(d1));
		System.out.println(treeTest2.add(d2));
		for(Dog dog : treeTest2) {
			System.out.println(dog);
		}
	}

}
