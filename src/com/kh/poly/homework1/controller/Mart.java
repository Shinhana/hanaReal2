package com.kh.poly.homework1.controller;

import com.kh.poly.homework1.model.vo.Customer;
import com.kh.poly.homework1.model.vo.Sell;

public class Mart {
	
	public void customerManager(String name) {
		Customer c = new Customer(name);
		
		System.out.println("���� �α����� ����: " + c.getName());
		
		Sell s = new Sell();
		s.sellProduct();
		
		
		
		
	}
	
	public void printProduct() {
		System.out.println("MartŬ������ printProduct() �޼ҵ� ����");
	}
	
}
