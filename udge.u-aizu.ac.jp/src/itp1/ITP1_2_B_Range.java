package itp1;

public class ITP1_2_B_Range {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		String out = "No";
		if(a < b){
			if(b < c){
				out = "Yes";
			}
		}
		
		System.out.println(out);

	}

}
