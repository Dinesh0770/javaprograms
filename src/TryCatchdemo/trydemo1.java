package TryCatchdemo;

public class trydemo1 {

	public static void main(String[] args) {

		try {
			System.out.println("start");

			int arr[] = {};
			System.out.println(arr[0]);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			System.out.println("end");

		}

		try {
			try {
				System.out.println("s1");
				int a = 22, b = 0;
				System.out.println(a / b);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {

			System.out.println("error");

		} finally {
			System.out.println("end1");
		}

	}

}
