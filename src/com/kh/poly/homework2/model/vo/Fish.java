package com.kh.poly.homework2.model.vo;

public class Fish extends Animal{

	public Fish(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	
	
	@Override
	public void cry() {
		System.out.println("����");
		
	}
	
	public void Personhit() {
		System.out.println("����� fish�� ������");
		
		if(super.gethp() <= 0) {
			System.out.println("fish�� �ᱹ ���ô뿡 �ɷȽ��ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
		
	}
	
	public void attackPerson() {
		System.out.println("fish�� ����� ������");
	}
	
	
	
}
