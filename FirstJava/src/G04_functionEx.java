import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

import obj.inheritance.goodcase.Student;

public class G04_functionEx {

	/*
	 * Function 인터페이스는 매개변수와 리턴값이 모두 있는 추상 메서드 apply를 가지고 있음.
	 * Function인터페이스는 주로 매개변수로 받은 값을 리턴값으로 매핑하여 사용.
	 * 
	 * 
	 * xxx 는 기본자료형.		R은 리턴
	 * 		
	 * 		인터페이스					메서드
	 * 	Function<T,R>				R apply(T t)
	 * 	BiFunction<T,U,R>			R apply(T t, U u)
	 * 	xxxFunction<R>				R apply(xxx X)
	 *	xxxToyyyFunction			yyy applyAs(yyy)apply(xxx x)   ex) double apply applyAsDouble(int x)
	 *	ToxxxBiFunction<T, U>		xxx applyAsxxx(T t, U u)
	 *	ToxxxFunction<T>			xxx applyAsxxx(T t)	
	 *
	 *
	*/
	
	
	static Student[] list = {
			new Student("홍길동", 20, "2403251","컴공"),
			new Student("이순신", 32, "2403252", "통계")
	};
	
	public static void main(String[] args) {
		System.out.print("학생명 : ");
		printString(t -> t.getName());	//t가 매개변수 t.getName 이 반환타입
		System.out.print("전공 : ");		
		printString(t -> t.getMajor());	//t가 매개변수 t.getMajor 이 반환타입
		System.out.print("나이 : ");		
		printInt(t -> t.age);			//t가 매개변수 t.age 이 반환타입
		System.out.print("나이 합계 : ");	
		printTot(t -> t.age);			//t가 매개변수 t.age 이 반환타입	
		System.out.print("평균 : ");	
		printAvg(t -> t.age);			//t가 매개변수 t.age 이 반환타입
	}
	
	
	static void printAvg() {
		ToDoubleFunction<Student> f = t -> t.age;
		double sum = 0;
		for(Student s:list) {
			}
	System.out.println(sum/list.length);
	}
	
	static void printAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for (Student s:list) {
			sum += f.applyAsDouble(s);
		}
		System.out.println(sum/list.length);
	}
	
	static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	//			(매개변수),(반환타입)
	//Function<Student, Integer> f = t -> t.age;
	static void printInt(Function<Student, Integer> f) {
		for(Student s: list) {
			System.out.println(f.apply(s)+ " ");
		}
	}
	
	static void printString(Function<Student, String> f) {
		for(Student s : list) {
			System.out.printf(f.apply(s)+" ");
		}
		System.out.println();
	}
}
