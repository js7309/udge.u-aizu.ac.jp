package itp1;


public class ITP1_2_C_Sorting_Three_Numbers {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		sc.close();
		java.util.Arrays.sort(a);
		
		System.out.println(java.util.Arrays.toString(a).replaceAll("(\\[)|(\\])|(,)", ""));
	}

}
