package abstractex;

public class phoneinterface {
	public static int timeout = 10000;
	public abstract void sendcall();
	public abstract void receivecall();
	public default void printlogo() {
		System.out.println("phone");
	}
}
