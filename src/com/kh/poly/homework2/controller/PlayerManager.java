package com.kh.poly.homework2.controller;

import java.util.Scanner;

import com.kh.poly.homework2.model.vo.Animal;
import com.kh.poly.homework2.model.vo.Fish;
import com.kh.poly.homework2.model.vo.Lion;
import com.kh.poly.homework2.model.vo.Player;


public class PlayerManager {

	public void startPlay(String name) {
		
		Scanner sc = new Scanner(System.in);
		
		Player p = new Player(name);
		System.out.println(p.getName() + "님께서 던전에 등장하셨습니다.");

		System.out.println("============================================================");
		
		
		//물고기
		Animal f = new Fish(100, 10, "고등어");
		System.out.println("사냥할 Animal이 나타났습니다.");
		f.cry(); 
		
	
		System.out.print("공격할 나의 힘을 입력하세요: ");
		int him1 = sc.nextInt();
		
		for(int i = f.gethp(); i > 0; i -= him1 ) {
			if(f instanceof Fish) {
				((Fish)f).Personhit();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
		}
	
		p.setExp(p.getExp() + f.getExp());
		System.out.println(p);
		
		System.out.println("============================================================");
		
		
		//사자
		Animal L = new Lion(200, 50, "사자");
		System.out.println("사냥할 Animal이 나타났습니다.");
		L.cry();
		
		System.out.print("공격할 나의 힘을 입력하세요: ");
		int him2 = sc.nextInt();
		
		for(int j = L.gethp(); j > 0; j -= him2) {
			if(L instanceof Lion) {
				((Lion)L).Personhit();
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
		}
		
		p.setExp(p.getExp() + L.getExp());
		
		System.out.println(p);
	
	}
	
	
	
}
