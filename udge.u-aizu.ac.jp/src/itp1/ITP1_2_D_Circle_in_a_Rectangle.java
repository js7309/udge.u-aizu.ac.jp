package itp1;

public class ITP1_2_D_Circle_in_a_Rectangle {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int W = sc.nextInt(); 
		int H = sc.nextInt();
		int x = sc.nextInt(); 
		int y = sc.nextInt();
		int r = sc.nextInt(); 
		sc.close();
        //60 40 30 -50 3
		
		String out = "Yes";
		if( (W < (x + r)) || (H < (y + r))){
			out = "No";
		}
		
		System.out.println(out);

	}

}
