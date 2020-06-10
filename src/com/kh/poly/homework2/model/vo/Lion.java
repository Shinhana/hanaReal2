package com.kh.poly.homework2.model.vo;


public class Lion extends Animal {

	public Lion(int hp, int exp, String name) {
		super(hp, exp, name);
	}

	@Override
	public void cry() {
		System.out.println("어흥");
		
	}
	
	public void Personhit() {
		System.out.println("사람이  Lion을 공격함");
		
		if(super.gethp() <= 0) {
			System.out.println("Lion가 결국 낚시대에 걸렸습니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
		
	}
	
	public void attackPerson() {
		System.out.println("Lion이 사람을 공격함");
	}

}
