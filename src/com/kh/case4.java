package src.com.kh;

public class case4 {
	public static void main(String[] args) {
		int a = 12;
		double d = 3.3;
		double result = a + d; // �ڵ�����ȯ
		System.out.println(result);
		System.out.println(); // ���� �ٱ� ����
      
		double dValue = 123.5;
		int iValue = (int) dValue;
		System.out.println("���� : " + dValue + ", ��������ȯ: " + iValue);
		System.out.println();

		System.out.println((char) ('1' + '1'));
		System.out.println(); // ctrl+shift+f = ��ü ���� , CTRL + i �� �ٸ� ����

		int iNum = 2147483647;
		// int result1 = iNum + 1;
		long result1 = (long) iNum + 1;
		System.out.println(result1);
	}
}