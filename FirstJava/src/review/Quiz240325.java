package review;

public class Quiz240325 {
	public static void main(String[] args) {
	Warrior w = new Warrior();
	System.out.println("====전사====");
	w.name = "강한전사";
	w.hp = 10000;
	w.mp = 50;
	w.info();
	w.bash();
	w.action();
	Wizard wz = new Wizard();
	System.out.println("====법사====");
	wz.name = "강한법사";
	wz.hp = 50;
	wz.mp = 10000;
	wz.info();
	wz.iceArrow();
	wz.action();
	

	}
}
class Player{
	String name;
	int hp;
	int mp;
	

	void info() {
		System.out.println("캐릭터명 : "+name);
		System.out.println("체력 : "+hp);
		System.out.println("마나 : "+mp);
	}
	
	void action() {
		System.out.println("밥을 먹는다.");
	}
	
}
class Warrior extends Player{
	
	void bash() {
		System.out.println("때리기 스킬 사용");
	}
	void action() {
		System.out.println("전사가 소리를 지른다.");
	}
	
}
class Wizard extends Player{
	void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	void action() {
		System.out.println("법사가 지팡이를 휘두른다.");
	}
}
