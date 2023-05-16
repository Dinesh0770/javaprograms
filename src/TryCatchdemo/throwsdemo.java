package TryCatchdemo;

class errorException extends RuntimeException {

	errorException(String m) {
		super(m);
	}

}

public class throwsdemo {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("heloo wait 2sec");

		// throw.errorException("eroorrrr");

		Thread.sleep(3000);

		System.out.println("after 2sec");

	}
}
