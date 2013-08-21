public class A implements Runnable {

	public void run() {
		String A = "A";
		String B = "B";
		String C = "C";

		synchronized (this) {
			System.out.println(A);
		}
		synchronized (this) {
			System.out.println(B);
		}
		synchronized (this) {
			System.out.println(C);
		}

	}
}
