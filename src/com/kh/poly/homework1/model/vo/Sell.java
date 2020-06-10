package com.kh.poly.homework1.model.vo;

import java.util.Scanner;


public class Sell extends Product {
	
	private int food1Money = 1000;
	private int food2Money = 1500;
	private int dailyMoney = 15000;
	
	Scanner sc = new Scanner(System.in);
	
	public Sell() {}

	public Sell(String food1, String food2, String daliy) {
		super(food1, food2, daliy);
	}

	@Override
	public void printProduct() {
		System.out.println("Sell클래스의 printProduct()메소드 호출");
		System.out.println(super.getFood1() + ", " + super.getFood2() + ", " + super.getDaliy());
		
	}
	
	public void sellProduct() {
		
		System.out.println("============마트에서 살 수 있는 품목===========");
		System.out.println("1. 라면: 1000원");
		System.out.println("2. 밥: 1500원");
		System.out.println("3. 휴지: 15000원");
		System.out.println("=======================================");
		System.out.print("구매할 품목을 입력하세요: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("=======================================");
		System.out.print("가지고 있는 금액을 입력하세요: ");
		int haveMoney = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
			case 1: 
				if(food1Money <= haveMoney) {
					System.out.println("라면을 구매했습니다.");
					
					System.out.print("다른 품목을 또 구매하시겠습니까? (y/n):  ");
					char check = sc.nextLine().charAt(0);
					
					if(check == 'y' || check == 'Y') {
						return;
					}
					
				} else {
					System.out.println("돈이 부족합니다.");
				}
				break;
			case 2:
				if(food2Money <= haveMoney) {
					System.out.println("밥을 구매했습니다.");
				} else {
					System.out.println("돈이 부족합니다.");
				}
				break;
				
			case 3:
				if(dailyMoney <= haveMoney) {
					System.out.println("밥을 구매했습니다.");
				} else {
					System.out.println("돈이 부족합니다.");
				}
				break;
				
			case 9: break;
			default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); return;
		}
		

		
		
	}
	

}