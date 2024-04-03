package report2;

public class q12 {
	public static void main(String[] args) {
		int sum = 0;
        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
            }
        }
        
        System.out.println(sum);
	}
}
