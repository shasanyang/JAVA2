package kms;

class person {
	String name;
	String id;
	public person() {
		name = "김민석";
		id = "kms";
	}
	
	public person(String name) {
		super();
		this.name = name;
	}
	public person(String name, String id) {
		this.id = id;
		this.name = name;
	}
	public String tostring() {
		return "name = " + name + ", id = " + id;
	}
	
}
class student extends person {
	String grade;
	String department;
	public student() {
		this("김민석", "kms", "2", "y");
	}
	public student(String name) {
		super(name);
		id = "123";
		grade = "a";
		department = "soft";
	}
	public student(String name, String id, String grade, String department) {
		super(name, id);
		this.grade = grade;
		this.department = department;
	}
	public String tostrString() {
		return "name = " + name + ", id = " + id + " grade = " + grade + ", department = " + department;
	}
}

public class upcastingex {
	public static void main(String[] args) {
		person p;
		student s = new student("김민석");
		s.grade = "a+";
		s.department = "컴퓨터";
		System.out.println(s);
		
		p = s;
		System.out.println(p.name);
		System.out.println(p.id);
		
		student s1;
		s1 = (student)p;
		s1.name = "이이이";
		s1.id = "6";
		s1.grade = "1972";
		s1.department = "b";
		System.out.println(s1);
	}
}
