
public class B02_ifExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩(중복) if : if문 안에 if문이 조건하는 경우
		
		int jumsu = (int)(Math.random()*110);
		
		System.out.println("점수 : "+ jumsu);
		
		
		if(jumsu >= 90) {
			System.out.println("당신의 학점은 A입니다.");
			}
	if(jumsu >= 105) {
System.out.println("알 수 없는 오류가 발생했다.");
	}
			
			else if(jumsu >= 80) {
				System.out.println("당신의 학점은 B입니다.");
				}
				else if(jumsu >= 70) {
					System.out.println("당신의 학점은 C입니다");
				}
				else if(jumsu >= 60) {
					System.out.println("당신의 학점은 D입니다");
				}else if(jumsu >= 50){
					System.out.println("당신의 학점은 F입니다");
					}
				else {
					System.out.println("당신은 재수강 확정입니다.");
				}
				
	
	
	
	
	
	}

}
