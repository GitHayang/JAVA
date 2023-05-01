package com.kopo.group;

import java.util.Random;

public class char2 extends Base { // hp보통, attack 피해 적음

	char2() {
		this.hp = 80;
		this.name = "도적";
	}

	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		System.out.println("현재 hp는 " + this.hp);
		System.out.println(this.name + "은(는) " + attack + "의 데미지를 입었다");
		this.hp = this.hp - (attack - r.nextInt(attack + 1));
	}
}