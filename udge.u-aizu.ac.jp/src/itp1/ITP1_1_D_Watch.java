package itp1;

public class ITP1_1_D_Watch {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		//if(n >= 86400) n = 0;
		
		
		int h = (n / 60) / 60;
		n = n - (h * 60 * 60);
		int m = n / 60;
		int s = n - (m * 60);
		
		System.out.println(h + ":" + m + ":" + s);
		
	}

}
