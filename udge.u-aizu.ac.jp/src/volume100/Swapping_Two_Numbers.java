package volume100;


public class Swapping_Two_Numbers {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String s = "";
		while( !"0 0".equals(s = sc.nextLine())){
			
			String ss[] = s.split("\\s");
			int a[] = new int[2];
			a[0] = Integer.valueOf(ss[0]);
			a[1] = Integer.valueOf(ss[01]);
			java.util.Arrays.sort(a);
			System.out.println(a[0] + " " + a[1]);
		}
		sc.close();

	}

}
