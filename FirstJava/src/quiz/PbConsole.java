package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import util.closer;

public class PbConsole {
	
	//폰북을 위한 객체멤버
	static PhoneBook book = new PhoneBook();
	static Scanner sc = new Scanner(System.in);
	
	public static void doNewGroup() {
		System.out.println("Entet New Group Name > ");
		book.addGroup(sc.nextLine());
		book.save();
		System.out.println();
	}
	
	public static void doNewAddress() {
		System.out.println("Entet Group Name > ");
		String groupName = sc.nextLine();
		
		System.out.println("Entet Phone Number > ");
		String number = sc.nextLine();
		
		System.out.println("Entet Name > ");
		String name = sc.nextLine();
		
		AddPhMessage addMsg = book.addPhoneNo(groupName, number, name);
		//addMsg를 적절히 처리.
		if(addMsg.type == AddPhMessage.ADD_SUCCESS)
			book.save();
		else if(addMsg.type == AddPhMessage.NOT_EXISTING_GROUP) {
			System.out.println(addMsg.msg);
			return;
		}else if(addMsg.type == AddPhMessage.EXISTING_NUMBER) {
			// 수정 여부 선택... 수정해서 다시 등록 vs 등록 안하기...
		}
	}
	public static void doFindPhone() {
		System.out.println("Entet Phone Number > ");
		String number = sc.nextLine();
		book.searchByNumber(number);
	}
	
	public static void doFindName() {
		System.out.println("Entet Number > ");
		String name = sc.nextLine();
		book.searchByName(name);
	}
	
	public static void main(String[] args) {


		
		
		
		
		
		while (true) {
	         System.out.println("==== What to do ====");         
	         System.out.println("1. New Group");
	         System.out.println("2. Print");
	         System.out.println("3. New Address");
	         System.out.println("4. Find Phone");
	         System.out.println("5. Find Name");
	         System.out.println("6. Exit");
	         System.out.print("> ");
	         int behavior = sc.nextInt();
	         sc.nextLine();
	         
	         switch (behavior) {
	         case 1:
	            doNewGroup();
	            break;
	         case 2:
	            book.printAll();
	            break;
	         case 3:
	            doNewAddress();
	            break;
	         case 4:     
	        	 doFindPhone();
	        	 break;
	         case 5:
	        	 doFindName();
	        	 break;
	         case 6:
	        	 System.out.println("프로그램 종료합니다.");
	        	 System.exit(0);
	         default:
	            System.out.println("메뉴 선택을 잘못했습니다.");
	        	 break;
	         }
	      }      
		
	}
	}



