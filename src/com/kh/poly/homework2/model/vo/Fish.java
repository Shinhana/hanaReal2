package com.kh.poly.homework2.model.vo;

public class Fish extends Animal{

	public Fish(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}
	
	
	
	@Override
	public void cry() {
		System.out.println("찍찍");
		
	}
	
	public void Personhit() {
		System.out.println("사람이 fish를 공격함");
		
		if(super.gethp() <= 0) {
			System.out.println("fish가 결국 낚시대에 걸렸습니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
		
	}
	
	public void attackPerson() {
		System.out.println("fish이 사람을 공격함");
	}
	
	
	
}
