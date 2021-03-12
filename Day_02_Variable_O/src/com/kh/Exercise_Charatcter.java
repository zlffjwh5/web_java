package com.kh;

import java.util.Scanner;

public class Exercise_Charatcter {
		public static void main(String [] args) { // 메인 메소드
			// Scanner 임포트
			Scanner sc = new Scanner(System.in);
			// 이름을 입력해주세요
			System.out.print("이름을 입력해주세요 : ");
			String userName = sc.next();
			System.out.print("나이를 입력해주세요 : " );
			int userAge = sc.nextInt();
			sc.nextLine(); // 개행 제거, 엔터 받기
			System.out.print("주소를 입력해주세요 : ");
			String userAddr = sc.nextLine();
			System.out.print("키를 입력해주세요 : ");
			double userHeight = sc.nextDouble();
			System.out.print("몸무게를 입력해주세요 : ");
			double userWeight = sc.nextDouble();
			System.out.print("성별을 입력해주세요 : ");
			char userGender = sc.next().charAt(0);
//			문자를 입력을 받는 메소드는 없기 때문에
//			문자열을 입력받는 메소드를 사용하여 문자를 입력받음
			
			/* ctrl + shift + / (다중 주석) -> 해제 : ctrl + shift + \
			 * ctrl + / (한줄 주석) -> 해제 : ctrl + /
			 * System.out.print("당신의 이름은 : " + userName +"\n");
			 * System.out.print("당신의 나이는 : " + userAge +"\n");
			 * System.out.print("당신의 주소는 : "+ userAddr +"\n"); 
			 * System.out.print("당신의 키는 : " + userHeight +"\n");
			 * System.out.print("당신의 몸무게는 : " + userWeight +"\n");
			 * System.out.print("당신의 성별은 : " + userGender +"\n");
			 */
			
			System.out.printf("당신의 이름은 : %s \n" , userName);
//			System.out.print("당신의 이름은 : %s " + userName + "\n");
			System.out.printf("당신의 나이는 : %d \n" , userAge);
			System.out.printf("당신의 주소는 : %s \n" , userAddr);
			System.out.printf("당신의 키는 : %f \n" , userHeight);
			System.out.printf("당신의 몸무게는 : %f \n" , userWeight);
}}