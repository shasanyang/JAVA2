package report2;

public class q13 {
	public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
            	if (i >= 30 && ((i / 10) % 10 == 3 || (i / 10) % 10 == 6 || (i / 10) % 10 == 9)) {
                    if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                        System.out.println(i + " 박수짝짝");
                    } else {
                        System.out.println(i + " 박수짝");
                    }
                }
                System.out.println(i + " 박수짝");
            } 
        }
    }
}