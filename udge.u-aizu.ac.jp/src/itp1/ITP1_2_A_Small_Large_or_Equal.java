package itp1;

public class ITP1_2_A_Small_Large_or_Equal {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		sc.close();
		String c = "";
		switch(a.compareTo(b)){
		case 1: c = ">"; break;
		case 0: c = "=="; break;
		case -1: c = "<"; break;
		}
		
		System.out.println("a " + c + " b");

	}

}
