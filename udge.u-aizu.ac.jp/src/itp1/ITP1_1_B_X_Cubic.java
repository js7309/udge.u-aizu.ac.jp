package itp1;

public class ITP1_1_B_X_Cubic {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int xCubic =  Math.round((float)Math.pow(n, 3));
		
		System.out.println(xCubic);

	}

}
