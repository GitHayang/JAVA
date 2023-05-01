package com.kopo.group;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// 생성 영역
		Base[] b = new Base[5];
		b[0] = new char1();
		b[1] = new char2();
		b[2] = new char3();
		b[3] = new char4();
		b[4] = new char5();
		
		Base[] b2 = new Base[5];
		b2[0] = new char1();
		b2[1] = new char2();
		b2[2] = new char3();
		b2[3] = new char4();
		b2[4] = new char5();
		

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("캐릭터 선택");
		System.out.println("1.전사 2.도적 3.도사 4.주술사 5.궁사");
		String inputNumber = scanner.nextLine();
		int num = Integer.parseInt(inputNumber);

		for (int i = 0; i < 999999; i++) {
		}
		int count = 0;
		// 내 캐릭터 선택 영역
		if (num == 1) {
			System.out.println("당신의 캐릭터는 " + b[0].name + "입니다.");
			// 상대 캐릭터 선택 영역
			int ran = random.nextInt(5);
			System.out.println("상대방의 캐릭터는 " + b2[ran].name + "입니다");
			if (ran >= (0 + random.nextInt(5))) {
				System.out.println("나의 선공");
				while (b[0].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("상대의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("상대의 턴 ");
						b[0].underAttack(random.nextInt(10) + 1);
						b[0].print();
						b[0].isLive();
						System.out.println();
						count++;
					}
				}
			} else {
				System.out.println("상대의 선공");
				while (b[0].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("상대의 턴 ");
						b[0].underAttack(random.nextInt(10) + 1);
						b[0].print();
						b[0].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					}
				}
			}
			if (!b[0].isLive()) {
				System.out.println("상대의 win");
			} else if (!b2[ran].isLive()) {
				System.out.println("나의 win");
			}
//			1번 캐릭터

		} else if (num == 2) {
			System.out.println("당신의 캐릭터는 " + b[1].name + "입니다.");
			// 상대 캐릭터 선택 영역
			int ran = random.nextInt(5);
			System.out.println("상대방의 캐릭터는 " + b2[ran].name + "입니다");
			if (ran >= (0 + random.nextInt(5))) {
				System.out.println("나의 선공");
				while (b[1].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("상대의 턴 ");
						b[1].underAttack(random.nextInt(10) + 1);
						b[1].print();
						b[1].isLive();
						System.out.println();
						count++;
					}
				}
			} else {
				System.out.println("상대의 선공");
				while (b[1].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.print("상대의 턴 ");
						b[1].underAttack(random.nextInt(10) + 1);
						b[1].print();
						b[1].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					}
				}
			}
			if (!b[1].isLive()) {
				System.out.println("상대의 win");
			} else if (!b2[ran].isLive()) {
				System.out.println("나의 win");
			}
//			2번 캐릭터

		} else if (num == 3) {
			System.out.println("당신의 캐릭터는 " + b[2].name + "입니다.");
			// 상대 캐릭터 선택 영역
			int ran = random.nextInt(5);
			System.out.println("상대방의 캐릭터는 " + b2[ran].name + "입니다");
			if (ran >= (0 + random.nextInt(5))) {
				System.out.println("나의 선공");
				while (b[2].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("상대의 턴 ");
						b[2].underAttack(random.nextInt(10) + 1);
						b[2].print();
						b[2].isLive();
						System.out.println();
						count++;
					}
				}
			} else {
				System.out.println("상대의 선공");
				while (b[2].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("상대의 턴 ");
						b[2].underAttack(random.nextInt(10) + 1);
						b[2].print();
						b[2].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					}
				}
			}
			if (!b[2].isLive()) {
				System.out.println("상대의 win");
			} else if (!b2[ran].isLive()) {
				System.out.println("나의 win");
			}
//			3번 캐릭터

		} else if (num == 4) {
			System.out.println("당신의 캐릭터는 " + b[3].name + "입니다.");
			// 상대 캐릭터 선택 영역
			int ran = random.nextInt(5);
			System.out.println("상대방의 캐릭터는 " + b2[ran].name + "입니다");
			if (ran >= (0 + random.nextInt(5))) {
				System.out.println("나의 선공");
				while (b[3].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("상대의 턴 ");
						b[3].underAttack(random.nextInt(10) + 1);
						b[3].print();
						b[3].isLive();
						System.out.println();
						count++;
					}
				}
			} else {
				System.out.println("상대의 선공");
				while (b[3].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("상대의 턴 ");
						b[3].underAttack(random.nextInt(10) + 1);
						b[3].print();
						b[3].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					}
				}
			}
			if (!b[3].isLive()) {
				System.out.println("상대의 win");
			} else if (!b2[ran].isLive()) {
				System.out.println("나의 win");
			}
//			4번 캐릭터

		} else if (num == 5) {
			System.out.println("당신의 캐릭터는 " + b[4].name + "입니다.");
			// 상대 캐릭터 선택 영역
			int ran = random.nextInt(5);
			System.out.println("상대방의 캐릭터는 " + b2[ran].name + "입니다");
			if (ran >= (0 + random.nextInt(5))) {
				System.out.println("나의 선공");
				while (b[4].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("상대의 턴 ");
						b[4].underAttack(random.nextInt(10) + 1);
						b[4].print();
						b[4].isLive();
						System.out.println();
						count++;
					}
				}
			} else {
				System.out.println("상대의 선공");
				while (b[4].isLive() == true && b2[ran].isLive() == true) {
					if (count % 2 == 0) {
						System.out.println("상대의 턴 ");
						b[4].underAttack(random.nextInt(10) + 1);
						b[4].print();
						b[4].isLive();
						System.out.println();
						count++;
					} else {
						System.out.println("나의 턴 ");
						b2[ran].underAttack(random.nextInt(10) + 1);
						b2[ran].print();
						b2[ran].isLive();
						System.out.println();
						count++;
					}
				}
			}
			if (!b[4].isLive()) {
				System.out.println("상대의 win");
			} else if (!b2[ran].isLive()) {
				System.out.println("나의 win");
			}
		}
//		5번 캐릭터

	}
}
