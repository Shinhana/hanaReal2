package com.kh.poly.homework1.run;

import java.util.Scanner;

import com.kh.poly.homework1.controller.Mart;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Mart m = new Mart();
		
		System.out.print("������ �Է��ϼ���: ");
		String name = sc.nextLine();
		
		m.customerManager(name);
		
	}

}
