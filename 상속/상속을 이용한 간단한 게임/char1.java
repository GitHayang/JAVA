package com.kopo.group;

public class char1 extends Base {

	int deadCount = 0;

	public char1() {
		this.hp = 100;
		this.name = "전사";
	}

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
