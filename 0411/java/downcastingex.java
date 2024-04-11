package kms;

public class downcastingex {
	public static void main(String[] args) {
		person p = new student("김민석"); // 업캐스팅
		student s;
		
		s = (student)p; // 다운캐스팅
		
		System.out.println(s.name);
		s.grade = "f";
		System.out.println(s.grade);
	}
}
