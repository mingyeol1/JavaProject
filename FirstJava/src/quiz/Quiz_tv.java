package quiz;

public class Quiz_tv {

	
	//tv 클래스 만들기
	// 채널 클래스의 기본 생성시 채널과 볼륨은 채널7, 볼륨 20
	//최대 볼륨은 100; 
	//최소 볼륨은 0;
	//채널의 최대 채널 300
	//채널의 최소 채널 1
	//이전 채널이 동작시 저장되어 있던 이전 채널로 이동
	//채널 이동은 채널 정보를 입력받아서 채널 이동.
	//채널 이동 및 볼륨 조절은 전원 On인 상태에서 동작한다.
	
	//속성(멤버변수) : 채널 ,볼륨 ,전원 ,이전채널
	////전원(on/of),볼륨 업 다운, 채널업/ 다운, 이전 채널 이동.
	//채널이동.TV현재 정보 확인.(전원, 채널, 볼륨, 저장된 이전채널)
	
	
	public static void main(String[] args) {
	// TV 테이트
		Tv tv1 = new Tv(); //tv 객체 생성
		tv1.getTvInfo();
		tv1.channelUP();
		tv1.powerOnOff();
		tv1.getTvInfo();
		tv1.channelUP();
		tv1.getTvInfo();
		tv1.moveChannel(10);
		tv1.getTvInfo();
	}

}



class Tv{
	//tv 클래스 멤버 변수
	int channel;
	int prevCannel;
	int volume;
	boolean isPowerOn;
	
	//Tv 클래스의 상수(Final) 상수는 변하지 않는 값
	final int MAX_VOLUME = 100;
	final int MIN_VOLIME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;
	 
	//기본생성자  처음 TV를 킬 때 기본값
	public Tv() {
		channel = 7;
		volume = 20;
	}
	
	//tv기능
	//전원 : isPowerOn 값이 true, false, false면 true
	
	void powerOnOff() {
		isPowerOn = !isPowerOn;
	}
	// 볼륨업/ 다운, 채널업/ 다운(1씩 채널값 증감), 이전채널이동(이전 채널 정보를 기준으로 이동) , 채널이동 ,tv현재 정보확인 .
	//(전원, 채널, 볼륨, 저장된 이전채널)
	
	void volumeUp() {    //볼륨올리기
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return; //void에서 리턴을 만나면 메서드(함수) 종료.
		}else if(volume == MAX_VOLUME){ //볼륨이 최대면 볼륨업 동작x
			System.out.println("현재 볼륨이 최대입니다.");
			return;
		}
		volume ++;
		System.out.println("현재 볼륨은 "+volume+"입니다.");
	}
	void volumeDown() { // 볼륨 내리기
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return; //void에서 리턴을 만나면 메서드(함수) 종료.
		}else if(volume == MIN_VOLIME){ //볼륨이 0이면 볼륨다운 동작x
			System.out.println("현재 볼륨이 최대입니다.");
			return;
		}
		volume --;
		System.out.println("현재 볼륨은 "+volume+"입니다.");
		
	}
	void channelUP() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		//이전 채널
		prevCannel = channel;
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel++;
		}
System.out.println(channel+ "CH");
	
	}
	void channelDoun() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		//이전 채널
		prevCannel = channel;
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
			System.out.println(channel+ "CH");

	
	}
	boolean moveChannel(int ch) {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return false;
		}
		
		if(ch >= MIN_CHANNEL && ch <= MAX_CHANNEL) {
			prevCannel = channel;
			channel = ch;
			System.out.println(ch + "CH");
			return true;
		}else {
			System.out.println("존재하지 않는 채널을 입력했다.");
			return false;
		}
		
	}
	
	void prevChannel() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}else if(prevCannel == 0 ) {
			System.out.println("이전 채널이 없음");
		return;
		}
	int temp = channel;
	channel = prevCannel;
	prevCannel = temp;
	}
	void getTvInfo(){ //tv현재 정보확인
	System.out.println("전원 : "+isPowerOn);
	System.out.println("채널 : "+channel);
	System.out.println("볼륨 : "+volume);
	System.out.println("저장된 이전 채널 : "+prevCannel);
	}
	
}
