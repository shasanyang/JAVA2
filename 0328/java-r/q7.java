package report2;

public class q7 {
	public static void main(String[] args) {
		int[] numbers = new int[10];
        double sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10) + 1;
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("\n평균은 " + average);
	}
}
