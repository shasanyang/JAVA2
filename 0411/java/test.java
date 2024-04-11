package abstractex;
class abc {
	int a;
	String name;

	void printinfo() {
		System.out.println("hello");
	}
	abstract void outinfo();
}
class def extends abc {
	void outinfo() {
		System.out.println("");
	}
}

public class test {
	public static void main(String[] args) {
		abc abc = new abc();
		abc.printinfo();
	}
}
