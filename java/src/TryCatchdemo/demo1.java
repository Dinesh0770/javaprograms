package TryCatchdemo;

public class demo1 {

	public static void main(String[] args) {

		int a, b = 100, c = 0;
		try {

			a = b / c;

		} catch (Exception e) {

			e.printStackTrace();
			// System.out.println(e);

		}
//		
//		finally {
//			System.out.println("done");
//		}

	}

}
