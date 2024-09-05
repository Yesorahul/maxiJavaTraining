package com.maxi.overload.assign3;

public class ProcesserMain {

	public static void main(String[] args) {
		Processer processer = new Processer();
		processer.calculate(10.0);
		processer.calculate(5);
		processer.calculate(2.0, 3.0);
		processer.calculate(10.0, 2);
		processer.calculate(2, 2);
	}

}
