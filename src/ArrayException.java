
public class ArrayException {

	public static void main(String[] args) {
		try {
		int [] newArr = new int [] {2, 4, 3,7, 19};
		System.out.println(newArr[9]);
		}
		catch (Exception e) {
			System.out.println("exception is " + e);
		}
	}

}
