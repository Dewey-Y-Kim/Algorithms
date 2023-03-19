package MyStudy;

public class MethodCall {

	public MethodCall() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		new MethodCall().call();
		// new call();
		call();
	}
	public static void call() {
		System.out.println("call Ok");
	}
}
