package com.kopo.group;

public class Base {
	String name;
	int hp;
	int power;

	Base() {
		this.hp = 100;
		this.name = "";
	}

	public void underAttack(int attack) { // 공격력이 정해진 경우
		System.out.println("현재 "+this.name+"의 "+ "hp는 " + this.hp);
		System.out.println(this.name + "은(는) " + attack + "의 데미지를 입었다");
		this.hp = this.hp - attack;
	}

	public void underAttack() { // 아닌 경우
		this.hp = this.hp;
	}

	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}

	public String toString() {
		if (this.isLive()) {
			return this.name + "(" + this.hp + ")";
		}
		return this.name + " is dead";
	}

	public void print() {
		this.isLive();
		System.out.println(this.toString());
	}
}
