package com.pp2;

public class Multihola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTh t1,t2,t3;
		
		t1 = new TestTh("THREAD 1 ", (int) (Math.random() * 2000));
		t2 = new TestTh("THREAD 2 ", (int) (Math.random() * 2000));
		t3 = new TestTh("THREAD 3 ", (int) (Math.random() * 2000));
		
		t1.start();
		t2.start();
		t3.start();
	}

}
