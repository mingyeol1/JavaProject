package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import util.closer;

public class cusm {
	static Rain cus = new Rain();
	static Scanner sc = new Scanner(System.in);
	public static void coust() {
		cus.InsertCustomer(sc.next());
		cus.save();
	}
	
public static void main(String[] args) {
	Rain ra = new Rain();
	
	
	
        
        while (true) {
			System.out.println("==== 고객 정보 ====");			
			System.out.println("1. 고객 저장");
			System.out.println("2. 고객정보 보기");
			System.out.println("3. 고객정보 수정");
			System.out.println("4. 고객정보 삭제");
			System.out.println("5. 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				coust();;
				break;
			case 2:
				ra.SelectCustomer();
				break;
			case 3:
				ra.UpdateCustome();
				break;
			case 4:
				ra.DeleteCustomer();
				break;
			case 5:
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 선택을 잘못했습니다.");
				break;
			}
		}		
	

		
	
	
	
	
	
	
	
	}
}
class Rain{
	 Scanner scan = new Scanner(System.in);
	List<Rain> r = new ArrayList<>();
	
	File saveFile = null;
	String savePath = "saveFile/customerManager.txt";
	public Rain() {
		r = new ArrayList<>();
		saveFile = new File(savePath);
		if(!saveFile.exists()) {
			File dir = new File(saveFile.getParent());
			dir.mkdirs();
		}
		load();
	};
	
	
	
	
	 public void save() {
		 FileOutputStream fos = null; //저장
			ObjectOutputStream oos = null;
			try {									//배열 객체를 전달하기도 함.
				fos = new FileOutputStream("customerManager.txt");
				oos = new ObjectOutputStream(fos);
				
				System.out.println("Customer 데이터가 저장되었습니다.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					if(oos != null) oos.close();
				} catch (IOException e2) {}
			}
	    }
	
		
	

	private void load() {
		BufferedReader in = null;
	try {
		in = new BufferedReader(new FileReader(saveFile));
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}











	private String name;
	private String gender;
	private String email;
	private int year;
	
	
	
	
	public Rain(String name, String gender, String email, int year) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.year = year;
	}
	public void InsertCustomer(String cus) {
		//회원 저장
		scan.nextLine();
		System.out.println("===== 회원 정보 등록 =====");
		
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		
		System.out.print("성별(남 : M, 여 : F ) 입력 : ");
		String gender = scan.nextLine();
	
		System.out.print("이메일 입력 : ");
		String email = scan.nextLine();
		
		System.out.print("생년월일 입력 : ");
		int year = scan.nextInt();
		
		Rain cus1 = new Rain(name, gender, email, year);
		r.add(cus1);
		System.out.println("정보가 저장 되었습니다.");
	}
	
	public void SelectCustomer() {
		
			System.out.println("이름을 입력하세요");
			System.out.print(">> ");
			String name = scan.next();
			
			for(int i =0; i <r.size(); i++) {
				Rain cus = r.get(i);
				String cusName = cus.getName();
				
				if(cusName.equals(name)) {
					System.out.println("[ 이름 : "+name+", 성별 : "+cus.getGender()+", 이메일 : "+cus.getEmail()+", 생년월일 : "+cus.getYear()+"]");
					break;
				}else {
					System.out.println(name +"님은 정보가 등록되지 않았습니다.");
				}
			}
	}
	
	public void UpdateCustome() {
		//회원 정보 수정
		
		System.out.println("수정할 고객을 입력하세요 : ");
		System.out.println(">>> : ");
		String insert = scan.next();
		
		for(int i = 0; i < r.size(); i++) {
			Rain cus = r.get(i);
			String cusName = cus.getName();
			
			if(cusName.equals(insert)) {
				System.out.println("이름("+cus.getName()+") : ");
				cus.setName(scan.next());
				System.out.println("성별("+cus.getGender()+") : ");
				cus.setGender(scan.next());
				System.out.println("이메일("+cus.getEmail()+") : ");
				cus.setEmail(scan.next());
				System.out.println("생년월일("+cus.getYear()+") : ");
				cus.setYear(scan.nextInt());
			}
			System.out.println("변경이 완료 되었습니다.");
			
		}
	}
	
	public void DeleteCustomer() {
		System.out.println("삭제할 이름을 입력하세요 : ");
		System.out.print(">>>");
		String delete = scan.next();
		
		for(int i = 0; i <r.size(); i++) {
			Rain cus = r.get(i);
			String name = cus.getName();
			
			if(name.equals(delete)) {
				System.out.println("삭제되었습니다.");
				r.remove(i);
			}else {
				System.out.println("존재하지 않는 이름입니다.");
			}
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "[ 이름 : " + name + ", 성별 : " + gender + ", 이메일 : " + email + " , 생년월일 : " + year + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
	
	
	
}