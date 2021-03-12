package com.kh;

import java.util.Scanner;

public class Exe_char2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//실습 예제
		System.out.print("이름을 입력해주세여 : ");
		String name = sc.next();
		System.out.print("태어난 월을 입력해주세여: ");
		int birthMonth =sc.nextInt();
		sc.nextLine(); // 개행
		System.out.print("주소를 입력해주세여:  ");
		String address = sc.nextLine();
		System.out.print("키를 입력해주세여: ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해주세여: ");
		double weight = sc.nextDouble();
		System.out.print("성별을 입력해주새요: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("당신의 이름은  : " + name);
		System.out.printf("당신의 태워난 월  : %-5d \n", birthMonth); // 좌측정렬 %5d 우측정렬
		System.out.println("당신의 주소는  : " + address);
		System.out.println("당신의 키는  : " + (int)height);
		System.out.printf("당신의 몸무게는 : %.1f %d \n", weight, birthMonth);//f함수는 2개도 가능~
		System.out.println("당신의 성별은 : " + gender);



	}
}
