package com.kh.poly.homework1.model.vo;

public class Product {
	
	private String food1 = "라면";
	private String food2 = "밥";
	private String daliy = "휴지";
	
	
	public Product() {}
	
	public Product(String food1, String food2, String daliy) {
		this.food1 = food1;
		this.food2 = food2;
		this.daliy = daliy;
		
	}
	
	public String getFood1() {
		return food1;
	}

	public void setFood1(String food1) {
		this.food1 = food1;
	}

	public String getFood2() {
		return food2;
	}

	public void setFood2(String food2) {
		this.food2 = food2;
	}

	public String getDaliy() {
		return daliy;
	}

	public void setDaliy(String daliy) {
		this.daliy = daliy;
	}

	public void printProduct() {
		System.out.println("Product클래스의 printProduct()메소드 호출");
	}
	
	

}
