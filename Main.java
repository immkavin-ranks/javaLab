package javaLab;

// finalize method demo
public class Main {

	public static void main(String[] args) {
		Quiz quiz = new Quiz();
		quiz.print();

		quiz = null;
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("hi");
				try {
					Thread.sleep(5000);
					System.out.println("Out of thread.");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t.start();
		System.gc();

		try {
			t.join();
			System.out.println("Done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Quiz {
	public void print() {
		System.out.println("Quiz :(");
	}

	protected void finalize() {
		System.out.println("Cleaning");
	}
}
