package com.kopo.group;

import java.util.Random;

//양윤재
//궁사 , 기본hp: 85 , 피해치: 남들보다 10적게 받음 , 부활없음
public class char5 extends Base {

	char5() {
		this.hp = 85;
		this.name = "궁사";
	}

	// 피해치 적게 (공격받을 때마다 남들보다 10 적게 공격받음)
	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		System.out.println("현재 hp는 " + this.hp);
		System.out.println(this.name + "은(는) " + (attack - r.nextInt(attack+1)) + "의 데미지를 입었다");
		this.hp = this.hp - (attack - r.nextInt(attack+1));
	}

}