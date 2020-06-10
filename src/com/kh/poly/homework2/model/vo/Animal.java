package com.kh.poly.homework2.model.vo;

public abstract class Animal {
	
	private int hp;
	private int exp;
	private String kinds;
	
	public Animal() {}
	
	public Animal(int hp, int exp, String kinds) {
		this.hp = hp;
		this.exp = exp;
		this.kinds = kinds;
	}

	public int gethp() {
		return hp;
	}

	public void sethp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public abstract void cry();
	
	
}
