package ch02;

public class VarEx01 {
	public static void main(String[] args) {
		byte num1 = -120; //1Byte
		System.out.println(num1);
		
		int num2 = 1000000000; //4Byte
		System.out.println(num2);
		
		long num3 = 10; //8Byte
		System.out.println(num3);
		
		int n1 = num1; /* ����������ȯ */
		// byte n2 = num2; ����!!
		byte n3 = (byte) num3; /* ����������ȯ */
		
		int n4 = (int)num3;
	}
}