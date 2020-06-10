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
		System.out.println("SellŬ������ printProduct()�޼ҵ� ȣ��");
		System.out.println(super.getFood1() + ", " + super.getFood2() + ", " + super.getDaliy());
		
	}
	
	public void sellProduct() {
		
		System.out.println("============��Ʈ���� �� �� �ִ� ǰ��===========");
		System.out.println("1. ���: 1000��");
		System.out.println("2. ��: 1500��");
		System.out.println("3. ����: 15000��");
		System.out.println("=======================================");
		System.out.print("������ ǰ���� �Է��ϼ���: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("=======================================");
		System.out.print("������ �ִ� �ݾ��� �Է��ϼ���: ");
		int haveMoney = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
			case 1: 
				if(food1Money <= haveMoney) {
					System.out.println("����� �����߽��ϴ�.");
					
					System.out.print("�ٸ� ǰ���� �� �����Ͻðڽ��ϱ�? (y/n):  ");
					char check = sc.nextLine().charAt(0);
					
					if(check == 'y' || check == 'Y') {
						return;
					}
					
				} else {
					System.out.println("���� �����մϴ�.");
				}
				break;
			case 2:
				if(food2Money <= haveMoney) {
					System.out.println("���� �����߽��ϴ�.");
				} else {
					System.out.println("���� �����մϴ�.");
				}
				break;
				
			case 3:
				if(dailyMoney <= haveMoney) {
					System.out.println("���� �����߽��ϴ�.");
				} else {
					System.out.println("���� �����մϴ�.");
				}
				break;
				
			case 9: break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); return;
		}
		

		
		
	}
	

}