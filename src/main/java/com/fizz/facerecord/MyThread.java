package com.fizz.facerecord;

import java.util.ArrayList;

public class MyThread extends Thread {

	@Override
	public void run() {
		CaptureBasic.randomNums = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			CaptureBasic.randomNums.add((int) (Math.random() * 100));
		}
		while (true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			CaptureBasic.randomNums = new ArrayList<Integer>();
			for (int i = 0; i < 100; i++) {
				CaptureBasic.randomNums.add((int) (Math.random() * 100));
			}

		}
	}

}
