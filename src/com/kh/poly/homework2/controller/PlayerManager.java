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
		System.out.println(p.getName() + "�Բ��� ������ �����ϼ̽��ϴ�.");

		System.out.println("============================================================");
		
		
		//�����
		Animal f = new Fish(100, 10, "����");
		System.out.println("����� Animal�� ��Ÿ�����ϴ�.");
		f.cry(); 
		
	
		System.out.print("������ ���� ���� �Է��ϼ���: ");
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
		
		
		//����
		Animal L = new Lion(200, 50, "����");
		System.out.println("����� Animal�� ��Ÿ�����ϴ�.");
		L.cry();
		
		System.out.print("������ ���� ���� �Է��ϼ���: ");
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
