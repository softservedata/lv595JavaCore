package com.softserve.edu16thr;

public class Run1p implements Runnable {

	public void run() {
		int k;
		System.out.println("+ Thread ID = " + Thread.currentThread().getId());
		for (int i = 0; i < 100; i++) {
			// Appl.go(Thread.currentThread().getId());
			/*-
			k = Appl.sum;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Appl.sum = k + 1;
			System.out.print("+");
			*/
			// /*-
			// synchronized (Appl.class) {
			synchronized (Appl.monitor) {
				k = Appl.sum;
				try {
					if (k < 0) {
						// Appl.monitor.wait();
						Appl.monitor.notifyAll();
					}
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Appl.sum = k + 1;
				System.out.print("+");
				// Appl.monitor.notifyAll();
			}
			// */
		}
		System.out.println(" DONE+, sum=" + Appl.sum);
	}
}
