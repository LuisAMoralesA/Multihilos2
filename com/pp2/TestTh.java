package com.pp2;

public class TestTh extends Thread{
	private String nombre;
	private int retardo;
	
	public TestTh(String nombre, int retardo) {
		this.nombre = nombre;
		this.retardo = retardo;
	}

	public void run() {
		try {
			sleep(retardo);
		} catch(InterruptedException e) {
			System.out.println("THERE ARE NO STRINGS ON ME...");
		}
		System.out.println("HELLO WORLD: " + nombre + " " + retardo);
	}
	
}
