package com.kh.poly.homework2.model.vo;


public class Lion extends Animal {

	public Lion(int hp, int exp, String name) {
		super(hp, exp, name);
	}

	@Override
	public void cry() {
		System.out.println("����");
		
	}
	
	public void Personhit() {
		System.out.println("�����  Lion�� ������");
		
		if(super.gethp() <= 0) {
			System.out.println("Lion�� �ᱹ ���ô뿡 �ɷȽ��ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
		
	}
	
	public void attackPerson() {
		System.out.println("Lion�� ����� ������");
	}

}
