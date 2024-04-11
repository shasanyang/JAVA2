package kms;
class person {}
class student extends person {}
class researcher extends person {}
class professor extends researcher {}


public class instance {
	static void print(person p) {
		if(p instanceof person)
			System.out.print("person ");
		if(p instanceof student)
			System.out.print("student ");
		if(p instanceof researcher)
			System.out.print("researcher ");
		if(p instanceof person)
			System.out.print("professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("new student() \t");
	}
}