class PhoneBook {
	//	(그룹)
HashMap<String, HashMap<String, String>> phonebook;

File saveFile = null;
String savePath = "saveFile/phonebook.sav";

public PhoneBook() {	//기본생성자 객체가 만들어지면 불러옴
	//객체 생성시 파일에 저장된 내용을 불러오는 동작.
	//파일이 존재하면, 내용을 불러오고
	//파일이 없다면, 디렉터리 및 생성.
	phonebook = new HashMap<>();
	saveFile = new File(savePath); //File 객체 생성 - 저장 파일에 대한 작업.
	if(!saveFile.exists()) {
		File dir = new File(saveFile.getParent());
		dir.mkdirs();
	}
	load();			//객체 실행시 파일의 정보를 불러와서 정보를 완성
}

public void addGroup(String groupName) {
	if(!phonebook.containsKey(groupName)) {
		phonebook.containsKey(groupName);
	}
}
	
public void printAll() {
	 Set<String> groupNames = phonebook.keySet();
	 
	 for(String groupName: groupNames) {
		 System.out.println("* * * * * "+groupName+"* * * * *");
		 
		 //전화번호 이름
		 HashMap<String, String> numberAndNames = phonebook.get(groupName);
		 if(numberAndNames.size() == 0 ) {
			 System.out.println("비어 있음");
		 }else {
			 for(String number : numberAndNames.keySet()) {		//(이름)	,/(전화번호)
				 System.out.printf("%s : %s\n",numberAndNames.get(number), number);
			 }
		 }
	 }
}

public AddPhMessage addPhoneNo(String groupName, String number, String name) {
	if(!phonebook.containsKey(groupName)) {
		return new AddPhMessage("없는 그룹입니다.", AddPhMessage.NOT_EXISTING_GROUP);
	}else {
		HashMap<String, String> numberAndNames = phonebook.get(groupName);
		
		if(checkDupleNumber(number)) {
			return new AddPhMessage("이미 등록된 번호입니다. 수정하시겠습니까?", AddPhMessage.EXISTING_NUMBER);
		}
		
		numberAndNames.put(number, name);
		return new AddPhMessage("정상적으로 등록되었습니다.", AddPhMessage.ADD_SUCCESS);
	}
}

//모든 전화번호를 HashSet으로 반환하는 메서드
private Set<String> getAllNumber(){
	HashSet<String> allNumbers = new HashSet<>();
	
	for(HashMap<String, String> group : phonebook.values()) {
		allNumbers.addAll(group.keySet());
	}
	return allNumbers;
}

//전화번호 중복 체크 메서드
private boolean checkDupleNumber(String number) {
	return getAllNumber().contains(number);
}
//일부 전화번호 입력하면 모든 사람의 목록 출력
public void searchByNumber(String number) {
	System.out.println("* * * * *"+number+"* * * * *");
	for(HashMap<String, String> group: phonebook.values()) {
		for(String key:group.keySet()) {
			if(key.contains(number)) {
				System.out.printf("%s : %s\n", group.get(key),key);
			}
		}
	}
}
	//이름 입력히면 해당 사람의 전화번호 출력메서드
	// 동명이인이 있는 경우 여러개 출력 되어야함.
	public void searchByName(String inputName) {
		System.out.println("* * * * *"+inputName+"* * * * *");
		for(HashMap<String, String> group: phonebook.values()) {
			for(Entry<String, String> entry: group.entrySet()) {
				String number = entry.getKey();
				String name = entry.getValue();
				if(name.contains(inputName)) {
					System.out.printf("%s : %s\n", name, number);
				}
			}
		}
	}
	// 변경된 내용이 파일에 저장되어 프로그램을 다시 실행할때도 유지되도로 만들어보세요.
	public void save() {
		FileWriter out = null;
		try {
			out = new FileWriter(saveFile);
			// 전화번호부의 내용을 나름의 문자열로 구성해서 저장.
			for(String groupName: phonebook.keySet()) {
				out.write(groupName+":");
				for(Entry<String, String> e:phonebook.get(groupName).entrySet()) {
					out.write(String.format("%s=%s ", e.getClass(), e.getValue()));
					//groupName:number, name
					//groupName:number, name
				}
				out.write('\n');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null) closer.closer(out);
		}
	}
	public void load() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(saveFile));
			String line = null;
			while ((line=in.readLine())!=null) {
				String[] groupAndEntry = line.split(":");
				//함수를 심플하게 만들어 사용하면 재사용성이 올라갈 수 있다.
				if(groupAndEntry.length == 1) {
					addGroup(groupAndEntry[0]);
				}else {
					addGroup(groupAndEntry[0]);
					String[] entry = groupAndEntry[1].split(" ");
					
					for(String e : entry) {
						String[] phoneAndName = e.split("=");
				addPhoneNo(groupAndEntry[0], phoneAndName[0], phoneAndName[1]);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) closer.closer(in);
		}
	}
	
	
}

class AddPhMessage{  //전화번호 처리 결과를 나타내는 클래스.
	String msg;
	int type;
	
	//상수 처리
	final static int NOT_EXISTING_GROUP = 0;
	final static int EXISTING_NUMBER = 1;
	final static int ADD_SUCCESS = 2;
	
	public AddPhMessage(String msg, int type) {
		this.msg = msg;
		this.type = type;
	}
	@Override
		public String toString() {
		return msg;
		}
	
}