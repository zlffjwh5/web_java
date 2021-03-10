package src.com.kh;

public class case4 {
	public static void main(String[] args) {
		int a = 12;
		double d = 3.3;
		double result = a + d; // 자동형변환
		System.out.println(result);
		System.out.println(); // 한줄 뛰기 개행
      
		double dValue = 123.5;
		int iValue = (int) dValue;
		System.out.println("원본 : " + dValue + ", 수동형변환: " + iValue);
		System.out.println();

		System.out.println((char) ('1' + '1'));
		System.out.println(); // ctrl+shift+f = 전체 정리 , CTRL + i 그 줄만 정리

		int iNum = 2147483647;
		// int result1 = iNum + 1;
		long result1 = (long) iNum + 1;
		System.out.println(result1);
	}
}