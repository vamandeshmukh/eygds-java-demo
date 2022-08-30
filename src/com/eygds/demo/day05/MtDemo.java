package com.eygds.demo.day05;

public class MtDemo {

	public static void main(String[] args) {

		Print print = new Print();
		print.printNums();
		Print print2 = new Print();
		print2.printNums();
		Print print3 = new Print();
		print3.printNums();

//		Thread obj = new Thread(new Print());
//		obj.start();
//		Thread obj2 = new Thread(new Print());
//		obj2.start();
//		Thread obj3 = new Thread(new Print());
//		obj3.start();

	}
}

class Print extends Thread {

	@Override
	public void run() {
		this.printNums();
	}

	void printNums() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}