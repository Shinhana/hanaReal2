package com.kh.mine1.model.vo;

import java.util.Scanner;

public class Gugu extends GuguStar {
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void Gugu() {
//		System.out.print("�Է�: ");
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br  = new BufferedReader(isr);
//		String userInput = "";
//		int num = Integer.parseInt(userInput);
//		
//		try {
//			userInput = br.readLine();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		System.out.println("����� �Է�: " + userInput);
		
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();

		if(num > 0) {
			for(int i = 1; i < num; i++) {
				for(int j = 1; j < num; j++) {

					System.out.print("*");
					
					if(i == j) {
						System.out.print(i);
					}
				}
				
				System.out.println();
			}
			
		} else {
			System.out.println("����� �Է��ϼ���.");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	
	
}
