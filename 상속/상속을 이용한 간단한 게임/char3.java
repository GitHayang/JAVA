package com.kopo.group;

import java.util.Random;

public class char3 extends Base { // hp 적음 , attack 피해 적음
	int deadCount = 0;

	char3() {
		this.hp = 70;
		this.name = "도사";

	}

	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		System.out.println("현재 hp는 " + this.hp);
		if (attack < 5) { // attack 5미만이면 체력 감소 없음
			System.out.println(this.name + "은(는) " + 0 + "의 데미지를 입었다");
			this.hp = this.hp;
		} else { // 5이상이면 피해감소
			System.out.println(this.name + "은(는) " + (attack - r.nextInt(attack + 1)) + "의 데미지를 입었다");
			this.hp = this.hp - (attack - r.nextInt(attack + 1));
		}
	}
}