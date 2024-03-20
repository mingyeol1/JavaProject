package quiz;

interface Remocon{
	public void on();
	public void off();
}

class Machine{
	protected String name;

	//기본생성자 생략	
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void machinWork(Remocon remocon, Machine machine) {
		remocon.on();
		remocon.off();
	}
	
}	
	
class TV1 extends Machine{
	
	public TV1(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	public void show(){
		System.out.println("방송중입니다.");
	}
}



	public class Quiz_240318PM {
		public static void main(String[] args) {
	Machine tv = new TV1("TV");
	Machine computer = new Machine();
	
	
	Machine.machinWork(new Remocon() {
		@Override
		public void on() {
			System.out.println(tv.getName()+"을 켭니다.");
			
		}@Override
		public void off() {
			System.out.println(tv.getName()+"을 끕니다.");	
		}	
	}, tv);
	Machine.machinWork(new Remocon(){
		@Override
		public void on() {
		System.out.println("컴퓨터를 킵니다.");
			
		}@Override
		public void off() {
			System.out.println("컴퓨터를 끕니다.");
		}
	}, computer);
	
}
	

}
