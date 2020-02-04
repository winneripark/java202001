package 배열;

// 10,20,30,40,50을 배열에 넣어
// 첫번째 값과 두번째 값을 더해서 print!

public class 예제1 {

	public static void main(String[] args) {
		int[] samples = {10,20,30,40,50};
		int[] data1 = new int[5];
		int sum = 0;
		for (int i = 0; i < samples.length; i++) {
//			sum = samples[0]+samples[1];
			data1[i] = samples[i];
		}
		sum = data1[0] + data1[1];
		System.out.println(sum);

	}

}
