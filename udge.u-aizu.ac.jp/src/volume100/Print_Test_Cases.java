package volume100;

public class Print_Test_Cases {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int n = 1;
		String s = "";
		while( !"0".equals(s = sc.nextLine())){
			System.out.println("Case " + n +": " + s);
			n++;
		}
		sc.close();

	}

}
