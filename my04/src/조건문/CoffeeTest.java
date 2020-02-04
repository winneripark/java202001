package 조건문;

public class CoffeeTest {

	// java는 CAMEL표기법을 권장함. ==> CoffeeTest
	// python은 SNAKE표기법을 권장함. ==> Coffee_test
	public static void main(String[] args) {
		//25000원이 넘으면 할인쿠폰 5000원 짜리 증정 아니면 그냥 다냄.
		
		int price = 5600;
		int count = 5;
		
		int sum = price * count;
		
		if (sum >= 25000) {
			sum = sum - 5000;
			// System.out.println("당신이 지불할 금액은 " + sum + "원");
		} else {
			// System.out.println("당신이 지불할 금액은 " + sum + "원");
			// java는 비워두어도 됨. python에서는 비워두면 안됨.
		}
		 System.out.println("당신이 지불할 금액은 " + sum + "원");		
		 
		 int hour = 21;
		 if (hour < 22) {
			System.out.println("아직 집에갈 시간이 남았어요");
		} else {
			System.out.println("집에갈 시간이 거의 다 되었어요");
		}
	
	
	}
}
