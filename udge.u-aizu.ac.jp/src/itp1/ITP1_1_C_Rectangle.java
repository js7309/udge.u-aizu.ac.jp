package itp1;

public class ITP1_1_C_Rectangle {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int a1 = a * b;
		int b1 = (a + b) * 2;
		
		System.out.println(a1 + " " + b1);

	}

}
