package com.kopo.group;

import java.util.Random;

//양윤재
//주술사, 기본hp:70 , 피해치:남들보다 랜덤값보다 더 받음 , 부활1번가능
public class char4 extends Base {
	Random r = new Random();
	int deadCount = 0;

	char4() {
		this.hp = 70;
		this.name = "주술사";
	}

	// 피해치 랜덤값
	@Override
	public void underAttack(int attack) {
		System.out.println("현재 hp는 " + this.hp);
		System.out.println(this.name + "은(는) " + ((int) (attack + Math.random() * 10)) + "의 데미지를 입었다");
		this.hp = this.hp - ((int) (attack + Math.random() * 10)); // 0~10 총 데미지 10~20
	}

	// 부활1번가능

	@Override
	public boolean isLive() {
		if (this.hp < 1) { // hp가 0 이면
			if (this.hp < 1 && deadCount == 0) {
				this.hp = 70;
				deadCount++; // 죽은횟수 카운트
				return true;
			} else if (this.hp < 1 && deadCount == 1) { // 죽은횟수가 1이면 , 현재 무한 부활
				return false;
			}
		}
		return true;
	}

}