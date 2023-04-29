package com.kopo.c2;

public abstract class Base {

	protected String name;
	protected double size;

	Base(){
		this.name = "도형";
	}
	
	protected abstract void inputNumber();

	protected abstract void calcSize();

	protected void printSize() {
		System.out.println(this.name + " size : " + this.size);
	}
	
	public void input() {
		this.inputNumber();
		this.calcSize();
	}

	public void print() {
		this.printSize();
	}

}
