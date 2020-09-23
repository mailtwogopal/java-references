
public class MobilePhone {
	public static void main(String[] args) {
		mobile samsung = new mobile();
		dial(samsung);
	}
	
	public static void dial(mobile iphone) {
		iphone.dial("outside of main");
	}
}

class mobile{
	static void dial(String caller) {
		System.out.println("calling " + caller);
	}
	
	static void msg() {
		
	}
	
	static void receivecall() {
		
	}
}