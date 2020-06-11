package com.kh.mine1.model.vo;

import java.util.Scanner;

public class Gugu extends GuguStar {
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void Gugu() {
//		System.out.print("입력: ");
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
//		System.out.println("사용자 입력: " + userInput);
		
		System.out.print("숫자 입력: ");
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
			System.out.println("양수만 입력하세요.");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	
}
