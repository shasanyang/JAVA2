package report2;

public class q11 {
	public static void main(String[] args) {
		int sum = 0;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            sum += num;
        }

        int average = sum / args.length;

        System.out.println(average);
	}
}
