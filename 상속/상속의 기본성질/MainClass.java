package com.kopo.c2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Base[] b = new Base[10];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < b.length; i++) {
			System.out.println(i + "번째 도형을 선택해 주세요");
			System.out.println("1.삼각형 2.사각형 3.원");
			String inputNumber = scanner.nextLine();
			int input = Integer.parseInt(inputNumber);

			if (input == 1) {
				b[i] = new Triangle();
				b[i].input();
			} else if (input == 2) {
				b[i] = new Square();
				b[i].input();
			} else if (input == 3) {
				b[i] = new Circle();
				b[i].input();
			} else {
				System.out.println("다시 입력해 주세요");
				i--;
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(i + "번째 : ");
			b[i].print();
		}

		// 캐스팅하거나
		Base b2 = new C2();
		((C2)b2).test();
		
		// 처음부터 선언하거나
		C2 b3 = new C2();
		b3.test();
		b3.test(100);
	}
}
