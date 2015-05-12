package volume0;



public class List_of_Top_3_Hills {

	public static void main(String[] args) {
		
		int t = 10;
		Integer a[] = new Integer[t];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		for(int i = 0; i < t ; i++)
			a[i] = sc.nextInt();
		sc.close();
		
		java.util.Arrays.sort(a,  java.util.Collections.reverseOrder());
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

	}

}
