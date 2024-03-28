package kms;

public class Continue {
	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			sum += 1;
//		}
		for (int i = 0; i <= 100; i++) {
			if (i % 7 ==0)
				sum += i;
		}
		System.out.println("1부터 100 중 7의 배수 합 : " + sum);
		sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 7 ==0)
//				continue; // 생략하게 만듬
//				sum += i;
//		}
		int i = 0;
		while (i <= 100) {
			if (i % 7 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
		System.out.println("1부터 100 중 7의 배수 제외 합 : " + sum);
	}
}
