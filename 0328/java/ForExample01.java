package kms;

public class ForExample01 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
//		for (i = 1, sum = 0; i <= 100; i++) {
//			sum += i; // sum = sum + i
//		} 1부터 100까지 합
		
//		for (;i <= 100; i++) {
//			if (i % 2 == 1)
//				sum += i;
//		} 1부터 100까지 중 홀수(1), 짝수(0)인 값의 합
		
//		for (i = 1; i <= 100; i += 2) {
//			sum += i;
//		} 위와 똑같이 홀수 값		
//		for (i = 0; i <= 100; i += 2) {
//		sum += i;
//		} 위와 똑같이 짝수 값
		
//		for (i = 7; i <= 100; i += 7 ) {
//			sum += i;
//		}
		for (i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				sum += i;
		}
		
		System.out.println(i + " " + sum);
	}
}
