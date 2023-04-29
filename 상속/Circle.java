package com.kopo.c2;

import java.util.Random;

public class Circle extends Base {

	private double half;

	Circle() {
		this.name = "원";
	}

	@Override
	public void inputNumber() {
		Random random = new Random();
		this.half = random.nextInt(10) + 1;
	}

	@Override
	public void calcSize() {
		this.size = (Math.pow(this.half, 2) * Math.PI);
		this.size = Math.round(this.size * 100) / (double) 100;
	}

}
