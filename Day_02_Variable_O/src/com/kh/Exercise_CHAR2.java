package com.kh;

import java.util.Scanner;

public class Exercise_CHAR2 {
	public static void main(String[] args) {
		// 스캐너 임포트
		Scanner SC = new Scanner(System.in);

		// 이름을 입력해주세요
		System.out.print("이름을 입력해주세요: ");
		String userName = SC.next();

		System.out.print("나이를 입력해주세요 :");
		int userAge = SC.nextInt();

		SC.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		String userAddr = SC.nextLine();

		System.out.print("키를 입력해주세요 : ");
		double userHeight = SC.nextDouble();

		System.out.print("몸무게를 입력해주세요 : ");
		double userWeight = SC.nextDouble();

		System.out.print("성별을 입력해주세요 : ");
		char userGender = SC.next().charAt(0);
		// 출력 ctrl+/= 전체
		//출력메소드 f //줄바꿈 없이 출력 ""괄호 안만 출력!
		System.out.printf("당신의 이름은 : %s \n" , userName);
		System.out.printf("당신의 나이는 : %d \n" , userAge);
		System.out.printf("당신의 주소는 : %s \n" , userAddr);
		System.out.printf("당신의 신장은 : %f \n" , userHeight);
		System.out.printf("당신의 무게는 : %f \n" , userWeight);
		System.out.printf("당신의 성별은 : %c \n" , userGender); /// \n = \\n
	}
}
