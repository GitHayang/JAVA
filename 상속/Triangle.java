package com.kopo.c2;

import java.util.Random;

public class Triangle extends Base {

	int width;
	int height;

	Triangle() {
		this.name = "삼각형";
	}

	@Override
	public void inputNumber() {
		Random random = new Random();
		this.width = random.nextInt(10) + 1;
		this.height = random.nextInt(10) + 1;
	}

	@Override
	public void calcSize() {
		this.size = (this.height * this.width) / (double) 2;
	}

}
